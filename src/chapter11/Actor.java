package chapter11;

import java.util.Scanner;

public class Actor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[][] actor = { {"[�۰�ȣ]", "����", "����", "����"}, 
	            { "[�����]", "���ϵ�", "������ �׳�", "�����ϰ� �����ϰ�"}, 
	            { "[�̺���]", "��������", "����", "����"} };
		int cnt=0;
		System.out.print("�˻��� ��� : ");
		String actorName = sc.next();
		
		
		for(int i=0; i<actor.length;i++) {
		
			if(actor[i][0].equals("["+ actorName+"]")) {
				for(int j=0; j<actor[i].length; j++) {
					System.out.println(actor[i][j]);
					}
				cnt++;
				}//if end
		}//for i end
		
		if(cnt==0) {
			System.out.println("��ġ �ϴ� ����� ����");
		}	
	}
}
		


