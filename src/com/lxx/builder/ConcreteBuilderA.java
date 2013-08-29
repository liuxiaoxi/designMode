/**
 * 
 */
package com.lxx.builder;

/**
 * @description: 
 * @author： lxx.sking
 * @created: 2013-7-31 下午3:54:34 
 * @version：$Id$ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,Ltd.All Rights Reserved.
 */

public class ConcreteBuilderA implements IBuilder {

	Product p = new Product();
	@Override
	public void BuilderPartA() {
		p.setPart("A");

	}
	@Override
	public void BuilderPartB() {
		p.setPart("B");
	}
	@Override
	public Product getResult() {
	
		return p;
	}

}
