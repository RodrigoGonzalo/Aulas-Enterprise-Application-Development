package br.com.fiap.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dominio.Veiculo;

public class BuscandoVeiculo2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("lojaVeiculo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		Veiculo veiculo = em.getReference(Veiculo.class, 1L);
		System.out.println("C�digo do Ve�culo: " + veiculo.getCodigo() + " � um " + veiculo.getModelo());

		em.getTransaction().commit();

		System.out.println("Commit realizado com sucesso!!!");
		em.close();
		emf.close();
	}
}
