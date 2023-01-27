package chapter22;

public class ThreadEx02 extends Thread{

	private int[] temp;
	
	//스레드 초기화
	public ThreadEx02() {
		temp=new int[10];
		for(int i=0;i<temp.length;i++) {
			temp[i]=i;
		}
	}


	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);//1000은 1초
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		for(int i : temp) {
			System.out.println("temp : " +temp[i]);
		}
	}
	
	
}
