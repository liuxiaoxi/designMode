package com.lxx.abstractFactory;

public class MySqlFactory implements IFactory {
//两个工厂的实例方法
	@Override
	public ITableAProduct createTableAProduct() {
	
		return new MySqlTableA();
	}

	@Override
	public ITableBProduct createTableBProduct() {
	
		return  new MySqlTableB();
	}

	


	



}
