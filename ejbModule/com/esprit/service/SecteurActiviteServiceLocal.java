package com.esprit.service;

import java.util.List;

import javax.ejb.Local;

import com.esprit.entity.SecteurActivite;

@Local
public interface SecteurActiviteServiceLocal {
	void createSecteurActivite(SecteurActivite secteur);
	void desactiverSecteurActivite(SecteurActivite secteur);
	void modifierSecteurActivite(SecteurActivite secteur);
	List <SecteurActivite> findAllSecteurActivite();
	
}
