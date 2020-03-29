package br.com.fiap.grupo13.nubankapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fiap.grupo13.nubankapi.domain.Autenticacao;

public interface LoginRepository extends JpaRepository<Autenticacao, Long>{

	  @Query("SELECT t FROM Autenticacao t WHERE t.usuario = ?1 AND t.senha = ?2")
	   public  Autenticacao findByUsuarioSenha(String usuario, String senha);
}