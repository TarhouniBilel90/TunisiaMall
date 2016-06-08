package com.esprit.service;

import java.util.List;

import javax.ejb.Remote;


import com.esprit.entity.SousCategorie;

@Remote
public interface SousCategorieServiceRemote {

	void createSousCategorie(SousCategorie souscategorie);
	void desactiverSousCategorie(SousCategorie souscategorie);
	void modifierSousCategorie(SousCategorie souscategorie);
	List <SousCategorie> findAllSousCategorie();
	
}
