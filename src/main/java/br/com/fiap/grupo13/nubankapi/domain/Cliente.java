package br.com.fiap.grupo13.nubankapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="TBL_CLIENTE")
@JsonIgnoreProperties(ignoreUnknown = true, value = {"idConta"})
public class Cliente {
	
	@Id
	@Column(name="ID_CONTA") 
	private int id;
	
	@JsonIgnore
	@Column(name="NOME") 
	private String nome;

	@JsonIgnore
	@Column(name="SENHA") 
	private String senha;
	
	@JsonInclude
	@Column(name="SALDO") 
	private float balance;
	
	@JsonInclude
	@Column(name="CREDITOFACIL") 
	private boolean easyCredit;
	
	@JsonIgnore
	@Column(name="VALOR") 
	private float value;
	
	
	@JsonIgnore
	@Column(name="QTDMES") 
	private int qtyMonth;
//	
//	@Transient
//	private List<TransacaoCliente> transacaoCliente;

	public Cliente() {
		
	}
	
	public Cliente(final int id, 
					final String nome, 
					final String senha,
					final float balance,
					final boolean easyCredit,
					final float value,
					final int qtyMonth) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.balance = balance;
		this.easyCredit = easyCredit;
		this.value = balance;
		this.qtyMonth = qtyMonth;
	}

	public int getIdConta() {
		return id;
	}

	public void setIdConta(int id) {
		this.id = id;
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

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public boolean isEasyCredit() {
		return easyCredit;
	}

	public void setEasyCredit(boolean easyCredit) {
		this.easyCredit = easyCredit;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public int getQtyMonth() {
		return qtyMonth;
	}

	public void setQtyMonth(int qtyMonth) {
		this.qtyMonth = qtyMonth;
	}

//	public List<TransacaoCliente> getTransacaoCliente() {
//		return transacaoCliente;
//	}
//
//	public void setTransacaoCliente(List<TransacaoCliente> transacaoCliente) {
//		this.transacaoCliente = transacaoCliente;
//	}
	
}
