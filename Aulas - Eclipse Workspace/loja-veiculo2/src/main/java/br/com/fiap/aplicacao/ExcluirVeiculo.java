package br.com.fiap.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dominio.Veiculo;


public class ExcluirVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("lojaVeiculo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		Veiculo veiculo = em.find(Veiculo.class, 1L);
		em.remove(veiculo);
		
		em.getTransaction().commit();

		System.out.println("Commit realizado com sucesso!!!");
		em.close();
		emf.close();
	}

}
