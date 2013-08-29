package com.lxx.factoryMethod;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		IFactory operfactorya = new AFactory();
//		ICreator ica = operfactorya.getCreator();
//		ica.FactoryMethod();
//		IFactory operfactoryb = new BFactory();
//		ICreator icb = operfactoryb.getCreator();
//		icb.FactoryMethod();
		
		
		
	//	int x = 1;
		int x = 2;
		IFactory operfactory =null;
		switch (x) {
		case 1:
			 operfactory = new AFactory();
			break;
		case 2:
			 operfactory = new BFactory();
			break;
		default:
			break;
		}
		ICreator ic = operfactory.getCreator();
		ic.FactoryMethod();
	}

}
