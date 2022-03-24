package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaPoupanca extends Conta implements ContaInvestimento {
	
	//Atributo
	private float taxa;
	
	//Constante
	//final: 
	//	atributo -> não permite modificar o valor, 
	//	método -> não permite a sobrescrita
	//	classe -> não permite a herança
	//static: define o elemento como da classe e não do objeto
	public static final float RENDIMENTO = 0.05f;
	
	//Construtores
	public ContaPoupanca() {}
	
	public ContaPoupanca(int numero, int agencia, Calendar dataAbertura, double saldo, float taxa) {
		super(numero, agencia, dataAbertura, saldo);
		this.taxa = taxa;
	}

	//Métodos
	@Override 
	public double calculaRetornoInvestimento() {
		return saldo * RENDIMENTO;
	}

	@Override //-> Garantir a sobrescrita
	public void retirar(double valor) throws SaldoInsuficienteException {
		//Valida se o saldo é suficiente para a retirada junto da taxa
		if (saldo < valor + taxa) {
			throw new SaldoInsuficienteException(saldo - taxa);
		}
		saldo -= valor + taxa;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

}
