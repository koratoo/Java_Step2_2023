package chapter08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {
	/*
		Bank bk1 = new Bank("������","010-1113-4993");
		bk1.interest=0.2f;//�̰� �������� ����
		Bank.interest=0.2f;//�������� ���ٸ� ����ƽ
		bk1.getBank();
		
		System.out.println("-------------------");
		Bank bk2 = new Bank("�ϻ���","010-2132-1231");
		bk2.getBank();
		*/
		//���2
		String point =null;
		String tel = null;
		Scanner sc = new Scanner(System.in);
		point=JOptionPane.showInputDialog("������");
		tel=JOptionPane.showInputDialog("��ȭ��ȣ");
		Bank bank = new Bank(point, tel);
		
		System.out.println(point +"�� ���ڸ� �Է��ϼ��� :");
		Bank.interest=sc.nextFloat();
		
		bank.getBank();
	}
}
