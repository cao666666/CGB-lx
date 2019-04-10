package com.beans;

import java.util.Arrays;

/**
 * 定义一容器对象（用户借助此容器存储多个任意对象）
 * 1）有界容器
 * 2）对象存储在连续存储空间
 * 3）提供存和取的方法
 * @author 123
 *
 */
public class Container {
	/**
	 * 存储对象的数组
	 */
	private Object[] array;
	/**
	 * 记录有效元素个数
	 */
	private int size;
	
	public Container(){
		this(10);
	}
	public Container(int cap){//cap表示容量
		array=new Object[cap];
	}
	
	//永远把数据放在size位置
	public synchronized void add(Object obj){
		//1.判定容器是否已满，假如满了则扩容
		if(array.length == size){
//			Object[] newArry=new Object[2*array.length];
//			for(int i=0;i<array.length;i++){
//				newArry[i]=array[i];
//			}
//			array=newArry;
			array=Arrays.copyOf(array, 2*array.length);
		}
		
		//2.放数据（对象）
		array[size]=obj;
		
		//3.有效元素个数加1
		size++;
	}
	//永远从o位置开始取
	public Object remove(){
		//1.判断容器是否为空
		if(size==0){
			return null;
		}
		Object object=array[0];
		System.arraycopy(array, 1, array, 0, size-1);
		//4.有效元素个数减一
		size--;
		//5.最后一个有效元素置为空
		array[size]=null;
		return object;
	}
}
