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
		//String Ŭ������ ���� ��������
		Class strClass = Class.forName("java.lang.String");
		System.out.println(strClass);
		//StringŬ������ �����ڵ� ���� 
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
