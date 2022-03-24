package br.com.fiap.revisao.model;

public class Registro {

	//CTRL + 3 -> ggas (Generate Getters and Setters)
	
	private long numero;
	
	private int anoVencimento;

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public int getAnoVencimento() {
		return anoVencimento;
	}

	public void setAnoVencimento(int anoVencimento) {
		this.anoVencimento = anoVencimento;
	}
	
}
