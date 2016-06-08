package com.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.entity.Categorie;
 

@Remote
public interface CategorieServiceRemote {
	
	void createCategorie (Categorie categorie);
	void desactiverCategorie (Categorie categorie);
	void modifierCategorie (Categorie categorie);
	List <Categorie> findAllcategorie();


}
