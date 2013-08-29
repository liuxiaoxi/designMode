package com.lxx.builder;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Directory d = new Directory();//指挥官
		IBuilder iba = new ConcreteBuilderA();
		IBuilder ibb = new ConcreteBuilderB();
		d.directory(iba);
		Product p1=iba.getResult();
		p1.show();
		d.directory(ibb);
		Product p2=ibb.getResult();
		p2.show();
	}

}
