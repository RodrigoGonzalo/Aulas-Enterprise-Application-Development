package br.com.fiap.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.fiap.jpa.entity.Cliente;

public class ExemploPesquisa {

	//Pesquisar um cliente pela PK
	public static void main(String[] args) {
		//Obter a fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Obter o entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar o cliente de código 1
		Cliente cliente = em.find(Cliente.class, 33); //(Entidade, PK)
		
		//Exibir os dados do cliente
		System.out.println(cliente.getNome());
		
		//Alterar o nome do cliente
		cliente.setNome("Isabela");
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar os recursos
		em.close();
		fabrica.close();
		
	}
}