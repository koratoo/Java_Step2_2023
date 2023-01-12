package chapter08;

//스태틱을 사용하기 좋은 예
public class StaticFunction {

	String str1 = "일반 회원변수";
	static String str2 = "static 회원변수";
	
	public static String getStatic() {
	
		//str1 = "VIP";
		
		
		return str2;
	}
}
