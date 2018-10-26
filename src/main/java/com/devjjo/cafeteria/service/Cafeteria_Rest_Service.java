package com.devjjo.cafeteria.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.devjjo.cafeteria.model.User;

public interface Cafeteria_Rest_Service {
	public List<User> selectUser();

	public User selectUserOne(Map<String, Object> param);

	public int insertUser(User user);
}

