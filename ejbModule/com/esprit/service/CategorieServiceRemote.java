package com.esprit.service;

import java.util.List;

import com.esprit.entity.Categorie;
 

public interface CategorieServiceRemote {
	
	void createCategorie (Categorie categorie);
	void desactiverCategorie (Categorie categorie);
	void modifierCategorie (Categorie categorie);
	List <Categorie> findAllcategorie();
	void saveCategorie (Categorie categorie);

}
