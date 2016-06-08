package com.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.entity.Commande;

@Remote
public interface CommandeServiceRemote {
	
	void createCommande(Commande commande);
	void desactiverCommande(Commande commande);
	void modifierCommande(Commande commande);
	List <Commande> findAllCommande();

}
