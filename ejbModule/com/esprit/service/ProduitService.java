package com.esprit.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.entity.Produit;


@Stateless
public class ProduitService implements ProduitServiceLocal,ProduitServiceRemote {

	@PersistenceContext
    EntityManager entityManager;

	
	@Override
	public void createProduit(Produit product) {
		entityManager.persist(product);
	}

	@Override
	public void desactiverProduit(Produit product) {
		entityManager.remove(product);
		
	}

	@Override
	public void modifierProduit(Produit product) {

		entityManager.merge(product);
		
	}

	@Override
	public List<Produit> findAllProduct() {
		return entityManager.createQuery("Select p from produit p",Produit.class).getResultList();
	}



}
