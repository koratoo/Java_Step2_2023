package chapter16.generic1;

public class GenExMain {


	public static void main(String[] args) {
		//사용자가 원하는 형태로 객체가 만들어짐
		GenEx<String> v1 = new GenEx<String>();
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		//정수,실수,문자 ->일반 자료형은 들어올 수 없고 객체가 들어와야 함
		//제네릭 타입의 객체는 기본자료형
		GenEx<Integer> iType = new GenEx<Integer>();
		GenEx<Float> fType = new GenEx<Float>();
		GenEx<Character> cType = new GenEx<Character>();
		iType.setValue(100);
		fType.setValue((float) 11.01);
		cType.setValue('A');
		System.out.println(iType.getValue() +" " +fType.getValue() + " "+cType.getValue());
		
		
	}
}
