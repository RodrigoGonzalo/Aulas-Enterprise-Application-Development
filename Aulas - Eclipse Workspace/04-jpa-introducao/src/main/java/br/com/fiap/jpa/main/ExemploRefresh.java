package br.com.fiap.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Cliente;

public class ExemploRefresh {
	
	public static void main(String[] args) {
		//Obter a fabrica de entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		//Obter o entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar o cliente pela PK
		Cliente cliente = em.find(Cliente.class, 1);
		
		//Exibir o nome do cliente
		System.out.println(cliente.getNome());
		
		//Alterar no java o nome do cliente
		cliente.setNome("Jorge");
		
		//Exibir o nome do cliente
		System.out.println(cliente.getNome());
		
		//Chamar o refresh
		em.refresh(cliente);
		
		//Exibir o nome do cliente
		System.out.println(cliente.getNome());
		
		//Fechar
		em.close();
		fabrica.close();
	}
}
