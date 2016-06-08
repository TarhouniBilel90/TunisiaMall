package com.esprit.service;

import java.util.List;

import javax.ejb.Local;

import com.esprit.entity.SousCategorie;

@Local
public interface SousCategorieServiceLocal {
	
	void createSousCategorie(SousCategorie souscategorie);
	void desactiverSousCategorie(SousCategorie souscategorie);
	void modifierSousCategorie(SousCategorie souscategorie);
	List <SousCategorie> findAllSousCategorie();

}
