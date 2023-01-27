package chapter22;

public class Account {

	int balance = 1000;//�ܾ�
	
	//��� �޼���
	//synchronized ����ȭ
	public synchronized void withdraw(int money) {
		if(balance<money) {
			
			try {
				wait();//�����尡 �Ͻ������� �������¿� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		balance-=money;
	}//withdraw
	//�Ա� �޼���
	public synchronized void deposit(int money) {
		balance+=money;
		notify();//������ ������ ����
	}
}

/*
 ��Ƽ������ ȯ�濡�� ����ؾ��� �����尣�� ����ȭ
 ���� ��� �����尣 �����ϴ� �����Ͱ� �����ҽ� �����ϰ� �����ϴ� �������� ����ȭ�� �����ؾ��Ѵ�.
 �ڹٿ����� syncronizedŰ����� ����ȭ�� �����ش�.
 */
