package br.com.fiap.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dominio.Veiculo;

public class BuscandoVeiculo3 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("lojaVeiculo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		Veiculo veiculo = em.getReference(Veiculo.class, 3L);
		System.out.println("Buscou o Veículo, mas será que executou o SELECT ?");
		System.out.println("Código do Veículo: " + veiculo.getCodigo() + " é um " + veiculo.getModelo());

		
		em.getTransaction().commit();

		System.out.println("Commit realizado com sucesso!!!");
		em.close();
		emf.close();
	}
}
