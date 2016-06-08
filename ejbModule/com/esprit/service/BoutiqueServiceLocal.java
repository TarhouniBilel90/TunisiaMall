package com.esprit.service;

import java.util.List;

import javax.ejb.Local;

import com.esprit.entity.Boutique;

@Local
public interface BoutiqueServiceLocal {
	
	void createBoutique (Boutique boutique);
	void desactiverBoutique  (Boutique boutique);
	void modifierBoutique  (Boutique boutique);
	List <Boutique> findAllboutique();

}
