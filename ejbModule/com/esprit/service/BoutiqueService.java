package com.esprit.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.entity.Boutique;


@Stateless
public class BoutiqueService implements BoutiqueServiceLocal,BoutiqueServiceRemote{

	
	@PersistenceContext
    EntityManager entityManager;
	
	@Override
	public void createBoutique(Boutique boutique) {
		entityManager.persist(boutique);
		
	}

	@Override
	public void desactiverBoutique(Boutique boutique) {
		entityManager.remove(boutique);
		
	}

	@Override
	public void modifierBoutique(Boutique boutique) {
		 
		
	}

	@Override
	public List<Boutique> findAllboutique() {
		return entityManager.createQuery("Select u from boutique u",Boutique.class).getResultList();

	}

}
