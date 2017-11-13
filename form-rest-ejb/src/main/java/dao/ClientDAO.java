package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Client;

@Stateless
public class ClientDAO {

	@PersistenceContext(unitName = "cliente")
	private EntityManager em;

	public void insert(Client cli) {
		em.persist(cli);
	}

	public List<Client> listAll() {
		return em.createQuery("from clientes p", Client.class).getResultList();
	}

}