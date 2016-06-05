package com.esprit.service;

import javax.ejb.Local;

import com.esprit.entity.Client;

@Local
public interface ClientServiceLocal {
	void createClient(Client client);
	

}
