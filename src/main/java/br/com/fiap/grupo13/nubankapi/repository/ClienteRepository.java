package br.com.fiap.grupo13.nubankapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fiap.grupo13.nubankapi.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	  @Query("SELECT t FROM Cliente t WHERE t.id = ?1")
	   public  Cliente findByIdConta(int userId);
}