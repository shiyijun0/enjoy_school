package com.xiangxue.ch01;

import java.nio.ByteBuffer;

public class DirectMem {



	public static final  int num=35;
	//public enum sd {Sud("sy",3)};
	//private Sud
	static {
		System.out.println("实例化了*********");
	}
	public static void main(String[] args) {
		ByteBuffer b = ByteBuffer.allocateDirect(1024*1024*14);
	}

}
