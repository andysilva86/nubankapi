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
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private TransacaoFuturaRepository transacaoFuturaRepository;
	
	public Cliente inserirProposta(int userId, float value, int qtdmes) {
		
		try {
			Cliente clienteSelect = clienteRepository.findByIdConta(userId);
			clienteRepository.atualizarCliente(value + clienteSelect.getBalance(), qtdmes, userId);
			
		}catch(Exception e) {
			throw new ClienteException("Dados nao foram inseridos " + e); 
		}
		Cliente proposta = clienteRepository.findByIdConta(userId);

		if(proposta == null) {
			throw new ClienteException("Dados nao foram inseridos"); 
		}
		
		float calculoParcela = value/qtdmes;
		System.out.println("Saida valor " + value);
		System.out.println("Saida mes " + qtdmes);
		System.out.println("Saida parcela " + calculoParcela);
		String descCreditoFacil = "Credito Facil Contrato";
		
		
		
		for (int i = 0; i < qtdmes; i++) {
			TransacaoFutura insereCreditoFacil = new TransacaoFutura();
			insereCreditoFacil.setDescription(descCreditoFacil);
			insereCreditoFacil.setIdConta(userId);
			insereCreditoFacil.setValue(calculoParcela);
			
			LocalDate dataHoje = LocalDate.now();
			LocalDate somaMes = dataHoje.plusMonths(i+1);
			System.out.println("Saida i " + i);
			System.out.println("Saida somames " + somaMes);
			insereCreditoFacil.setDate(somaMes);
			transacaoFuturaRepository.save(insereCreditoFacil);
		}
		
		return proposta;
	}
}