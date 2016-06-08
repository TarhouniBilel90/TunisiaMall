package com.esprit.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.entity.Categorie;

@Stateless
public class CategorieService implements CategorieServiceLocal,CategorieServiceRemote{

	
	@PersistenceContext
    EntityManager entityManager;

	@Override
	public void createCategorie(Categorie categorie) {
		entityManager.persist(categorie);
		
	}

	@Override
	public void desactiverCategorie(Categorie categorie) {
		entityManager.remove(categorie);
	}

	@Override
	public void modifierCategorie(Categorie categorie) {
		entityManager.merge(categorie);
	 
	}

	@Override
	public List<Categorie> findAllcategorie() {
		return entityManager.createQuery("Select u from categorie u",Categorie.class).getResultList();

	}


}
