package com.project.moviego.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class TestDaoImpl extends SqlSessionDaoSupport implements TestDao {

	@Override
	public List<HashMap<String, Object>> selectTestTable() {
		// TODO Auto-generated method stub
		List<HashMap<String, Object>> testTableList = new ArrayList<HashMap<String, Object>>();
		testTableList = getSqlSession().selectList("testSqlMap.selectTestTable");
		return testTableList;
	}

}
