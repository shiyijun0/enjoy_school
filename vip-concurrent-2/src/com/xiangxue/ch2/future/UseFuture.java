package com.xiangxue.ch2.future;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：演示Future等的使用
 */
public class UseFuture {
	
	/*实现Callable接口，允许有返回值*/
	private static class UseCallable{

	}
	
	public static void main(String[] args) 
			throws InterruptedException, ExecutionException {
		
		UseCallable useCallable = new UseCallable();
		
	}

}
