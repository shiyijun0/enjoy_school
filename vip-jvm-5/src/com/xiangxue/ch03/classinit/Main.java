package com.xiangxue.ch03.classinit;

public class Main {
	
	public static void main(String[] args) {
	//	System.out.println(SubClazz.value);
		//SuperClazz[] sca = new SuperClazz[10];
		//SuperClazz[] sca1 = new SubClazz[10];
		//System.out.println(SubClazz.HELLOWORLD);
		//System.out.println(SubClazz.WHAT);

		/*SuperClazz sca2 = new SuperClazz();
		Class c=SuperClazz.class;
		Class d=sca2.getClass();*/

		try {
			Class e=Class.forName("com.xiangxue.ch03.classinit.SuperClazz");
			SuperClazz superClazz=(SuperClazz)e.newInstance();
			//SuperClazz.class.isInstance()
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}
