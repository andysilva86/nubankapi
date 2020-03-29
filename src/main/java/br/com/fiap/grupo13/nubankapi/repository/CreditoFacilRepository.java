package br.com.fiap.grupo13.nubankapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fiap.grupo13.nubankapi.domain.CreditoFacil;

public interface CreditoFacilRepository extends JpaRepository<CreditoFacil, Long>{

	  @Query("SELECT t FROM Cliente t WHERE t.id = ?1")
	   public  CreditoFacil findByIdConta(int userId);
}