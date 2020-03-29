package br.com.fiap.grupo13.nubankapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.grupo13.nubankapi.domain.CreditoFacil;
import br.com.fiap.grupo13.nubankapi.exception.CreditoFacilException;
import br.com.fiap.grupo13.nubankapi.repository.CreditoFacilRepository;


@Service
public class CreditoFacilService {
	
	@Autowired
	private CreditoFacilRepository creditoFacilRepository;
	
	public CreditoFacil inserirProposta(int userId, float value, int qtymes) {
		CreditoFacil proposta = creditoFacilRepository.findByIdConta(userId);

		if(proposta == null) {
			throw new CreditoFacilException("Nao foi possivel inserir a proposta na base"); 
		}
		return proposta;
	}
}