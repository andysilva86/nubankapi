package br.com.fiap.grupo13.nubankapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.grupo13.nubankapi.domain.TransacaoCliente;
import br.com.fiap.grupo13.nubankapi.exception.TransacaoException;
import br.com.fiap.grupo13.nubankapi.repository.TransacaoRepository;

@Service
public class TransacaoService {
	
	@Autowired
	private TransacaoRepository transacaoRepository;
	
	public List<TransacaoCliente> buscaListaTransacao(int userId) {
		List<TransacaoCliente> listaTransacao = transacaoRepository.findByIdConta(userId);

		if(listaTransacao == null) {
			throw new TransacaoException("Este cliente nao tem transacaoes cadastradas"); 
		}
		return listaTransacao;
	}
}