package com.esprit.service;

import javax.ejb.Remote;

import com.esprit.entity.User;

@Remote
public interface UserServiceRemote {
	
	void createUser(User user);

}
