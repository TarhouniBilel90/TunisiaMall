package com.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.entity.Client;

@Remote
public interface ClientServiceRemote {

	
	void createClient(Client client);
	void desactiverClient (Client client);
	void modifierClient (Client client);
	List <Client> findAllClient();
}
