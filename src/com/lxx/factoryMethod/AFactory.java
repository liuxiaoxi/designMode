package com.lxx.factoryMethod;

public class AFactory implements IFactory {

	ICreator  ac = new Acreator();
	@Override
	public ICreator getCreator() {
	
		return ac;
	}

}
