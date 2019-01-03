package com.enjoy.cap11.service;

import com.enjoy.cap11.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NewService {
    @Autowired
    private OrderDao orderDao;
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void test(){
        System.out.println("新事物111********");
        int a = 1/0;
        orderDao.insert();
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void test1(){
        System.out.println("新事物22********");

        try {
            orderDao.insert();
        } catch (Exception e) {

        }
    }
}
