package com.enjoy.cap11.service;

import com.enjoy.cap11.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {
    @Autowired
	private OrderDao orderDao;
    @Autowired
    private NewService newService;
    @Transactional
    public void addOrder(){

    	orderDao.insert1();
       // int a = 1/0;
    	System.out.println("操作完成.........");
        newService.test1();

        try {
            newService.test();
        } catch (Throwable e) {
           // e.printStackTrace();
          //  throw new RuntimeException();
           // throw e;
        }
        newService.test1();

        //test();
        /*try {
            int a = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("插入数据肯定不正常");
            throw new RuntimeException();
        }*/

    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void test(){
        System.out.println("新事物********");
        orderDao.insert();
    }
}
