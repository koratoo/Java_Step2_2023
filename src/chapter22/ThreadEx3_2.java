package chapter22;

public class ThreadEx3_2 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(1);
		}
	}

	
}
