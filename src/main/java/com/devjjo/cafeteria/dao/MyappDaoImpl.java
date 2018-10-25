package com.devjjo.cafeteria.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.devjjo.cafeteria.dao.iMyappDao;

@Repository
public class MyappDaoImpl implements iMyappDao{

	@Inject
	private SqlSession session;
	
	public List<HashMap<String, Object>> selectTestTable() {
		// TODO Auto-generated method stub
		List<HashMap<String, Object>> testTableList = new ArrayList<HashMap<String, Object>>();
		testTableList = session.selectList("testSqlMap.selectTestTable");
		return testTableList;
	}



}

