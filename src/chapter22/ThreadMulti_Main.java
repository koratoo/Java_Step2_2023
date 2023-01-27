package chapter22;

public class ThreadMulti_Main {

	public static void main(String[] args) {
		//Multi Thread
		ThreadEx03 t1 = new ThreadEx03();
		ThreadEx3_2 t2 = new ThreadEx3_2();
	
		t1.start();
		t2.start();
	}
}
