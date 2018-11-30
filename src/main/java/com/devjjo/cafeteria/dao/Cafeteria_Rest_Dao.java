package com.devjjo.cafeteria.dao;
import java.util.List;
import java.util.Map;

import com.devjjo.cafeteria.model.Cafe;
import com.devjjo.cafeteria.model.Cafe_Comment;
import com.devjjo.cafeteria.model.Favorite;
import com.devjjo.cafeteria.model.Menu;
import com.devjjo.cafeteria.model.Notice;
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

	public List<Cafe_Comment> selectAllComment(Map<String, Object> param);

	public List<Favorite> selectAllFavorite(Map<String, Object> param);

	public int deleteFavorite(Map<String, Object> param);

	public int insertFavorite(Favorite favorite);

	public List<Notice> selectAllNotice();

	public List<Cafe> getCafeList();

	public Menu getMenu(Map<String, Object> param);

	public Cafe getCafeInfo(Map<String, Object> param);

	public int insertMenu(Menu menu);

	public int getExist(Menu menu);

	public int updateMenu(Menu menu);

}

