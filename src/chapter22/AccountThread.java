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
			
		
		//출금액을 100~300사이의 난수로 지정해서 
		int money=(new Random().nextInt()+1)*100;
		acc.withdraw(200);
		System.out.println("잔액 : "+acc.balance);
		
		}
	}
}
