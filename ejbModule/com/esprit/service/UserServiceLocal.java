package com.esprit.service;

import java.util.List;
import javax.ejb.Local;

import com.esprit.entity.User;

@Local
public interface UserServiceLocal {
	void createUser(User user);
	void desactiverUser(User user);
	User authentifcationUser(String login,String password);
	List <User> findAllUsers();
	void deleteUser(User user);
	void updateUser(User user);

}
