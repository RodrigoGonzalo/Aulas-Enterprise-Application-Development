package br.com.fiap.jpa.exception;

public class ValidarException extends Exception {

	public ValidarException() {
		super("Id n�o encontrado");
	}

	public ValidarException (String message) {
		super(message);
	}
	
}