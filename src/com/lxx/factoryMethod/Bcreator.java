package com.lxx.factoryMethod;

public class Bcreator extends ICreator {

	@Override
	public void FactoryMethod() {
		System.out.println("this is "+this.getClass());
	}


}
