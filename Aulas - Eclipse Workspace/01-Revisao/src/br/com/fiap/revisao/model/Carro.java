package br.com.fiap.revisao.model;

import java.util.List;

public class Carro {
	
	//Modificadore de acesso:
	//private -> somente a classe
	//default/package -> a classe e classes do mesmo pacote
	//protected -> a classe, classes do mesmo pacote e classes filhas
	//public -> todos

	//Atributos
	//Valores padrões: Referência -> null; números -> 0; boolean -> false;
	private String marca;
	private String modelo;
	private int ano;
	private double km;
	private boolean arCondicionado;
	
	private Combustivel combustivel;
	
	private List<Revisao> revisoes;
	
	//Construtor -> método especial utilizado na instanciação da classe
	//1 - Tem o mesmo nome da classe
	//2 - Não tem retorno, nem void
	public Carro(String marca, int ano, double km) {
		this.marca = marca;
		this.ano = ano;
		this.km = km;
	}
	
	//Criar um construtor com todos os atributos
	public Carro(String marca,int ano, double km, String modelo, boolean arCondicionado) {
		this(marca, ano, km); //Chama o construtor de cima, com 3 parâmetros
		this.modelo = modelo;
		this.arCondicionado = arCondicionado;
	}
	
	//Criar um construtor com todos os atributos
	public Carro(String marca, int ano, double km, String modelo, boolean arCondicionado,
			Combustivel combustivel, List<Revisao> revisoes) {
		this(marca, ano, km, modelo, arCondicionado);
		this.combustivel = combustivel;
		this.revisoes = revisoes;
	}
	
	//public Carro() {}
	
	//Métodos
	
	//Sobrescrever o método toString() -> para exibir os dados do carro
	public String toString() {
		return "Marca: " + marca + " Ano: " + ano + " Km: " + km + 
				" Modelo: " + modelo + (arCondicionado?" Ar":" Sem Ar")
				+ " Combustível: " + combustivel;
	}
	
	//Sobrecarga (Overload) -> método com o mesmo nome, mas com parâmetros diferentes
	//Parâmetros diferentes: no tipo do parâmetro ou na quantidade
	public void darPartida(String chave) {
		System.out.println("Carro ligando com a chave " + chave);
	}
	
	public void darPartida(boolean botao) {
		System.out.println("Carro ligando com o botão " + botao);
	}
	
	public void darPartida() {
		System.out.println("Carro ligando...");
	}
	
	public boolean validarZeroKm() {
		//Validar se o carro é zero (menos de 100km)
//		if (km <= 100) {
//			return true;
//		} 
//		return false;
		
		//Operador ternário -> (condição ? se verdadeiro : se falso)
//		return km <= 100 ? true : false;
	
		return km <= 100;
	}
	
	//Getters e Setters - Criar 1 get e 1 set
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public List<Revisao> getRevisoes() {
		return revisoes;
	}

	public void setRevisoes(List<Revisao> revisoes) {
		this.revisoes = revisoes;
	}
	
}