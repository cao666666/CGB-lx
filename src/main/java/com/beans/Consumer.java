package com.beans;
/**
 * �����߶���
 * @author 123
 *
 */
public class Consumer {
	/**
	 * ������������
	 */
	private Container container;
	/**
	 * ͨ��set����Ϊ�������Ը�ֵ
	 */
	public void setContainer(Container container){
		this.container=container;
	}
	/**
	 * ��������ȡ����
	 */
	public Object get(){
		return container.remove();//0
	}

}
