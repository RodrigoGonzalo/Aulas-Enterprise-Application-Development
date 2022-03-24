package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {
	
	//Atributo
	private TipoConta tipo;
	 
	//Construtores CTRL + 3 -> gcuf
	public ContaCorrente() {}
	
	public ContaCorrente(int numero, int agencia, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(numero, agencia, dataAbertura, saldo);
		this.tipo = tipo;
	}

	//Métodos
	
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		//Validar se a conta é comum e o saldo fica negativo depois do saque
		if (tipo == TipoConta.COMUM && saldo < valor) {
			//Lançar a exception
			//Exception -> checked, validadas em tempo de compilação, obriga o tratamento/lançamento
			//RuntimeException -> unchecked, exception de tempo de execução, não obriga...
			throw new SaldoInsuficienteException(saldo);
		}
		saldo -= valor;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

}