package br.com.fiap.aplicacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.fiap.dominio.Veiculo;

public class ListandoVeiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("lojaVeiculo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		Query query = em.createQuery("select v from tab_veiculo");
		
		List<Veiculo> veiculos = query.getResultList();
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getCodigo() + "-" +
					veiculo.getFabricante() + "-" +
					veiculo.getModelo() + "-" +
					veiculo.getAnoFabricacao()  + "-" +
					veiculo.getAnoModelo() + "por" +
					"R$" + veiculo.getValor());
		}
		
		em.getTransaction().commit();

		System.out.println("Commit realizado com sucesso!!!");
		em.close();
		emf.close();
	}

}
