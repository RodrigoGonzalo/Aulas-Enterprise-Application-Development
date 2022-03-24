package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;
import br.com.fiap.exception.SaldoInsuficienteException;

public class Exercicio {
	
	public static void main(String[] args) {
		//Instanciar uma conta corrente
		ContaCorrente cc = new ContaCorrente(123, 1, new GregorianCalendar(1999, Calendar.JUNE, 16), 100, TipoConta.COMUM);
		
		//Instanciar uma conta poupança
		ContaPoupanca cp = new ContaPoupanca(231, 1, Calendar.getInstance(), 100, 5);
		
		//Chamar o método depositar da cc
		cc.depositar(100);
		
		//Exibir o saldo
		System.out.println("Saldo da cc: " + cc.getSaldo());
		
		//Chamar o método depositar da poupança
		cp.depositar(100);
		
		//Exibir o saldo
		System.out.println("Saldo da poupança: " + cp.getSaldo());
		try {
			//Chamar o método retirar da cc
			cc.retirar(250);
			
			//Exibir o saldo
			System.out.println("Novo saldo da cc: " + cc.getSaldo());
		} catch (SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}
		try {
			//Chamar o método retirar da poupança
			cp.retirar(200);
			
			//Exibir o saldo
			System.out.println("Novo saldo da poupança: " + cp.getSaldo());
		} catch (SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}
		
		//Criar uma lista de conta corrente
		List<ContaCorrente> lista = new ArrayList<>();
		
		//Adicionar 3 contas
		lista.add(cc);
		lista.add(new ContaCorrente(123, 2, new GregorianCalendar(2020, Calendar.JANUARY, 2), 190, TipoConta.COMUM));
		lista.add(new ContaCorrente(423, 2, new GregorianCalendar(2010, Calendar.AUGUST, 19), 89, TipoConta.ESPECIAL));
		
		//Exibir o saldo das contas
		System.out.println("Saldos:");
		for (ContaCorrente churros : lista) {
			System.out.println(churros.getSaldo());
		}
		
	}//main
}//class