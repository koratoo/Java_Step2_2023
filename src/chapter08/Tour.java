package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� : ");
		int N = sc.nextInt(); //������ ��
		int K;
		Guide guide = new Guide(N);
		System.out.println("������ ���");
		Guest gst = new Guest();
		
		for(int i=0; i<N; i++) {
			System.out.print(i+1+".�̸� : ");
			guide.guest[i].setName(sc.next());
			System.out.print(i+1+".���� : ");
			guide.guest[i].setGender(sc.next());
			System.out.println("==============");
		}
		
		do {
			System.out.println();
			System.out.println("1.������ ����");
			System.out.println("2.������ ����");		
			System.out.println("3.����");
			System.out.print("����>>" );
			K= sc.nextInt();
			
			switch (K) {
		
				case 1:
					for(int i=0; i<N; i++) {
					System.out.println(i+1+".�̸� : " + guide.guest[i].getName());
					System.out.println(i+1+".���� : " + guide.guest[i].getGender());
					System.out.println(i+1+".������ : " + Guide.point);
					System.out.println("===============");
					}
					break;
					
				case 2:
					System.out.print("���� �����ϰڽ��ϱ�?");
					Guide.point = sc.next();
					System.out.println(Guide.point+"�� ������ ����");
					System.out.println("===============");
					break;
					
				case 3:
					System.out.println("����");
					System.out.println("===============");
					break;
						
					}
				}
			while(K!=3);
		
		
		}
		
		
	
}
