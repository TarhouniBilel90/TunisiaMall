package com.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.entity.Boutique;

@Remote
public interface BoutiqueServiceRemote {


	void createBoutique (Boutique boutique);
	void desactiverBoutique  (Boutique boutique);
	void modifierBoutique  (Boutique boutique);
	List <Boutique> findAllboutique();
}
