package br.com.fiap.grupo13.nubankapi.service;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.grupo13.nubankapi.domain.Cliente;
import br.com.fiap.grupo13.nubankapi.domain.TransacaoFutura;
import br.com.fiap.grupo13.nubankapi.exception.ClienteException;
import br.com.fiap.grupo13.nubankapi.repository.ClienteRepository;
import br.com.fiap.grupo13.nubankapi.repository.TransacaoFuturaRepository;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CreditoFacilService {
	
	String descCreditoFacil = "Crédito Contratado";
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private TransacaoFuturaRepository transacaoFuturaRepository;
	
	public Cliente inserirProposta(int userId, float value, int qtdmes) {
		
		Cliente clienteSelect = clienteRepository.findByIdConta(userId);
		
		try {
			
			float saldoAtualizado = value + clienteSelect.getBalance();
//			System.out.println("SAIDA atualizacao " + saldoAtualizado);
			clienteRepository.atualizarCliente(value, qtdmes, saldoAtualizado, userId);
			
		}catch(Exception e) {
			throw new ClienteException("Dados nao foram inseridos " + e); 
		}
		//Calculo valor parcelas
		float calculoParcela = value/qtdmes;
		
		for (int i = 0; i < qtdmes; i++) {
			// Montagem das parcelas na base de transacoes futuras
			TransacaoFutura insereCreditoFacil = new TransacaoFutura();
			insereCreditoFacil.setDescription(descCreditoFacil);
			insereCreditoFacil.setIdConta(userId);
			insereCreditoFacil.setValue(calculoParcela);
			
			LocalDate dataHoje = LocalDate.now();
			LocalDate somaMes = dataHoje.plusMonths(i+1);
			insereCreditoFacil.setDate(somaMes);
			transacaoFuturaRepository.save(insereCreditoFacil);
		}
		
		return clienteSelect;
	}
}