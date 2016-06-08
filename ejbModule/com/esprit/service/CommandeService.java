package com.esprit.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.esprit.entity.Commande;

@Stateless
public class CommandeService implements CommandeServiceLocal,CommandeServiceRemote{

	@PersistenceContext
    EntityManager entityManager;
	
	@Override
	public void createCommande(Commande commande) {

		entityManager.persist(commande);
		
	}

	@Override
	public void desactiverCommande(Commande commande) {
		entityManager.remove(commande);
		
	}

	@Override
	public void modifierCommande(Commande commande) {
		entityManager.merge(commande);
		
	}

	@Override
	public List<Commande> findAllCommande() {
		return entityManager.createQuery("Select u from commande u",Commande.class).getResultList();

	}

}
