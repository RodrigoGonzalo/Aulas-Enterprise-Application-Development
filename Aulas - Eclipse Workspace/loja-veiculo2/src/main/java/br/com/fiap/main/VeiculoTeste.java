package br.com.fiap.main;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.veiculo.Veiculo;

public class VeiculoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criando o Entity Manager e o Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("lojaVeiculo-jpa");
		EntityManager em = emf.createEntityManager();
		
		// Persistir dados
		Veiculo veiculo1 = new Veiculo();
		
		veiculo1.setFabricante("Honda");
		veiculo1.setModelo("Civic");
		veiculo1.setAnoFabricacao(2020);
		veiculo1.setAnoModelo(2020);
		veiculo1.setValor(new BigDecimal(90500));
		
		em.persist(veiculo1);
		em.getTransaction().commit();
		
		
		//Fechando o Entity Manager e o Factory
		System.out.println("Conectado e executado com sucesso!!!");
		em.close();
		emf.close();
	}

}
