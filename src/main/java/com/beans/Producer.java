package com.beans;
/**
 * ������
 * @author 123
 *
 */
public class Producer {
	private Container container;
	//ͨ��set����Ϊ�������Ը�ֵ
	public void setContainer(Container container) {
		this.container = container;
	}
	/**
	 * ������������������
	 * @param obj
	 */
	public void add(Object obj){
		this.container.add(obj);
	}
	
}
