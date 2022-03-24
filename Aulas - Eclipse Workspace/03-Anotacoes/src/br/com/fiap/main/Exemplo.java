package br.com.fiap.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.model.Cachorro;

public class Exemplo {

	public static void main(String[] args) {
		//Instanciar um cachorro
		Cachorro dog = new Cachorro();
		
		//Exibir o nome da classe
		System.out.println(dog.getClass().getName());
		
		//Recuperar os atributos do objeto
		Field[] atributos = dog.getClass().getDeclaredFields();
		
		System.out.println("ATRIBUTOS");
		//Exibir o nome e o tipo dos atributos
		for(Field churros : atributos) {
			System.out.println(churros.getName() + " - " + churros.getType());
			//Recuperar a anotação @Coluna
			Coluna anotacao = churros.getAnnotation(Coluna.class);
			//Exibir os parâmetros da anotação @Coluna
			System.out.println("Nome: " + anotacao.nome());
			System.out.println("Chave? " + anotacao.chave());
			System.out.println("Tamanho: " + anotacao.tamanho());
			System.out.println("Obrigatório? " + anotacao.obrigatorio() + "\n");
		} 
		
		//Recuperar os métodos do objeto
		Method[] metodos = dog.getClass().getDeclaredMethods();
		
		System.out.println("MÉTODOS");
		//Exibir o nome dos métodos
		for (Method pastel : metodos) {
			System.out.println(pastel.getName());
		}
		
	}//main
}//class