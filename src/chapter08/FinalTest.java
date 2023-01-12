package chapter08;

import javax.swing.JOptionPane;

public class FinalTest {

	//멤버변수 - 힙
	private int MAX=10;
	
	//전역변수 - 데이터영역
	//상수 - final
	private static final int MIN=2;
	
	public static void main(String[] args) {

		//지역 변수 
		int num=0;

		for(int i=0; i<MIN; i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("값 입력"));
			
	
		}
	}
}
