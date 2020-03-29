package br.com.fiap.grupo13.nubankapi.service;

//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.grupo13.nubankapi.domain.Cliente;
import br.com.fiap.grupo13.nubankapi.exception.ClienteException;
import br.com.fiap.grupo13.nubankapi.repository.ClienteRepository;

@Service
public class LoginService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
//	public List<Cliente> buscaTodos() {
//		return clienteRepository.findAll();
//	}
	
	public Cliente buscaLogin(int idConta, String senha) {
		Cliente cliente = clienteRepository.findByContaSenha(idConta, senha);

		if(cliente == null) {
			throw new ClienteException("Cliente nao encontrado"); 
		}
		return cliente;
	}
}