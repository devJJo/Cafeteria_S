package com.devjjo.cafeteria.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devjjo.cafeteria.dao.iMyappDao;
import com.devjjo.cafeteria.service.iMyappService;

@Service
public class MyappServiceImpl implements iMyappService {

	@Inject
	private iMyappDao myappDao;

/*	public void setMyappDao(iMyappDao myappDao){
		this.myappDao = myappDao;
	}*/

	public List<HashMap<String,Object>> selectTestTable() {
		// TODO Auto-generated method stub
		return myappDao.selectTestTable();
	}
}

