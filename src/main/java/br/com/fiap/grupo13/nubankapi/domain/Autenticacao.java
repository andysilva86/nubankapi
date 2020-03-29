package br.com.fiap.grupo13.nubankapi.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="TBL_LOGIN")
public class Autenticacao {
		
	@JsonInclude
	@Id
	@Column(name="ID_USUARIO") 
	private int idUsuario;
	
	@JsonInclude
	@JsonIgnore
	@Column(name="USUARIO") 
	private String usuario;
	
	@JsonInclude
	@JsonIgnore
	@Column(name="SENHA") 
	private String senha;
	
	@JsonInclude
	@Column(name="STATUS_AUTENTICACAO") 
	private boolean statusAutenticacao;

	public Autenticacao() {
		
	}
	
	public Autenticacao(final int idUsuario, 
					final String usuario, 
					final String senha,
					final boolean statusAutenticacao) {
			this.idUsuario = idUsuario;
			this.usuario = usuario;
			this.senha = senha;
			this.statusAutenticacao = statusAutenticacao;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isStatusAutenticacao() {
		return statusAutenticacao;
	}

	public void setStatusAutenticacao(boolean statusAutenticacao) {
		this.statusAutenticacao = statusAutenticacao;
	}
}