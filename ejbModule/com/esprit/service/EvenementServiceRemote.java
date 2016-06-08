package com.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.entity.Evenement;

@Remote
public interface EvenementServiceRemote {
	
	void createEvenement(Evenement evenement);
	void desactiverEvenement(Evenement evenement);
	void modifierEvenement(Evenement evenement);
	List <Evenement> findAllCommande();

}
