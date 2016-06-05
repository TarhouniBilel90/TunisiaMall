package com.esprit.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.entity.User;


@Stateless
public class UserService implements UserServiceRemote, UserServiceLocal {

    @PersistenceContext
    EntityManager entityManager;

	@Override
	public void createUser(User user) {
		entityManager.persist(user);
		
	}

}
