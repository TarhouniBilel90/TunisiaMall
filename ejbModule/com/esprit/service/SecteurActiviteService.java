package com.esprit.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.esprit.entity.SecteurActivite;

@Stateless
public class SecteurActiviteService implements SecteurActiviteServiceLocal,SecteurActiviteServiceRemote {

	@PersistenceContext
    EntityManager entityManager;
	
	@Override
	public void createSecteurActivite(SecteurActivite secteur) {
		entityManager.persist(secteur);
	}

	@Override
	public void desactiverSecteurActivite(SecteurActivite secteur) {
		entityManager.remove(secteur);
	}

	@Override
	public void modifierSecteurActivite(SecteurActivite secteur) {
		entityManager.merge(secteur);
	}

	@Override
	public List<SecteurActivite> findAllSecteurActivite() {
		return entityManager.createQuery("Select u from secteuractivite u",SecteurActivite.class).getResultList();
	}

}
