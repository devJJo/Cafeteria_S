package com.devjjo.cafeteria.service;

import java.util.List;
import java.util.Map;

import com.devjjo.cafeteria.model.Cafe;
import com.devjjo.cafeteria.model.User;

public interface Cafeteria_Rest_Service {
	
	public int insertUser(User user);
	
	public User selectUserOne(Map<String, Object> param);
	
	public int deleteUser(Map<String, Object> param);
	
	public List<Cafe> selectcafes(Map<String, Object> param);
	
}

