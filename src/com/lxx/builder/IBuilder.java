/**
 * 
 */
package com.lxx.builder;

/**
 * @description: 工厂抽象类
 * @author： lxx.sking
 * @created: 2013-7-31 下午3:48:21 
 * @version：$Id$ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,Ltd.All Rights Reserved.
 */

public interface IBuilder {
	public void BuilderPartA();//构建了2个部件的产品
	public void BuilderPartB();
	public Product getResult();
}
