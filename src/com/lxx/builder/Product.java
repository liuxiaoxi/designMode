package com.lxx.builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @description: 产品类 
 * @author： lxx.sking
 * @created: 2013-7-31 下午3:44:59 
 * @version：$Id$ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,Ltd.All Rights Reserved.
 */
public class Product {
	List<String> list = new ArrayList<String>();
	public void setPart(String str){
		list.add(str);
	}
	public void show(){
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String str = (String) iterator.next();
			System.out.println("产品部件有:"+str);
		}
	}
}
