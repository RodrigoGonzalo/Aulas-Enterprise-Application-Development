package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;

import java.math.BigDecimal;
import java.util.List;

import dominio.Veiculo;

public class ExcluindoVeiculo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja-veiculos");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // h� a necessidade de se fazer uma transa��o ao inserir algo no bd

		Veiculo veiculo = em.find(Veiculo.class, 1L);
		em.remove(veiculo);
		
		em.getTransaction().commit();

		System.out.println("pronto!");
		em.close(); // fechando...
		emf.close();

	}

}
