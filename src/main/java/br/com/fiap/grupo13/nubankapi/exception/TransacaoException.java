package br.com.fiap.grupo13.nubankapi.exception;

public class TransacaoException extends RuntimeException {
	
	private static final long serialVersionUID =1L;
	public TransacaoException(String mensagem) {
		super(mensagem);
	}
}
