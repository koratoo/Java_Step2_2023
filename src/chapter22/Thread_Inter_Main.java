package chapter22;

public class Thread_Inter_Main implements Runnable{

	public static void main(String[] args) {
		System.out.println("메인 시작");
		
		System.out.println("종료");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run()메서드 수행");
		first();
	}

	private void first() {
		// TODO Auto-generated method stub
		System.out.println("first메서드 수행");
		second();
	}

	private void second() {
		// TODO Auto-generated method stub
		System.out.println("second메서드 수행");
	}
	
}
