package br.com.fiap.grupo13.nubankapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.grupo13.nubankapi.domain.Autenticacao;
import br.com.fiap.grupo13.nubankapi.exception.LoginException;
import br.com.fiap.grupo13.nubankapi.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	public Autenticacao buscaLogin(String usuario, String senha) {
		Autenticacao login = loginRepository.findByUsuarioSenha(usuario, senha);

		if(login == null) {
			throw new LoginException("Dados inseridos errados, verifique usuário e senha"); 
		} else {
			login.setAuthentication(true);
		}
		return login;
	}
}