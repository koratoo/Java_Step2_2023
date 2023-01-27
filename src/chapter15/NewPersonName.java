package chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.*;

public class NewPersonName {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("chapter15.Person");
		System.out.println(pClass);
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
		
		//==============================================
		//String 클래스의 정보 가져오기
		Class strClass = Class.forName("java.lang.String");
		System.out.println(strClass);
		//String클래스의 생성자들 정보 
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c:cons) {
			System.out.println(c);
		}
		System.out.println("----------------------------");
		
		Method[] method = strClass.getMethods();
		for(Method m:method) {
			System.out.println(m);
		}
		
		//=====================================
		String str ="Hava a Nice Day";
	}
}
