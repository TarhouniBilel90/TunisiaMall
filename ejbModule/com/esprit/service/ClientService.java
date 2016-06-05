package com.esprit.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.entity.Client;

public class ClientService implements ClientServiceLocal,ClientServiceRemote{
	@PersistenceContext
    EntityManager entityManager;
	@Override
	public void createClient(Client client) {
		// TODO Auto-generated method stub
		entityManager.persist(client);
	}

}
