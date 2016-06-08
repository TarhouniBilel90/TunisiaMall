package com.esprit.service;

import java.util.List;
import javax.ejb.Local;
import com.esprit.entity.Client;

@Local
public interface ClientServiceLocal {
	
	void createClient(Client client);
	void desactiverClient (Client client);
	void modifierClient (Client client);
	List <Client> findAllClient();

}
