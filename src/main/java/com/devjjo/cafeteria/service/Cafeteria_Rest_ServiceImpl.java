package com.devjjo.cafeteria.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.devjjo.cafeteria.dao.Cafeteria_Rest_Dao;
import com.devjjo.cafeteria.model.User;
import com.devjjo.cafeteria.service.Cafeteria_Rest_Service;;

@Service
public class Cafeteria_Rest_ServiceImpl implements Cafeteria_Rest_Service {

	@Inject
	private Cafeteria_Rest_Dao cafeteria_rest_dao;

	public List<User> selectUser() {
		// TODO Auto-generated method stub
		return cafeteria_rest_dao.selectUser();
	}

	@Override
	public User selectUserOne(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return cafeteria_rest_dao.selectUserOne(param);
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return cafeteria_rest_dao.insertUser(user);
	}
}

