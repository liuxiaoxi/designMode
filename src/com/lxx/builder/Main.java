package com.lxx.builder;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Directory d = new Directory();//指挥官
		IBuilder iba = new ConcreteBuilderA();//晓溪在这里增加了一些git的测试!!
		IBuilder ibb = new ConcreteBuilderB();
		d.directory(iba);
		Product p1=iba.getResult();
		p1.show();
		d.directory(ibb);
		Product p2=ibb.getResult();
		p2.show();
	}

}
