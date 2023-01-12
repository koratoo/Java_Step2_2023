package chapter08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {
	/*
		Bank bk1 = new Bank("강남점","010-1113-4993");
		bk1.interest=0.2f;//이걸 권장하지 않음
		Bank.interest=0.2f;//공통으로 쓴다면 스태틱
		bk1.getBank();
		
		System.out.println("-------------------");
		Bank bk2 = new Bank("일산점","010-2132-1231");
		bk2.getBank();
		*/
		//방법2
		String point =null;
		String tel = null;
		Scanner sc = new Scanner(System.in);
		point=JOptionPane.showInputDialog("지점명");
		tel=JOptionPane.showInputDialog("전화번호");
		Bank bank = new Bank(point, tel);
		
		System.out.println(point +"의 이자를 입력하세요 :");
		Bank.interest=sc.nextFloat();
		
		bank.getBank();
	}
}
