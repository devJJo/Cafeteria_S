package com.devjjo.cafeteria.dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.devjjo.cafeteria.controller.Cafeteria_Rest_Controller;
import com.devjjo.cafeteria.dao.Cafeteria_Rest_Dao;
import com.devjjo.cafeteria.model.Cafe;
import com.devjjo.cafeteria.model.Cafe_Comment;
import com.devjjo.cafeteria.model.Favorite;
import com.devjjo.cafeteria.model.Menu;
import com.devjjo.cafeteria.model.Notice;
import com.devjjo.cafeteria.model.User;;

@Repository
public class Cafeteria_Rest_DaoImpl implements Cafeteria_Rest_Dao{

	@Inject
	private SqlSession session;
	private static final Logger logger = LoggerFactory.getLogger(Cafeteria_Rest_DaoImpl.class);
	public List<User> selectUser() {
		// TODO Auto-generated method stub
		List<User> UserList = new ArrayList<User>();
		UserList = session.selectList("CafeteriaSqlMap.selectUser");
		return UserList;
	}

	@Override
	public User selectUserOne(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.selectOne("CafeteriaSqlMap.selectUserOne", param);
	}

	@Override
	public int insertUser(User user) {
		return session.insert("CafeteriaSqlMap.insertUser", user);
	}

	@Override
	public int deleteUser(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.delete("CafeteriaSqlMap.deleteUser", param);
	}

	@Override
	public List<Cafe> selectcafes(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.selectList("CafeteriaSqlMap.selectcafes", param);
	}

	@Override
	public List<Menu> selectmenus(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.selectList("CafeteriaSqlMap.selectmenus", param);
	}

	@Override
	public List<Menu> select_date_menu(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.selectList("CafeteriaSqlMap.select_date_menu", param);
	}

	@Override
	public int insertComment(Cafe_Comment comment) {
		// TODO Auto-generated method stub
		return session.insert("CafeteriaSqlMap.insertComment", comment);
	}

	@Override
	public List<Cafe_Comment> selectComment(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.selectList("CafeteriaSqlMap.selectComment", param);
	}

	@Override
	public int updateComment(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.update("CafeteriaSqlMap.updateComment", param);
	}

	@Override
	public int deleteComment(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.delete("CafeteriaSqlMap.deleteComment", param);
	}

	@Override
	public List<Cafe_Comment> selectAllComment(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.selectList("CafeteriaSqlMap.selectAllComment", param);
	}

	@Override
	public List<Favorite> selectAllFavorite(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.selectList("CafeteriaSqlMap.selectAllFavorite", param);
	}

	@Override
	public int deleteFavorite(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.delete("CafeteriaSqlMap.deleteFavorite", param);
	}

	@Override
	public int insertFavorite(Favorite favorite) {
		// TODO Auto-generated method stub
		return session.insert("CafeteriaSqlMap.insertFavorite", favorite);
	}

	@Override
	public List<Notice> selectAllNotice() {
		// TODO Auto-generated method stub
		return session.selectList("CafeteriaSqlMap.selectAllNotice");
	}

	@Override
	public List<Cafe> getCafeList() {
		// TODO Auto-generated method stub
		return session.selectList("CafeteriaSqlMap.getCafeList");
	}

	@Override
	public Menu getMenu(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.selectOne("CafeteriaSqlMap.getMenu", param);
	}

	@Override
	public Cafe getCafeInfo(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.selectOne("CafeteriaSqlMap.getCafeInfo", param);
	}

	@Override
	public int insertMenu(Menu menu) {
		// TODO Auto-generated method stub
		return session.insert("CafeteriaSqlMap.insertMenu", menu);
	}

	@Override
	public int getExist(Menu menu) {
		// TODO Auto-generated method stub
		return session.selectOne("CafeteriaSqlMap.getExist", menu);
	}

	@Override
	public int updateMenu(Menu menu) {
		// TODO Auto-generated method stub
		return session.update("CafeteriaSqlMap.updateMenu", menu);
	}
}

