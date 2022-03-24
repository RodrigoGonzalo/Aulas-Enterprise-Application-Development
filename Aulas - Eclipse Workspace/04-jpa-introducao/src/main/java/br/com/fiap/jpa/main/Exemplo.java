package br.com.fiap.jpa.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica =  //nome da persistence unit no arquivo persistence.xml
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		fabrica.close();
	}
}