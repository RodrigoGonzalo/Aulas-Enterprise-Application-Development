package br.com.fiap.aplicacao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dominio.TipoCombustivel;
import br.com.fiap.dominio.Veiculo;

public class VeiculoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criando o Entity Manager e o Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("lojaVeiculo-jpa");
		EntityManager em = emf.createEntityManager();
		
		// Persistir dados
		em.getTransaction().begin();
		
		/*
		// Pesistir Dados
		Veiculo veiculo = new Veiculo();
		veiculo.setFabricante("Honda");
		veiculo.setModelo("Civic");
		veiculo.setAnoFabricacao(2020);
		veiculo.setAnoModelo(2020);
		veiculo.setValor(new BigDecimal(90500));
		*/
		
		// Persistindo com o Tipo do Combustível!!!
		Veiculo veiculo = new Veiculo();
		veiculo.setFabricante("Honda");
		veiculo.setModelo("Civic");
		veiculo.setAnoFabricacao(2020);
		veiculo.setAnoModelo(2020);
		veiculo.setValor(new BigDecimal(90500));
		veiculo.setTipoCombustivel(TipoCombustivel.BIOCOMBUSTIVEL);
		
		
		/*
		// parte i - Chaves compostas
		Veiculo veiculo = new Veiculo();
		veiculo.setCodigo(new VeiculoId("ABC-1234", "Uberlândia"));
		veiculo.setFabricante("Honda");
		veiculo.setModelo("Civic");
		veiculo.setAnoFabricacao(2020);
		veiculo.setAnoModelo(2020);
		veiculo.setValor(new BigDecimal(71_300));		
		em.persist(veiculo);
		*/
		
		
		em.persist(veiculo);
		em.getTransaction().commit();
		
		
		//Fechando o Entity Manager e o Factory
		System.out.println("Conectado e executado com sucesso!!!");
		em.close();
		emf.close();
	}

}
