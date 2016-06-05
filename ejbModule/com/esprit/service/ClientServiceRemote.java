package com.esprit.service;

import javax.ejb.Remote;

import com.esprit.entity.Client;

@Remote
public interface ClientServiceRemote {
	void createClient(Client client);
}
