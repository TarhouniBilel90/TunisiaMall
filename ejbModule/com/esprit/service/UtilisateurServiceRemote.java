package com.esprit.service;

import java.util.List;
import javax.ejb.Remote;
import com.esprit.entity.Utilisateur;

@Remote
public interface UtilisateurServiceRemote {
	
	void createUser(Utilisateur user);
	void desactiverUser(Utilisateur user);
	Utilisateur authentifcationUser(String login,String password);
	List <Utilisateur> findAllUsers();
 

}
