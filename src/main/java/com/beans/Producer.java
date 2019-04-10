package com.beans;
/**
 * 生产者
 * @author 123
 *
 */
public class Producer {
	private Container container;
	//通过set方法为容器属性赋值
	public void setContainer(Container container) {
		this.container = container;
	}
	/**
	 * 生产者向容器放数据
	 * @param obj
	 */
	public void add(Object obj){
		this.container.add(obj);
	}
	
}
