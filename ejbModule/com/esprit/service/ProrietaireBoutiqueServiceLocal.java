package com.esprit.service;

import java.util.List;
import javax.ejb.Local;
import com.esprit.entity.ProprietaireBoutique;
 

@Local
public interface ProrietaireBoutiqueServiceLocal {
	
	void createProprietaireBoutique(ProprietaireBoutique proprietaire);
	void desactiverProprietaireBoutique(ProprietaireBoutique proprietaire);
	void modifierProprietaireBoutique(ProprietaireBoutique proprietaire);
	List <ProprietaireBoutique> findAllProprietaireBoutique();
 

}
