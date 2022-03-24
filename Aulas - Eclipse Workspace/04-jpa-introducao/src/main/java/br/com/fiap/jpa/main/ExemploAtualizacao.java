package br.com.fiap.jpa.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Cliente;
import br.com.fiap.jpa.entity.Genero;

public class ExemploAtualizacao {
	
	public static void main(String[] args) {
		//Obter uma fabrica 
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Obter um entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar um cliente com os dados e o c√≥digo que existe no banco (detached)
		Cliente cliente = new Cliente(1, "Jo„o", new GregorianCalendar(2000, Calendar.JULY, 4), 
				Genero.MASCULINO, null, "gustavo@fiap.com.br", "(11) 9232-1294", "Av Lins", "12.323.312-22", true);
		
		//Atualizar o cliente
		Cliente gerenciado = em.merge(cliente);
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.out.println("Cliente atualizado!");
		
		gerenciado.setCpf("99999999999");
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar os recursos
		em.close();
		fabrica.close();
		
	}
}