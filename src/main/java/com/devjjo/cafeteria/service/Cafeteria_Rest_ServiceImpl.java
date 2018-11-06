package com.devjjo.cafeteria.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

import com.devjjo.cafeteria.dao.Cafeteria_Rest_Dao;
import com.devjjo.cafeteria.model.Cafe;
import com.devjjo.cafeteria.model.Menu;
import com.devjjo.cafeteria.model.User;
import com.devjjo.cafeteria.service.Cafeteria_Rest_Service;
import org.slf4j.LoggerFactory;

@Service
public class Cafeteria_Rest_ServiceImpl implements Cafeteria_Rest_Service {

	@Inject
	private Cafeteria_Rest_Dao cafeteria_rest_dao;

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

	@Override
	public int deleteUser(Map<String, Object> userId) {
		// TODO Auto-generated method stub
		return cafeteria_rest_dao.deleteUser(userId);
	}

	@Override
	public List<Cafe> selectcafes(Map<String, Object> param) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		List<Cafe> lists = new ArrayList<Cafe>();
		lists = cafeteria_rest_dao.selectcafes();

		List<Menu> menu = new ArrayList<Menu>();
		menu = cafeteria_rest_dao.selectmenus(param);
		
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

