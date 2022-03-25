package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.ValidarException;

public interface GenericDao <T, K>{
	/*
	 * T -> Define o tipo da Entidade
	 * K -> define o tipo de Chave Primária
	 */
	void Cadastrar(T Entidade);
	
	void Atualizar(T Entidade);
	
	void remover(K id) throws ValidarException;
	
	T pesquisar(K id) throws ValidarException;
	
	void commit() throws CommitException;
	
}
