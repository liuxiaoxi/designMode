package com.lxx.abstractFactory;

public class OracleTableB implements ITableBProduct {

	@Override
	public void insert() {
		System.out.println("tableB oracle insert");

	}

	@Override
	public void delect() {
		System.out.println("tableB oracle delect");

	}

}
