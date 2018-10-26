package main;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import br.unitins.topicos2.factory.JPAFactory;
import model.Cliente;
import model.Pessoa;
import model.Produto;
import model.Telefone;

public class Teste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Joaozinho");
		p.setTelefone(new ArrayList<Telefone>());
		Telefone t1 = new Telefone();
		t1.setCodigoArea("63");
		t1.setNumero("999999");
		t1.setPessoa(p);
		p.getTelefone().add(t1);
		
		Cliente c1 = new Cliente();
		c1.setProfissao("Servidor Publico");
		c1.setPessoa(p);
		
		Produto p1 = new Produto(); 
		p1.setNome("Cerveja");
		
		Produto p2 = new Produto(); 
		p2.setNome("Fralda");
		
		c1.setListaDesejo(new ArrayList<Produto>());
		c1.getListaDesejo().add(p1);
		c1.getListaDesejo().add(p2);
		
		EntityManager em = JPAFactory.getEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(c1);
		em.getTransaction().commit();
		em.close();

	}

}
