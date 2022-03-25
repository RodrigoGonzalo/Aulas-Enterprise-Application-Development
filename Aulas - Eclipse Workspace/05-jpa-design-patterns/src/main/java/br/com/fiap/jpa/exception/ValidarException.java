package br.com.fiap.jpa.exception;

public class ValidarException extends Exception {

	public ValidarException() {
		super("Id não encontrado");
	}

	public ValidarException (String message) {
		super(message);
	}
	
}