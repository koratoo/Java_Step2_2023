package chapter22;

public class ThreadEx01_Main {

	public static void main(String[] args) {
		ThreadEx01 t = new ThreadEx01();
		t.start();
		//t.run()과 같으며 일반적으로 위에서 아래로 왼쪽에서 오른쪽으로 컴파일
		//되는 과정을 거치지 않는다.
		//t.run()는 일반 메소드 호출로 간주되므로 독립적인 컴파일을 하지 못한다.
		//Thread는 start로 호출한다.
		
		System.out.println("main 동작");
	}
}
