package com.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
/**
 * Target表示注解能够描述哪些类型
 * Retention用于定义注解何时有效（编译时还是运行时）
 * @author Administrator
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.TYPE)//只能描述类
@interface Entity{
	String value() default "";
}
@Entity("point")
class Point{
	public void distance(){}
}
public class TestReflect02{
	static Map<String , Object> beanMap=new HashMap<>();
	public static void main(String[] args) throws Exception {
		//需求：检测point类上是否有注解，有这个注解则
		
		//通过反射构建此类的对象，并存储到map容器中
		//获取类的字节码对象
		Class<?> c=Class.forName("com.test.Point");
		//判定此类上是否有entity注解
		boolean flag=c.isAnnotationPresent(Entity.class);
		if (!flag) return;//没有则直接返回
		//有注解Entity则获取名字，通过反射构建类对象
		//获取注解对象
		Entity en=c.getDeclaredAnnotation(Entity.class);
		//获取注解value属性的值
		String keyValue=en.value();
		//获取类的构造方法对象
		Constructor<?> con=c.getDeclaredConstructor();
		//设置构造方法可访问
		con.setAccessible(true);
		//通过构造方法构建类的对象
		Object target=con.newInstance();
		//将对象存储到map中
		beanMap.put(keyValue, target);
		System.out.println(beanMap);
	}

}
