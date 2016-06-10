package com.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.entity.User;

@Remote
public interface UserServiceRemote {
	
	void createUser(User user);
	void desactiverUser(User user);
	User authentifcationUser(String login,String password);
	List <User> findAllUsers();
	void deleteUser(User user);
	void updateUser(User user);
}
