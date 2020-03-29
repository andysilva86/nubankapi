package br.com.fiap.grupo13.nubankapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.fiap.grupo13.nubankapi.domain.Autenticacao;
import br.com.fiap.grupo13.nubankapi.domain.Cliente;
import br.com.fiap.grupo13.nubankapi.domain.TransacaoCliente;
import br.com.fiap.grupo13.nubankapi.domain.TransacaoFutura;
import br.com.fiap.grupo13.nubankapi.exception.ClienteException;
import br.com.fiap.grupo13.nubankapi.exception.CreditoFacilException;
import br.com.fiap.grupo13.nubankapi.model.AutenticacaoPOJO;
import br.com.fiap.grupo13.nubankapi.model.CreditoFacilPOJO;
import br.com.fiap.grupo13.nubankapi.service.ContaCorrenteService;
import br.com.fiap.grupo13.nubankapi.service.CreditoFacilService;
import br.com.fiap.grupo13.nubankapi.service.LoginService;
import br.com.fiap.grupo13.nubankapi.service.ManualAPIService;
import br.com.fiap.grupo13.nubankapi.service.TransacaoFuturaService;
import br.com.fiap.grupo13.nubankapi.service.TransacaoService;

@RestController
public class ControllerClienteAPI {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private ContaCorrenteService contaCorrenteService;
	
	@Autowired
	private TransacaoService transacaoService;
	
	@Autowired
	private TransacaoFuturaService transacaoFuturaService;
	
	@Autowired
	private CreditoFacilService creditoFacilService;
		
	// ENDPOINT DO MANUAL DA API
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getControllerInicialAPI() {
		ManualAPIService manual = new ManualAPIService();
		return manual.getManual();
	}

	// ENDPOINT PARA CHAMADA VALIDACAO USUARIO NA BASE DE DADOS
	@PostMapping(value = "/autenticacao", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getControllerAutenticacaoAPI(@RequestBody String autencicacao) {
		Gson g = new Gson();
		AutenticacaoPOJO autDados = g.fromJson(autencicacao, AutenticacaoPOJO.class);
		Autenticacao login = null;
		try {
			login = loginService.buscaLogin(autDados.getUser(), autDados.getPassword());
		}catch (ClienteException c) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(login);
	}
	
	// ENDPOINT PARA RECUPERAR SALDO E FLAG CREDITO FACIL	
	@GetMapping(value = "/conta-corrente", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getControllerContaCorrenteAPI(@RequestParam("userId") int userId) {
		Cliente contaCorrente = null;
		try {
			contaCorrente = contaCorrenteService.buscaSaldoFlag(userId);
		}catch (ClienteException c) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(contaCorrente);
	}
	
	// ENDPOINT PARA RECUPERAR LISTA TRANSACOES
	@GetMapping(value = "/conta-corrente/transacao", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getControllerTransacaoAPI(@RequestParam("userId") int userId) {
		List<TransacaoCliente> listaTransacao = null;
		try {
			listaTransacao = transacaoService.buscaListaTransacao(userId);
		}catch (ClienteException c) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(listaTransacao);
	}
	
	// ENDPOINT PARA RECUPERAR LISTA TRANSACOES FUTURAS
	@GetMapping(value = "/conta-corrente/transacao-futura", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getControllerTransacaoFuturaAPI(@RequestParam("userId") int userId) {
		List<TransacaoFutura> listaTransacao = null;
		try {
			listaTransacao = transacaoFuturaService.buscaListaTransacao(userId);
		}catch (ClienteException c) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(listaTransacao);
	}

	// ENDPOINT PARA CHAMADA VALIDACAO USUARIO NA BASE DE DADOS
	@PostMapping(value = "conta-corrente/credito-facil", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getControllerCreditoFacilAPI(@RequestBody String creditoFacil) {
		Gson g = new Gson();
		CreditoFacilPOJO crFacilDados = g.fromJson(creditoFacil, CreditoFacilPOJO.class);
		try {
			creditoFacilService.inserirProposta(crFacilDados.getUserId(),crFacilDados.getValue(),crFacilDados.getQtyMonth());
		}catch (CreditoFacilException c) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body("result");
	}

}