package chapter22;

import java.util.Scanner;

public class ThreadCount implements Runnable{

	private int n;
	
	public ThreadCount(int n) {
		this.n = n;
	}
	
	public static void main(String[] args) {
		/*
		 스캐너를 이용하여 키보드에서 숫자를 입력받고
		 입력 받은 숫자가 1씩 감소하다가 0이 되었을때
		 종료라는 메시지와 함께 스레드를 빠져나오도록 구현 
		 */
		System.out.println("갑을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		ThreadCount tc = new ThreadCount(num);
		//스레드 객체 및 실행
		Thread thread = new Thread(tc);
		thread.start();
	}

	@Override
	public void run() {
		for(int i=n;i>=0;i--) {
			
			try {
				System.out.println(i);
				Thread.sleep(1000);//1000은 1초
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	
		}
		
		System.out.println("프로그램 종료");
	
	}
}
