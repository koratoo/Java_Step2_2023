package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		//X,Y,MyInterface 클래스 타입의 인스턴스 변수를 선언하여 출력
		
		MyClass myc = new MyClass();
		myc.x();
		myc.y();
		myc.myMethod();
		
		X xc = myc;
		Y yc = myc;
		MyInterface myi = myc;
	}
}
