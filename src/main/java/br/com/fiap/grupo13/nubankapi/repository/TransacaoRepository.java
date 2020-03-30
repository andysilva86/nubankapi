package br.com.fiap.grupo13.nubankapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fiap.grupo13.nubankapi.domain.TransacaoCliente;

public interface TransacaoRepository extends JpaRepository<TransacaoCliente, Long>{

	  @Query("SELECT t FROM TransacaoCliente t WHERE t.id = ?1")
	   public  List<TransacaoCliente> findByIdConta(int userId);

}