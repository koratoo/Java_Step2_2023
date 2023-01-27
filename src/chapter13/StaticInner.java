package chapter13;

public class StaticInner {

	int a = 10;
	private int b =100;
	static int c = 200;
	
	//생성자
	
	//메소드
	
	//내부클래스 -> 이벤트 처리할때 많이 사용된다.
	static class Inner{
		//필드명
		static int d = 1000;
		//생성자
		//메소드
		public void printData() {
			
			//a,b는 static이 아니라서 데이터영역에 들어올 수 없다.
			//System.out.println("int a : " + a);
			//System.out.println("private int b : " + b);
			System.out.println("static c : " + c);
			System.out.println("static d : " + d);
		}
		
		
	}
	public static void main(String[] args) {
		
		Inner inner = new Inner();
		inner.printData();
	}
}
