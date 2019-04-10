package reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
/**
 * @Target 表注解能够描述哪些成员
 * Retention用于定义注解何时有效
 * @author Administrator
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.TYPE)
@interface Entity{
	String value() default "";
}
@Entity("point")
class Point{
	public void distance(){
		
	}
}

public class TestReflect01 {
	static Map<String,Object> beanMap =new HashMap<>();
	public static void main(String[] args)throws Exception {
		//需求：检测point类上是否有注解，有这个注解则通过反射
		//构建此类对象，并存储到map容器
		//获取类的字节码对象（）可以通过扫描指定包下类然后进行类加载
		Class<?> c=Class.forName("reflect.Point");
		//判定此类上是否有entity注解，
		boolean flag=
		c.isAnnotationPresent(Entity.class);
		if(!flag)return;//没有则直接返回
		//有注解entity则获取名字，通过反射构建类对象
		//获取注解对象
		Entity en=c.getDeclaredAnnotation(Entity.class);
		//获取注解value属性的值
		String keyValue=en.value();
		//获取类的构建方法对象
		Constructor<?> con=c.getDeclaredConstructor();
		//设置构造方法可访问
		con.setAccessible(true);
		//通过构造方法构建类的对象
		
		//将对象存储到map
	}

}
