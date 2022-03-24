package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.MusicaDao;
import br.com.fiap.jpa.entity.Musica;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.IdNotFoundException;

public class MusicaDaoImpl implements MusicaDao {
	
	private EntityManager em;
	
	public MusicaDaoImpl(EntityManager em) {
		this.em = em;
	}

	public Musica pesquisar(Integer id) throws IdNotFoundException {
		//Pesquisar a musica no banco
		Musica musica = em.find(Musica.class, id);
		//Validar se a musica não existe (se é igual null)
		if (musica == null)
			//Se existir, lançar uma exception
			throw new IdNotFoundException(); 
		//Se não existir, Retorna a musica
		return musica;
	}

	public void cadastrar(Musica musica) {
		em.persist(musica);
	}

	public void atualizar(Musica musica) throws IdNotFoundException {
		//validar se a musica existe no banco, para ser atualizado
		pesquisar(musica.getCodigo()); 
		em.merge(musica);
	}

	public void remover(Integer id) throws IdNotFoundException {
		Musica musica = pesquisar(id);
		em.remove(musica);
	}

	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new CommitException();
		}
	}
}
