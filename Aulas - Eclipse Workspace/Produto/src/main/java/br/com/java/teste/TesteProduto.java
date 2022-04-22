package br.com.java.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.java.produto.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criando os Objetos
		Produto prod1 = new Produto("Celular Motorola", 1171);
		Produto prod2 = new Produto("Cafeteira Nescafé", 390.90);
		Produto prod3 = new Produto("Arroz Tio João", 21);
		Produto prod4 = new Produto("Xícara", 10.90);
		Produto prod5 = new Produto("Plano de Internet", 250);
		
		// Criando os EntityManager e o EntityManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("produto-jpa");
		EntityManager em = emf.createEntityManager();
		
		// Persistir os objetos criados no banco de dados
		try {
		em.getTransaction().begin();
		em.persist(prod1);
		em.persist(prod2);
		em.persist(prod3);
		em.persist(prod4);
		em.persist(prod5);
		em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.getMessage();
		}
		
		System.out.println("Conectado e Inserido");
		emf.close();
		em.close();
		
		//Remove
		/*
		 * em.getTransaction().begin()
		 * em.remove(id);
		 * em.getTransaction().commit()
		 */
	}

}
