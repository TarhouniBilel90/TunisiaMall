package com.esprit.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.esprit.entity.Client;

public class ClientService implements ClientServiceLocal,ClientServiceRemote{
	@PersistenceContext
    EntityManager entityManager;

	@Override
	public void createClient(Client client) {
		entityManager.persist(client);
		
	}

	@Override
	public void desactiverClient(Client client) {
		entityManager.remove(client);
		
	}

	@Override
	public void modifierClient(Client client) {
		entityManager.merge(client);
		
	}

	@Override
	public List<Client> findAllClient() {
		return entityManager.createQuery("Select u from client u",Client.class).getResultList();


	}



}
