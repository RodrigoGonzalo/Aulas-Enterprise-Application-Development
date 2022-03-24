package br.com.fiap.jpa.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Cliente;
import br.com.fiap.jpa.entity.Genero;

public class ExemploCadastro {
	
	public static void main(String[] args) {
		//Obter a fabrica de entidades
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Obter o entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar um Cliente (Construtor sem codigo, dataCadastro, idade)
		Cliente cliente = new Cliente("Rafa Desiderio", new GregorianCalendar(2000, Calendar.JANUARY, 10), 
				Genero.MASCULINO, null, "dede2@fiap.com.br", "11 9923-23242", "Av Paulista",
				"123.124.324-23", true);
		
		//Cadastrar um Cliente
		em.persist(cliente);
		
		//Controle de transação
		em.getTransaction().begin(); //começa uma transação
		em.getTransaction().commit(); //realiza o commit
		
		System.out.println("Cliente cadastrado!");
		
		//Alterar algo do cliente
		cliente.setAtivo(false);
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar os recursos
		em.close();
		fabrica.close();
		
	}
}