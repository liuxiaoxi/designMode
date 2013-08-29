package com.lxx.abstractFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IFactory i = new MySqlFactory();
		ITableAProduct ia = i.createTableAProduct();
		ITableBProduct ib = i.createTableBProduct();
		ia.insert();
		ia.delect();
		ib.insert();
		ib.delect();

	}

}
