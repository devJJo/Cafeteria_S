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
		User user = new User();
		user = session.selectOne("CafeteriaSqlMap.selectUserOne", param);
		return user;
	}

	@Override
	public int insertUser(User user) {
		return session.insert("CafeteriaSqlMap.insertUser", user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return session.update("CafeteriaSqlMap.updateUser", user);
	}

	@Override
	public int delete_user(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.delete("CafeteriaSqlMap.delete_user", param);
	}

	@Override
	public List<Cafe> selectcafes() {
		// TODO Auto-generated method stub
		List<Cafe> lists = new ArrayList<Cafe>();
		lists = session.selectList("CafeteriaSqlMap.selectcafes");

		List<Menu> menu = new ArrayList<Menu>();
		menu = session.selectList("CafeteriaSqlMap.selectmenus");

		for(int i=0; i<lists.size(); i++) {
			for(int j=0; j<menu.size(); j++) {
				if(lists.get(i).getCafe_Id().equals(menu.get(j).getCafe_Id())) {
					if("D".equals(menu.get(j).getMenu_Div())) {
						lists.get(i).setMenu_D(menu.get(j));
					}else if("L".equals(menu.get(j).getMenu_Div())) {
						lists.get(i).setMenu_L(menu.get(j));
					}
				}
			}	
		}
		return lists;
	}
}

