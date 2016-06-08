package com.esprit.service;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.entity.User;
 

import javax.persistence.TypedQuery;

import org.jboss.logmanager.Level;;


@Stateless
public class UserService implements UserServiceRemote, UserServiceLocal {

    @PersistenceContext
    EntityManager entityManager;

	@Override
	public void createUser(User user) {
		entityManager.persist(user);
	}
	
	@Override
	public void desactiverUser(User user) {
		entityManager.remove(user);
	}
	
	@Override
	public List<User> findAllUsers() {
	return entityManager.createQuery("Select u from user u",User.class).getResultList();
	}

	@Override
	public User authentifcationUser(String login, String password) {
		User found = null;
    String jpql="Select u from user u where u.login:=login and u.password=:password";
    TypedQuery<User> query=entityManager.createQuery(jpql,User.class);
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
