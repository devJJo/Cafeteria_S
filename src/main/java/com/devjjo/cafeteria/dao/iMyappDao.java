package com.devjjo.cafeteria.dao;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;


public interface iMyappDao {

	public List<HashMap<String, Object>> selectTestTable();

}

