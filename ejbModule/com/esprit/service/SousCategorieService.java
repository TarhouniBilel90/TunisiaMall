package com.esprit.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.esprit.entity.SousCategorie;

@Stateless
public class SousCategorieService implements SousCategorieServiceLocal,SousCategorieServiceRemote{

	@PersistenceContext
    EntityManager entityManager;
	
	
	@Override
	public void createSousCategorie(SousCategorie souscategorie) {
		entityManager.persist(souscategorie);
	}

	@Override
	public void desactiverSousCategorie(SousCategorie souscategorie) {
		entityManager.remove(souscategorie);
	}

	@Override
	public void modifierSousCategorie(SousCategorie souscategorie) {
		entityManager.merge(souscategorie);
	}

	@Override
	public List<SousCategorie> findAllSousCategorie() {
		return entityManager.createQuery("Select u from SousCategorie u",SousCategorie.class).getResultList();
		
	}

}
