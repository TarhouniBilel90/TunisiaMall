package com.esprit.service;

import java.util.List;
import javax.ejb.Local;

import com.esprit.entity.User;
import com.esprit.entity.Utilisateur;

@Local
public interface UtilisateurServiceLocal {

	
	void createUser(Utilisateur user);
	void desactiverUser(Utilisateur user);
	Utilisateur authentifcationUser(String login,String password);
	List <Utilisateur> findAllUsers();
	
}
