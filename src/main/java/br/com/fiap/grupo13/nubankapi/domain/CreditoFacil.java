package br.com.fiap.grupo13.nubankapi.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="TBL_LOGIN")
public class CreditoFacil {
		
	@JsonInclude
	@Id
	@Column(name="ID_USUARIO") 
	private int userId;
	
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
	private boolean authentication;

	public CreditoFacil() {
		
	}
	
	public CreditoFacil(final int userId, 
					final String usuario, 
					final String senha,
					final boolean authentication) {
			this.userId = userId;
			this.usuario = usuario;
			this.senha = senha;
			this.authentication = authentication;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public boolean isAuthentication() {
		return authentication;
	}

	public void setAuthentication(boolean authentication) {
		this.authentication = authentication;
	}


}