package chapter22;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();
		
		Runnable r = new AccountThread(acc);
		
		Thread t1= new Thread(r);
		t1.start();
		
		//������ʹ� ������ ���� �޾Ƽ� �Ա� ��Ű�� �ڵ�
		while(true) {
			System.out.print("�Աݾ��� �Է��� �ּ��� : ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			acc.deposit(n);
			if(acc.balance==0) {
				break;
			}
		}
		
	}
}
