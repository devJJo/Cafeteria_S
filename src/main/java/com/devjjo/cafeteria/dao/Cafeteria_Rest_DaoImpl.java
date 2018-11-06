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
import com.devjjo.cafeteria.model.Menu;
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
	public List<Cafe> selectcafes() {
		// TODO Auto-generated method stub
		return session.selectList("CafeteriaSqlMap.selectcafes");
	}

	@Override
	public List<Menu> selectmenus(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.selectList("CafeteriaSqlMap.selectmenus");
	}
}

