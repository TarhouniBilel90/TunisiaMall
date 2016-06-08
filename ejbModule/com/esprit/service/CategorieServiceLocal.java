package com.esprit.service;

import java.util.List;

import javax.ejb.Local;

import com.esprit.entity.Categorie;

@Local
public interface CategorieServiceLocal {

	void createCategorie (Categorie categorie);
	void desactiverCategorie (Categorie categorie);
	void modifierCategorie (Categorie categorie);
	List <Categorie> findAllcategorie();


}
