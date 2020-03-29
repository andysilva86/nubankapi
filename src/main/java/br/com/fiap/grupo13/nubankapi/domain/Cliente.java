package br.com.fiap.grupo13.nubankapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="TBL_CLIENTE")
public class Cliente {
	
	@JsonInclude
	@Id
	@Column(name="ID_CONTA") 
	private int idConta;
	
	@JsonInclude
	@Column(name="NOME") 
	private String nome;
	
	@JsonInclude
	@Column(name="SENHA") 
	private String senha;
	
	@JsonInclude
	@Column(name="SALDO") 
	private double saldo;
	
	@JsonInclude
	@Column(name="FEATURE") 
	private boolean featureCliente;
//	
//	@Transient
//	private List<TransacaoCliente> transacaoCliente;

	public Cliente() {
		
	}
	
	public Cliente(final int idConta, 
					final String nome, 
					final String senha,
					final double saldo,
					final boolean featureCliente) {
		this.idConta = idConta;
		this.nome = nome;
		this.senha = senha;
		this.saldo = saldo;
		this.featureCliente = featureCliente;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isFeatureCliente() {
		return featureCliente;
	}

	public void setFeatureCliente(boolean featureCliente) {
		this.featureCliente = featureCliente;
	}

//	public List<TransacaoCliente> getTransacaoCliente() {
//		return transacaoCliente;
//	}
//
//	public void setTransacaoCliente(List<TransacaoCliente> transacaoCliente) {
//		this.transacaoCliente = transacaoCliente;
//	}
	
}
