package com.esprit.service;

import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.jboss.logmanager.Level;

import com.esprit.entity.Utilisateur;

@Stateless
public class UtilisateurService implements UtilisateurServiceRemote,UtilisateurServiceLocal {
    @PersistenceContext
    EntityManager entityManager;

	@Override
	public void createUser(Utilisateur user) {
		entityManager.persist(user);
	}
	
	@Override
	public void desactiverUser(Utilisateur user) {
		entityManager.remove(user);
	}
	
	@Override
	public List<Utilisateur> findAllUsers() {
	return entityManager.createQuery("Select * from project.client ,project.administrateur,project.proprietaireboutique",Utilisateur.class).getResultList();
	}

	@Override
	public Utilisateur authentifcationUser(String login, String password) {
    Utilisateur found = null;
    String jpql="Select u from utilisateur u where u.login:=login and u.password=:password";
    TypedQuery<Utilisateur> query=entityManager.createQuery(jpql,Utilisateur.class);
	query.setParameter("login", login);
	query.setParameter("password", password);
	try {
		 found=query.getSingleResult();
	    } 
	catch (Exception ex) 
	    {
		Logger.getLogger(UserService.class.getName()).log(
				Level.WARNING,"authentification attempt failure with login ="
		+login +"and password = "+password);
	    }
	return found;
	}
	

}
