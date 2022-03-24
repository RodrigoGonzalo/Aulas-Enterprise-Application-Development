package br.com.fiap.revisao.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Revisao {

	//Atributos
	private LocalDate data;
	
	private double valor;
	
	private double km;

	//CTRL + 3 -> gcuf
	//Construtor
	public Revisao(LocalDate data, double valor, double km) {
		super();
		this.data = data;
		this.valor = valor;
		this.km = km;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Data: " + data.format(formato) + " Valor: " + valor + " KM: " + km;
	}
	
	//CTRL + 3 -> ggas
	//Getters e Setters
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
	
}