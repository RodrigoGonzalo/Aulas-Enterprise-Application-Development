package br.com.fiap.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {
		
	Pessoa fulano = new Pessoa("Isaías Castelo Espírito Santo", "isaisascastelo@yahoo.com");
	Pessoa beltrano = new Pessoa("Augusto Cavalcanti", "cavalcantiaugusto@hotmail.com");
	Pessoa ciclano = new Pessoa("Guilherme Azevedo", "guiazevedo@gmail.com");
	
	/*
	System.out.println(fulano);
	System.out.println(beltrano);
	System.out.println(ciclano);
	*/
	
	// Criando o EntityManager
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	EntityManager em = emf.createEntityManager();
	
	// Persistir as pessoa criadas no banco
	// Há necessidade de fazer uma transação ao inserir algo no banco
	em.getTransaction().begin();
	em.persist(fulano);
	em.persist(beltrano);
	em.persist(ciclano);
	em.getTransaction().commit();
	
	System.out.println("Concetado e Inserido");
	em.close();
	emf.close();
	}
	
	//Remove
	/*
	 * em.getTransaction().begin()
	 * em.remove(id);
	 * em.getTransaction().commit()
	 */
	
	// Pessoa p = em.find(Pessoa.class, 2)

}
