package com.lxx.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @description: Monkey 
 * 这里面的Cloneable接口是java帮我们实现的相当于prototype.
 * Monkey相当于prototype的具体实现
 * 只实现了Cloneable 为浅克隆 如果同时实现 Serializable 为深克隆(Monkey中的 GoldRingedStaff 也要同时
 * 实现Serializable 接口)
 * @author： lxx.sking
 * @created: 2013-7-31 上午10:33:30 
 * @version：$Id$ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,Ltd.All Rights Reserved.
 */
public class Monkey implements Cloneable,Serializable {
	   //身高
    private int height;
    //体重
    private int weight;
    //生日
    private Date birthDate;
    //金箍棒
    private GoldRingedStaff staff;
    /**
     * 构造函数
     */
    public Monkey(){
        this.birthDate = new Date();
        this.staff = new GoldRingedStaff();
    }
    /**
     * 浅克隆方法
     */
    @SuppressWarnings("finally")
	public Object clone(){
        Monkey temp = null;
        try {
            temp = (Monkey) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            return temp;
        }
    }
    /**
     * 深度克隆
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public  Object deepClone() throws IOException, ClassNotFoundException{
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public GoldRingedStaff getStaff() {
        return staff;
    }
    public void setStaff(GoldRingedStaff staff) {
        this.staff = staff;
    }
}