package com.devjjo.cafeteria.service;

import java.util.HashMap;
import java.util.List;

import com.devjjo.cafeteria.dao.iMyappDao;
import com.devjjo.cafeteria.service.iMyappService;

public class MyappServiceImpl implements iMyappService {

	private iMyappDao myappDao;

	public void setMyappDao(iMyappDao myappDao){
		this.myappDao = myappDao;
	}

	public List<HashMap<String,Object>> selectTestTable() {
		// TODO Auto-generated method stub
		return myappDao.selectTestTable();
	}
}

