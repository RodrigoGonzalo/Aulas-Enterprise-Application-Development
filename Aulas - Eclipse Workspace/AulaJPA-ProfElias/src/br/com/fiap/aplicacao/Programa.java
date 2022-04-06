package br.com.fiap.aplicacao;

import br.com.fiap.dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {
		
	Pessoa fulano = new Pessoa(1, "Isaías Castelo Espírito Santo", "isaisascastelo@yahoo.com");
	Pessoa beltrano = new Pessoa(2, "Augusto Cavalcanti", "cavalcantiaugusto@hotmail.com");
	Pessoa ciclano = new Pessoa(3, "Guilherme Azevedo", "guiazevedo@gmail.com");
	
	System.out.println(fulano);
	System.out.println(beltrano);
	System.out.println(ciclano);
	
	}

}
