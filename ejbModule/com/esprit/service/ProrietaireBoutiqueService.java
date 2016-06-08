package com.esprit.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.esprit.entity.ProprietaireBoutique;

@Stateless
public class ProrietaireBoutiqueService implements ProrietaireBoutiqueServiceLocal,ProrietaireBoutiqueServiceRemote {

	@PersistenceContext
    EntityManager entityManager;
	
	@Override
	public void createProprietaireBoutique(ProprietaireBoutique proprietaire) {
		entityManager.persist(proprietaire);
	}

	@Override
	public void desactiverProprietaireBoutique(ProprietaireBoutique proprietaire) {
		entityManager.remove(proprietaire);
	}

	@Override
	public void modifierProprietaireBoutique(ProprietaireBoutique proprietaire) {
		entityManager.merge(proprietaire);
	}

	@Override
	public List<ProprietaireBoutique> findAllProprietaireBoutique() {
		return entityManager.createQuery("Select p from ProprietaireBoutique p",ProprietaireBoutique.class).getResultList();
	}

}
