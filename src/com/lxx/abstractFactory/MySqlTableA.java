package com.lxx.abstractFactory;

public class MySqlTableA implements ITableAProduct {

	@Override
	public void insert() {
		System.out.println("tableA sql insert");

	}

	@Override
	public void delect() {
		System.out.println("tableA sql delect");

	}

}
