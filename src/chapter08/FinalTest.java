package chapter08;

import javax.swing.JOptionPane;

public class FinalTest {

	//������� - ��
	private int MAX=10;
	
	//�������� - �����Ϳ���
	//��� - final
	private static final int MIN=2;
	
	public static void main(String[] args) {

		//���� ���� 
		int num=0;

		for(int i=0; i<MIN; i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("�� �Է�"));
			
	
		}
	}
}
