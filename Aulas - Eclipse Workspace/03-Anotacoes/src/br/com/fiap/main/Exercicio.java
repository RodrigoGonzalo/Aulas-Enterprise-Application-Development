package br.com.fiap.main;

import br.com.fiap.model.Aluno;
import br.com.fiap.model.Cachorro;
import br.com.fiap.orm.Orm;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar um aluno
		Aluno aluno = new Aluno();
		
		//Instanciar um Orm
		Orm orm = new Orm();
		
		//Chamar o método pesquisar e exibir o resultado
		System.out.println(orm.pesquisar(aluno));
		
		//Instanciar um cachorro
		Cachorro dog = new Cachorro();
		
		//Chamar o método pesquisar passando o cachorro
		System.out.println(orm.pesquisar(dog));
		
	}
}