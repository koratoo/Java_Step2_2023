package chapter08;

class StVal{
	int a;
	static int b;
}

public class StaticTest {
	public static void main(String[] args) {
		StVal obj1 = new StVal();//힙 영역
		StVal obj2 = new StVal();

		obj1.a = 10;
		obj1.b = 20;
		System.out.println("obj1.a : " + obj1.a + " | " +"obj1.b : " +obj1.b);
		System.out.println("---------------------------------");
		obj2.a = 100;
		obj2.b = 200;
		System.out.println("obj2.a : " + obj2.a + " | " +"obj2.b : " +obj2.b);
		System.out.println("---------------------------------");
		//                            힙 영역이라 안바뀜      스태틱은 데이터 영역이라 바뀜	
		System.out.println("obj1.a : " + obj1.a + " | " +"obj1.b : " +obj1.b);
	}
}
