package br.com.fiap.grupo13.nubankapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.fiap.grupo13.nubankapi.domain.TransacaoFutura;

public interface TransacaoFuturaRepository extends JpaRepository<TransacaoFutura, Long>{

	  @Query("SELECT t FROM TransacaoFutura t WHERE t.id = ?1")
	   public  List<TransacaoFutura> findByIdConta(int userId);
}