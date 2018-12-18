package com.xiangxue.ch01;

public class StackAlloc {
	private static int age;
	public static class User{
		public int id = 0;
		public String name = "";
		
		User(){
			
		}
	}
	
	public  static  User alloc() {
		User u = new User();
		u.id = 5;
		int i=u.id;
		u.name = "mark";
		System.out.println(age++);
		return u;
	}
	
	public static void main(String[] args) throws Exception {
		long b = System.currentTimeMillis();
		Thread thread=new Thread(()->alloc());
		Thread thread1=new Thread(new Runnable() {
			@Override
			public void run() {
				alloc();
			}
		});
		for(int i=0;i<1;i++) {
			thread1.start();

		}
		long e = System.currentTimeMillis();
		System.out.println((e-b)+"ms");
	}
	

}
