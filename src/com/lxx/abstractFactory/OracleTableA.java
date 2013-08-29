package com.lxx.abstractFactory;

public class OracleTableA implements ITableAProduct {

	@Override
	public void insert() {
		System.out.println("tableA oracle insert");

	}

	@Override
	public void delect() {
		System.out.println("tableA oracle delect");

	}

}
