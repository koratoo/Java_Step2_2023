package chapter22;

public class ThreadEx02_Main {

	public static void main(String[] args) {
		//1~10������ ��Ұ�temp �����濡 �ʱ�ȭ ��
		ThreadEx02 t1 = new ThreadEx02();
		t1.start();//start()�޼ҵ带 �����ϸ� ���ο� run()�޼ҵ尡 ����ȴ�.
		
		try {
			Thread.sleep(2000);//2�� ���
			System.out.println("���α׷� ����");
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
}
