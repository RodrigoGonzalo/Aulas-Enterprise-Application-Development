package br.com.fiap.aplicacao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dominio.Veiculo;

public class AtualizandoVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("lojaVeiculo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		Veiculo veiculo = em.find(Veiculo.class, 4L);
		
		System.out.println("Valor Atual: " + veiculo.getValor());
		veiculo.setValor(veiculo.getValor().add(new BigDecimal(1000)));
		System.out.println("Novo Valor: " + veiculo.getValor());
		
		em.getTransaction().commit();

		System.out.println("Commit realizado com sucesso!!!");
		em.close();
		emf.close();
	}

}
