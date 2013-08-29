/**
 * 
 */
package com.lxx.prototype;

import java.io.IOException;

/**
 * @description: 原型模式调用端
 * @author： lxx.sking
 * @created: 2013-7-31 上午10:42:38 
 * @version：$Id$ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,Ltd.All Rights Reserved.
 */

public class Main {
	 private Monkey monkey = new Monkey();
	    
	    public void change() throws IOException, ClassNotFoundException{
	        //浅克隆大圣本尊
	        monkey.setHeight(100);
	        Monkey copyMonkey = (Monkey)monkey.clone();
	        System.out.println("大圣本尊的生日是：" + monkey.getBirthDate());
	        System.out.println("浅克隆的大圣的生日是：" + copyMonkey.getBirthDate());
	        System.out.println("大圣本尊跟浅克隆的大圣是否为同一个对象 " + (monkey == copyMonkey));
	        System.out.println("大圣本尊持有的金箍棒 跟 浅克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getStaff() == copyMonkey.getStaff()));
	        //深克隆大圣本尊
	        Monkey copyMonkeyDeep = (Monkey)monkey.deepClone();
	        System.out.println("大圣本尊的生日是：" + monkey.getBirthDate());
	        System.out.println("深克隆的大圣的生日是：" + copyMonkeyDeep.getBirthDate());
	        System.out.println("大圣本尊跟深克隆的大圣是否为同一个对象 " + (monkey == copyMonkeyDeep));
	        System.out.println("大圣本尊持有的金箍棒 跟 深克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getStaff() == copyMonkeyDeep.getStaff()));

	        System.out.println(copyMonkey.getHeight());
	        System.out.println(monkey.getHeight());
	    }
	    
	    public static void main(String[]args){
	        Main sage = new Main();
	        try {
				sage.change();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
}
