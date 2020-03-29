package br.com.fiap.grupo13.nubankapi.exception;

public class CreditoFacilException extends RuntimeException {
	
	private static final long serialVersionUID =1L;
	public CreditoFacilException(String mensagem) {
		super(mensagem);
	}
}
