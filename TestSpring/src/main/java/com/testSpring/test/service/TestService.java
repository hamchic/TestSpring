package com.testSpring.test.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;

import com.testSpring.test.dto.TestDto;

@Service
public class TestService {
	@Autowired
	protected SqlSessionTemplate sqlSession;
	
	@Autowired
	protected DataSourceTransactionManager transactionManager;
	
	
	public List<TestDto> selectTestAll(){
		return sqlSession.selectList("selectTestAll");
	}
	
}
