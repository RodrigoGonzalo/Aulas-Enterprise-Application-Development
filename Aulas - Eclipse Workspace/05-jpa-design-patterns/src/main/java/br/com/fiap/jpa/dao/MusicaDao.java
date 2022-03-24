package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.entity.Musica;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.IdNotFoundException;

public interface MusicaDao {

	Musica pesquisar(Integer id) throws IdNotFoundException;
	
	void cadastrar(Musica musica);
	
	void atualizar(Musica musica) throws IdNotFoundException;
	
	void remover(Integer id) throws IdNotFoundException;
	
	void commit() throws CommitException;
	
}
