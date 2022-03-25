package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.GenericDao;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.ValidarException;

public class GenericDaoImpl<T, K> implements GenericDao<T, K>{
	
	private EntityManager em;
	
	public GenericDaoImpl(EntityManager em) {
		this.em = em;
	}
	
	

	public void Cadastrar(T Entidade) {
		// TODO Auto-generated method stub
		em.persist(Entidade);
	}

	public void Atualizar(T Entidade) {
		// TODO Auto-generated method stub
		em.merge(Entidade);
	}

	public void remover(K id) throws ValidarException {
		// TODO Auto-generated method stub
		T Entidade = pesquisar(id);
		em.remove(id);
	}

	public T pesquisar(K id) throws ValidarException {
		// TODO Auto-generated method stub
		T Entidade = em.find(T.class, id);
		if(Entidade == null) {
			throw new ValidarException();
		}
		return Entidade;
	}

	public void commit() throws CommitException {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();

		}catch(Exception e) {
			em.getTransaction().rollback();
		}
	}
	
	
	
}
