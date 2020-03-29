package br.com.fiap.grupo13.nubankapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TBL_TRANSACAO")
@JsonIgnoreProperties(ignoreUnknown = true, value = {"idConta"})
public class TransacaoCliente {
	
	@Id
	@JsonIgnore
	@Column(name="ID_TRANSACAO") 
	private int idTransacao;
	
	@JsonIgnore
	@Column(name="ID_CONTA") 
	private int id;
	
	@Column(name="DESCRICAO_T") 
	private String description;
	
	@Column(name="VALOR_T") 
	private float value;
	
	@Column(name="DATA_T") 
	private Date date;

	public TransacaoCliente() {
		
	}
	
	public TransacaoCliente(final int idTransacao, 
							final int id,
							final String description, 
							final float value,
							final Date date) {
		this.idTransacao = idTransacao;
		this.id = id;
		this.description = description;
		this.value = value;
		this.date = date;
	}

	public int getIdTransacao() {
		return idTransacao;
	}

	public void setIdTransacao(int idTransacao) {
		this.idTransacao = idTransacao;
	}

	public int getIdConta() {
		return id;
	}

	public void setIdConta(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}