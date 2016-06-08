package com.esprit.service;

import java.util.List;

import javax.ejb.Local;

import com.esprit.entity.Evenement;

@Local
public interface EvenementServiceLocal {
	
	void createEvenement(Evenement evenement);
	void desactiverEvenement(Evenement evenement);
	void modifierEvenement(Evenement evenement);
	List <Evenement> findAllCommande();

}
