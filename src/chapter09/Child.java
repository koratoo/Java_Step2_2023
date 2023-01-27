package chapter09;

public class Child extends Parent{

	@Override
	public void method2() {
		System.out.println("Child의 method2");
	}
	
	public void method3() {
		System.out.println("Child만 갖고 있는 method3");
	}
}
