package com.lxx.singleton;

public class Main {
	private static Main sl;//私有的成员变量
	private Main(){};//私有的构造方法
	public static Main getSingleton(){//全局唯一访问点
		if(sl ==null){
			 sl = new Main();
		}
		return sl;
	}
}
