package com.enjoy.cap11.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	//操作数据的方法
	public void insert(){
		String sql = "insert into `account` (name, account, age) values(?,?,?)";
		jdbcTemplate.update(sql,"rengind",1000,1002);
		//int i=1/0;
	}

	public void insert1(){
		String sql = "insert into `account` (name, account, age) values(?,?,?)";
		jdbcTemplate.update(sql,"sd",1000,1002);
		//int i=1/0;
	}
}
