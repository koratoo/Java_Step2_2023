package chapter22;

public class ThreadEx02 extends Thread{

	private int[] temp;
	
	//������ �ʱ�ȭ
	public ThreadEx02() {
		temp=new int[10];
		for(int i=0;i<temp.length;i++) {
			temp[i]=i;
		}
	}


	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);//1000�� 1��
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		for(int i : temp) {
			System.out.println("temp : " +temp[i]);
		}
	}
	
	
}
