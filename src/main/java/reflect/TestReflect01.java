package reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
/**
 * @Target ��ע���ܹ�������Щ��Ա
 * Retention���ڶ���ע���ʱ��Ч
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
		//���󣺼��point�����Ƿ���ע�⣬�����ע����ͨ������
		//����������󣬲��洢��map����
		//��ȡ����ֽ�����󣨣�����ͨ��ɨ��ָ��������Ȼ����������
		Class<?> c=Class.forName("reflect.Point");
		//�ж��������Ƿ���entityע�⣬
		boolean flag=
		c.isAnnotationPresent(Entity.class);
		if(!flag)return;//û����ֱ�ӷ���
		//��ע��entity���ȡ���֣�ͨ�����乹�������
		//��ȡע�����
		Entity en=c.getDeclaredAnnotation(Entity.class);
		//��ȡע��value���Ե�ֵ
		String keyValue=en.value();
		//��ȡ��Ĺ�����������
		Constructor<?> con=c.getDeclaredConstructor();
		//���ù��췽���ɷ���
		con.setAccessible(true);
		//ͨ�����췽��������Ķ���
		
		//������洢��map
	}

}
