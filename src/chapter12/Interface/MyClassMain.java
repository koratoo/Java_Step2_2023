package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		//X,Y,MyInterface Ŭ���� Ÿ���� �ν��Ͻ� ������ �����Ͽ� ���
		
		MyClass myc = new MyClass();
		myc.x();
		myc.y();
		myc.myMethod();
		
		X xc = myc;
		Y yc = myc;
		MyInterface myi = myc;
	}
}
