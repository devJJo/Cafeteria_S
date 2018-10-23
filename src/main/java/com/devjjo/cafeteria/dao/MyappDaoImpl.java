package com.devjjo.cafeteria.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.devjjo.cafeteria.dao.iMyappDao;


public class MyappDaoImpl extends SqlSessionDaoSupport implements iMyappDao{

	public List<HashMap<String, Object>> selectTestTable() {
		// TODO Auto-generated method stub
		List<HashMap<String, Object>> testTableList = new ArrayList<HashMap<String, Object>>();
		testTableList = getSqlSession().selectList("testSqlMap.selectTestTable");
		return testTableList;
	}



}

