package com.project.moviego.service;

import java.util.HashMap;
import java.util.List;

import com.project.moviego.persistence.TestDao;

public class TestServiceImpl implements TestService {
	private TestDao testDao;
	
	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}
	
	@Override
	public List<HashMap<String, Object>> selectTestTable() {

		return testDao.selectTestTable();
		
	}

}
