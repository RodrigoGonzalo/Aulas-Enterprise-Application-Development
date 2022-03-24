package br.com.fiap.orm;

import br.com.fiap.anotacao.Tabela;

public class Orm {

	//1- Criar a anotação @Tabela com o parâmetro nome
	//2- Criar a classe aluno e utilizar a anotação
	//3- Implementar o método pesquisar da classe Orm
	//4- Criar uma classe com o método main para testar o método
	
	/**
	 * Recebe o objeto anotado com @Tabela e retorna o comando SQL
	 * @param obj
	 * @return retorna o SQL para pesquisar os registros de acordo com a tabela
	 */
	public String pesquisar(Object obj) {
		//Recuperar a anotação @Tabela
		Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
		//Recuperar o parâmetro nome da anotação
		String nome = anotacao.nome();
		//Retornar o SQL
		return "SELECT * FROM " + nome;
	}
}