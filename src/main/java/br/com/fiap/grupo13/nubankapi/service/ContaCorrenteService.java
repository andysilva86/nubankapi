package br.com.fiap.grupo13.nubankapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.grupo13.nubankapi.domain.Cliente;
import br.com.fiap.grupo13.nubankapi.exception.ClienteException;
import br.com.fiap.grupo13.nubankapi.repository.ClienteRepository;

@Service
public class ContaCorrenteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente buscaSaldoFlag(int userId) {
		Cliente contaCorrente = clienteRepository.findByIdConta(userId);

		if(contaCorrente == null) {
			throw new ClienteException("Os dados deste cliente estão inacessiveis no momento"); 
		}
		return contaCorrente;
	}
}