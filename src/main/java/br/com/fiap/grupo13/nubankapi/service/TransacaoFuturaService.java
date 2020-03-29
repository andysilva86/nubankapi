package br.com.fiap.grupo13.nubankapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.grupo13.nubankapi.domain.TransacaoFutura;
import br.com.fiap.grupo13.nubankapi.exception.TransacaoException;
import br.com.fiap.grupo13.nubankapi.repository.TransacaoFuturaRepository;

@Service
public class TransacaoFuturaService {
	
	@Autowired
	private TransacaoFuturaRepository transacaoFuturaRepository;
	
	public List<TransacaoFutura> buscaListaTransacao(int userId) {
		List<TransacaoFutura> listaTransacao = transacaoFuturaRepository.findByIdConta(userId);

		if(listaTransacao == null) {
			throw new TransacaoException("Este cliente nao tem transacaoes futuras cadastradas"); 
		}
		return listaTransacao;
	}
}