package br.com.fiap.revisao.model;

//Herança
//Object <- Carro <- Van

//É herança? É um?
//É um atributo? Tem um?
public class Van extends Carro {

	//Atributos (mercadoria ou passageiro)
	private boolean mercadoria;
	
	//A van tem um registro..
	private Registro registro;
	
	//Construtores, são herdados? Não!
	//O construtor da classe filha precisa chamar um construtor do pai
	public Van(String marca, int ano, double km) {
		super(marca, ano, km); //Chama o construtor do pai
	}

	//Criar o construtor com todos os atributos
	public Van(String marca, int ano, double km, String modelo, 
									boolean arCondicionado, boolean mercadoria) {
		super(marca, ano, km, modelo, arCondicionado);
		this.mercadoria = mercadoria;
	}
	
	//Sobrescrever o método toString() para adicionar a mercadoria
	public String toString() {
		return super.toString() + (mercadoria?" Mercadoria" : " Passageiro");
	}
	
	//Métodos
	//Sobrescrita (Override) -> mesmo método do pai na classe filha
	public void darPartida() {
		System.out.println("Van dando partida...");
	}
	
	//Getters e Setters
	public boolean isMercadoria() {
		return mercadoria;
	}

	public void setMercadoria(boolean mercadoria) {
		this.mercadoria = mercadoria;
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}
	
}