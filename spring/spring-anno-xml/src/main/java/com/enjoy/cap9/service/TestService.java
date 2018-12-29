package com.enjoy.cap9.service;

import com.enjoy.cap9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Qualifier("testDao")//指定名称来加载  这个是优先权最大，
	@Autowired
	//@Inject 第三方的包必须引用  和autwired 一样 功能差不多，支持primay,唯一区别没有requer=false
	private TestDao testDao21;//如果使用Autowired, testDao2, 找到TestDao类型的
	
	public void println(){
		System.out.println("Service...dao...."+testDao21);
	}
}
