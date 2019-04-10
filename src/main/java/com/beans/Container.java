package com.beans;

import java.util.Arrays;

/**
 * ����һ���������û������������洢����������
 * 1���н�����
 * 2������洢�������洢�ռ�
 * 3���ṩ���ȡ�ķ���
 * @author 123
 *
 */
public class Container {
	/**
	 * �洢���������
	 */
	private Object[] array;
	/**
	 * ��¼��ЧԪ�ظ���
	 */
	private int size;
	
	public Container(){
		this(10);
	}
	public Container(int cap){//cap��ʾ����
		array=new Object[cap];
	}
	
	//��Զ�����ݷ���sizeλ��
	public synchronized void add(Object obj){
		//1.�ж������Ƿ���������������������
		if(array.length == size){
//			Object[] newArry=new Object[2*array.length];
//			for(int i=0;i<array.length;i++){
//				newArry[i]=array[i];
//			}
//			array=newArry;
			array=Arrays.copyOf(array, 2*array.length);
		}
		
		//2.�����ݣ�����
		array[size]=obj;
		
		//3.��ЧԪ�ظ�����1
		size++;
	}
	//��Զ��oλ�ÿ�ʼȡ
	public Object remove(){
		//1.�ж������Ƿ�Ϊ��
		if(size==0){
			return null;
		}
		Object object=array[0];
		System.arraycopy(array, 1, array, 0, size-1);
		//4.��ЧԪ�ظ�����һ
		size--;
		//5.���һ����ЧԪ����Ϊ��
		array[size]=null;
		return object;
	}
}
