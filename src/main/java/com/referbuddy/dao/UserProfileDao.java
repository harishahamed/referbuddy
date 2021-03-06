package com.referbuddy.dao;

import java.util.List;

import com.referbuddy.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
