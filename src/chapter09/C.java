package chapter09;

public class C extends A {

	public C() {
		super();//부모클래스의 생성자 컴파일
		this.field ="value";
		this.method();//A의 메서드
	}
	
	public static void main(String[] args) {
		
		C c = new C();//자식
		c.method();//부모클래스
		
	}
}
