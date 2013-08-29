package com.lxx.abstractFactory;

public class OracleFactory implements IFactory {
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
