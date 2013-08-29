package com.lxx.builder;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Directory d = new Directory();//指挥官
		IBuilder iba = new ConcreteBuilderA();//23223
		IBuilder ibb = new ConcreteBuilderB();//ssss
		d.directory(iba);
		Product p1=iba.getResult();
		p1.show();
		d.directory(ibb);
		Product p2=ibb.getResult();
		p2.show();
	}

}
