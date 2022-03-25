package br.com.fiap.jpa.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.MusicaDao;
import br.com.fiap.jpa.dao.impl.MusicaDaoImpl;
import br.com.fiap.jpa.entity.GeneroMusica;
import br.com.fiap.jpa.entity.Musica;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.ValidarException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class Exemplo {

	public static void main(String[] args) {
		//Obter uma fabrica
		EntityManagerFactory Factory = EntityManagerFactorySingleton.getInstance();
		
		//Obter um EntityManager
		EntityManager em = Factory.createEntityManager();
			
		//Instanciar uma Múscia
		Musica Music = new Musica("Happy Now", GeneroMusica.POP, new GregorianCalendar(2010, Calendar.FEBRUARY, 15), "4.58", "Kygo", 458);
		
		
		// Instanciar o objeto MusicaDAOImpl
		MusicaDao MD = new MusicaDaoImpl(em);
		
		
		
		//Cadastrar
		try {
			MD.cadastrar(Music);
			MD.commit();
		} catch(CommitException e) {
			System.out.println(e.getMessage());
		}

		//Pesquisar pela PK
		try{
			//Pesquisar pela PK
			Musica Buscar = MD.pesquisar(1);
			//Exibir o nome
			System.out.println(Music.getNome());
			
		}catch(ValidarException e){
			System.out.println(e.getMessage());
		}
		
		//Atualizar a musica
		
		try {
			Music.setNome("Kiss Kiss");
			MD.atualizar(Music);
			MD.commit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Remover
		try {
			MD.remover(1);
			MD.commit();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Fechar a em e a Factory
		em.close();
		Factory.close();
	}
}