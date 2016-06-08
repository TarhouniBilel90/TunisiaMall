package com.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.entity.SecteurActivite;


@Remote
public interface SecteurActiviteServiceRemote {
	
	void createSecteurActivite(SecteurActivite secteur);
	void desactiverSecteurActivite(SecteurActivite secteur);
	void modifierSecteurActivite(SecteurActivite secteur);
	List <SecteurActivite> findAllSecteurActivite();


}
