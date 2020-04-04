package br.com.fiap.grupo13.nubankapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import br.com.fiap.grupo13.nubankapi.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	  @Query("SELECT t FROM Cliente t WHERE t.id = ?1")
	   public  Cliente findByIdConta(int userId);
	  
	  @Modifying
	  @Query("UPDATE Cliente t SET t.easyCredit = 'false', t.value = ?1 , t.qtyMonth = ?2, t.balance = ?3 WHERE t.id = ?4")
	  public void atualizarCliente(float value, int qtdmes, float balance, int userId);
	  
}