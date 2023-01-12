package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("관광객 수 : ");
		int N = sc.nextInt(); //관광객 수
		int K;
		Guide guide = new Guide(N);
		System.out.println("관광객 등록");
		Guest gst = new Guest();
		
		for(int i=0; i<N; i++) {
			System.out.print(i+1+".이름 : ");
			guide.guest[i].setName(sc.next());
			System.out.print(i+1+".성별 : ");
			guide.guest[i].setGender(sc.next());
			System.out.println("==============");
		}
		
		do {
			System.out.println();
			System.out.println("1.관광객 정보");
			System.out.println("2.목적지 변경");		
			System.out.println("3.종료");
			System.out.print("선택>>" );
			K= sc.nextInt();
			
			switch (K) {
		
				case 1:
					for(int i=0; i<N; i++) {
					System.out.println(i+1+".이름 : " + guide.guest[i].getName());
					System.out.println(i+1+".성별 : " + guide.guest[i].getGender());
					System.out.println(i+1+".목적지 : " + Guide.point);
					System.out.println("===============");
					}
					break;
					
				case 2:
					System.out.print("어디로 변경하겠습니까?");
					Guide.point = sc.next();
					System.out.println(Guide.point+"로 목적지 변경");
					System.out.println("===============");
					break;
					
				case 3:
					System.out.println("종료");
					System.out.println("===============");
					break;
						
					}
				}
			while(K!=3);
		
		
		}
		
		
	
}
