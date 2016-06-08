package com.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.entity.ProprietaireBoutique;

@Remote
public interface ProrietaireBoutiqueServiceRemote {

	void createProprietaireBoutique(ProprietaireBoutique proprietaire);
	void desactiverProprietaireBoutique(ProprietaireBoutique proprietaire);
	void modifierProprietaireBoutique(ProprietaireBoutique proprietaire);
	List <ProprietaireBoutique> findAllProprietaireBoutique();
 

}
