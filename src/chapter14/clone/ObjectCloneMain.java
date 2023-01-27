package chapter14.clone;

public class ObjectCloneMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10,20,30);
		Circle circleCopy = (Circle) circle.clone(); // 오브젝트는 최상위기 때문에 다운캐스팅
		
		System.out.println(circle);
		System.out.println(circleCopy);
		
		//hash값
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(circleCopy));
		
	}
}
