package chapter14.String;

import java.util.Date;

public class ToStringEx0 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		//�����ǰ� �ȵǾ� �ִ� �⺻ toString
		System.out.println("Object : " + obj1.toString());
		System.out.println("Object : " + obj2.toString());
	}
}
