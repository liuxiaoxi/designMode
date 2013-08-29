package com.lxx.abstractFactory;

public class MySqlTableB implements ITableBProduct {

	@Override
	public void insert() {
		System.out.println("tableB sql insert");

	}

	@Override
	public void delect() {
		System.out.println("tableB sql delect");

	}

}
