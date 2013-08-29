package com.lxx.factoryMethod;

public class BFactory implements IFactory {
	ICreator bc = new Bcreator();
	@Override
	public ICreator getCreator() {
	
		return bc;
	}

}
