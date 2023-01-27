package chapter14.String;

import java.util.Date;

public class ToStringEx0 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		//재정의가 안되어 있는 기본 toString
		System.out.println("Object : " + obj1.toString());
		System.out.println("Object : " + obj2.toString());
	}
}
