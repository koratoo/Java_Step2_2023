package chapter22;

import java.util.Scanner;

public class ThreadCount implements Runnable{

	private int n;
	
	public ThreadCount(int n) {
		this.n = n;
	}
	
	public static void main(String[] args) {
		/*
		 ��ĳ�ʸ� �̿��Ͽ� Ű���忡�� ���ڸ� �Է¹ް�
		 �Է� ���� ���ڰ� 1�� �����ϴٰ� 0�� �Ǿ�����
		 ������ �޽����� �Բ� �����带 ������������ ���� 
		 */
		System.out.println("���� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		ThreadCount tc = new ThreadCount(num);
		//������ ��ü �� ����
		Thread thread = new Thread(tc);
		thread.start();
	}

	@Override
	public void run() {
		for(int i=n;i>=0;i--) {
			
			try {
				System.out.println(i);
				Thread.sleep(1000);//1000�� 1��
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	
		}
		
		System.out.println("���α׷� ����");
	
	}
}
