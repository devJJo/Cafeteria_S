package com.devjjo.cafeteria.dao;
import java.util.List;
import java.util.Map;

import com.devjjo.cafeteria.model.Cafe;
import com.devjjo.cafeteria.model.Cafe_Comment;
import com.devjjo.cafeteria.model.Menu;
import com.devjjo.cafeteria.model.User;

public interface Cafeteria_Rest_Dao {

	public User selectUserOne(Map<String, Object> param);

	public int insertUser(User user);

	public int deleteUser(Map<String, Object> userId);

	public List<Cafe> selectcafes();

	public List<Menu> selectmenus(Map<String, Object> param);

	public List<Menu> select_date_menu(Map<String, Object> param);

	public int insertComment(Cafe_Comment comment);

	public List<Cafe_Comment> selectComment(Map<String, Object> param);

	public int updateComment(Map<String, Object> param);

	public int deleteComment(Map<String, Object> param);

}

