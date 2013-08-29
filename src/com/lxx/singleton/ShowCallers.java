package com.lxx.singleton;

public class ShowCallers {
	public static void main(String[] args) {
		Main s1 =	Main.getSingleton();
		Main s2 =	Main.getSingleton();
		System.out.println(s1==s2);
	}
}
