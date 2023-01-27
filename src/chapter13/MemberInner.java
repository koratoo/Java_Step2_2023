package chapter13;

public class MemberInner {

	int a = 10;
	private int b =100;
	static int c = 200;
	
	//생성자
	public MemberInner() {}
	//메소드
	
	//내부클래스 -> 이벤트 처리할때 많이 사용된다.
	class Inner{
		//필드명
		//생성자
		//메소드
		public void printData() {
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b);
			System.out.println("static c : " + c);
		}
		
		
	}
	public static void main(String[] args) {
		
//		MemberInner outer = new MemberInner();
//		outer.new Inner();
		
		MemberInner.Inner inner = new MemberInner().new Inner();
		inner.printData();
	}
}
