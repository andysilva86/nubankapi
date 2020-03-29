package br.com.fiap.grupo13.nubankapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fiap.grupo13.nubankapi.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    @Query("SELECT t FROM Cliente t WHERE t.idConta = ?1 AND t.senha = ?2")
    public  Cliente findByContaSenha(int idConta, String senha);
}