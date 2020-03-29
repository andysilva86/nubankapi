package br.com.fiap.grupo13.nubankapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.grupo13.nubankapi.domain.Autenticacao;
import br.com.fiap.grupo13.nubankapi.exception.ClienteException;
import br.com.fiap.grupo13.nubankapi.service.LoginService;
import br.com.fiap.grupo13.nubankapi.service.ManualAPIService;

@RestController
public class ControllerClienteAPI {
	
	@Autowired
	private LoginService loginService;
		
	// ENDPOINT DO MANUAL DA API
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getControllerInicialAPI() {
		ManualAPIService manual = new ManualAPIService();
		return manual.getManual();
	}

	// ENDPOINT PARA CHAMADA VALIDACAO USUARIO NA BASE DE DADOS
	@RequestMapping(value = "/autenticacao", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getControllerAutenticacaoAPI(@RequestParam("usuario") String usuario, @RequestParam("senha") String senha) {
		Autenticacao login = null;
		try {
			login = loginService.buscaLogin(usuario, senha);
		}catch (ClienteException c) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(login);
	}

//	// ENDPOINT PARA CHAMADA ENDPOINT SALDO DO CLIENTE
//	@RequestMapping(value = "/saldo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<?> getControllerCreditoFacilAPI(@RequestParam("conta") int conta, @RequestParam("senha") String senha){
//		Cliente login = null;
//		try {
//			login = loginService.buscaLogin(conta, senha);
//		}catch (ClienteException c) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		}
//		return ResponseEntity.status(HttpStatus.OK).body(login);
//	}
}