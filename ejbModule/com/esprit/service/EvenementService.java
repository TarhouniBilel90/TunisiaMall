package com.esprit.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.esprit.entity.Evenement;

@Stateless
public class EvenementService implements EvenementServiceLocal,EvenementServiceRemote{

	@PersistenceContext
    EntityManager entityManager;
	
	
	@Override
	public void createEvenement(Evenement evenement) {
	 
		entityManager.persist(evenement);
		
	}

	@Override
	public void desactiverEvenement(Evenement evenement) {

		entityManager.remove(evenement);
	}

	@Override
	public void modifierEvenement(Evenement evenement) {

		entityManager.merge(evenement);
		
	}

	@Override
	public List<Evenement> findAllCommande() {
		return entityManager.createQuery("Select u from evenement u",Evenement.class).getResultList();
	}

}
