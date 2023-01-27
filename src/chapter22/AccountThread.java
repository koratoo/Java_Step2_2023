package chapter22;

import java.util.Random;

public class AccountThread implements Runnable{

	Account acc;
	
	public AccountThread(Account acc) {
		this.acc = acc;
	}


	@Override
	public void run() {
		
		while(true) {
			
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
		
		//��ݾ��� 100~300������ ������ �����ؼ� 
		int money=(new Random().nextInt()+1)*100;
		acc.withdraw(200);
		System.out.println("�ܾ� : "+acc.balance);
		
		}
	}
}
