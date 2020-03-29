package br.com.fiap.grupo13.nubankapi.domain;

import java.util.Date;

public class TransacaoCliente {
	
	private int idTransacao;
	private int idConta;
	private String descricaoTransacao;
	private long valor;
	private Date dataTransacao;

	public TransacaoCliente() {
		
	}
	
	public TransacaoCliente(final int idTransacao, 
							final int idConta,
							final String descricaoTransacao, 
							final long valor,
							final Date dataTransacao) {
		this.idTransacao = idTransacao;
		this.idConta = idConta;
		this.descricaoTransacao = descricaoTransacao;
		this.valor = valor;
		this.dataTransacao = dataTransacao;
	}

	public int getIdTransacao() {
		return idTransacao;
	}

	public void setIdTransacao(int idTransacao) {
		this.idTransacao = idTransacao;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public String getDescricaoTransacao() {
		return descricaoTransacao;
	}

	public void setDescricaoTransacao(String descricaoTransacao) {
		this.descricaoTransacao = descricaoTransacao;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

	public Date getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(Date dataTransacao) {
		this.dataTransacao = dataTransacao;
	}
}