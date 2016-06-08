package com.esprit.service;

import java.util.List;

import javax.ejb.Local;

import com.esprit.entity.Commande;

@Local
public interface CommandeServiceLocal {
	
	void createCommande(Commande commande);
	void desactiverCommande(Commande commande);
	void modifierCommande(Commande commande);
	List <Commande> findAllCommande();

}
