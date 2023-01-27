package chapter14;

//Wrapper 
public class IntegerTest {

	public static void main(String[] args) {
		
		//취소선 오류는 아닌데 곧 없어질 예정이라 권장하지 않음
		//Integer i = new Integer(100); 
		
		Integer num = 100; // 오토박싱 : 일반자료 => 클래스로 선언
		
		int iNum = num.intValue(); // 언박싱 : 클래스 => 일반자료
		
		int jNum = 200;
		
		int sum = iNum+jNum;
		System.out.println(sum);
		
		//언박싱
		int total = num + jNum;// num.intValue(jNum)
		System.out.println(total);
		
		//오토박싱 클래스 타입
		//일반 타입 언박싱
		Integer i = jNum;
		System.out.println(i);//Integer.valueOf(jNum)과 동일
	}
}
