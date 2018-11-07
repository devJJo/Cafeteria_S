package com.devjjo.cafeteria.service;

import java.util.List;
import java.util.Map;

import com.devjjo.cafeteria.model.Cafe;
import com.devjjo.cafeteria.model.Cafe_Comment;
import com.devjjo.cafeteria.model.Menu;
import com.devjjo.cafeteria.model.User;

public interface Cafeteria_Rest_Service {
	
	public int insertUser(User user);
	
	public User selectUserOne(Map<String, Object> param);
	
	public int deleteUser(Map<String, Object> param);
	
	public List<Cafe> selectcafes(Map<String, Object> param);

	public List<Menu> select_date_menu(Map<String, Object> param);

	public int insertComment(Cafe_Comment comment);

	public List<Cafe_Comment> selectComment(Map<String, Object> param);

	public int updateComment(Map<String, Object> param);

	public int deleteComment(Map<String, Object> param);
	
}

