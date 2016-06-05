package com.esprit.service;

import javax.ejb.Local;

import com.esprit.entity.User;

@Local
public interface UserServiceLocal {
	void createUser(User user);

}
