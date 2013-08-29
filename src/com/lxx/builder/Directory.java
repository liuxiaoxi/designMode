package com.lxx.builder;
/**
 * 
 * @description: 指挥官类! 
 * @author： lxx.sking
 * @created: 2013-7-31 下午4:14:24 
 * @version：$Id$ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,Ltd.All Rights Reserved.
 */
public class Directory {
	public IBuilder ib;
	public void directory(IBuilder ib){
		this.ib =ib;
		this.Create();
	}
	public void Create(){
		ib.BuilderPartA();
		ib.BuilderPartB();
	}
}
