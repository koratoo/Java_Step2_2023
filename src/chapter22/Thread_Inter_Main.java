package chapter22;

public class Thread_Inter_Main implements Runnable{

	public static void main(String[] args) {
		System.out.println("���� ����");
		
		System.out.println("����");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run()�޼��� ����");
		first();
	}

	private void first() {
		// TODO Auto-generated method stub
		System.out.println("first�޼��� ����");
		second();
	}

	private void second() {
		// TODO Auto-generated method stub
		System.out.println("second�޼��� ����");
	}
	
}
