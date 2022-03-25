package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.entity.Musica;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.ValidarException;


public interface MusicaDao {

	Musica pesquisar(Integer id) throws ValidarException;
	
	void cadastrar(Musica musica);
	
	void atualizar(Musica musica) throws ValidarException;
	
	void remover(Integer id) throws ValidarException;
	
	void commit() throws CommitException;
	
}
