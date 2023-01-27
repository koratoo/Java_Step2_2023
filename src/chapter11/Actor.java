package chapter11;

import java.util.Scanner;

public class Actor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[][] actor = { {"[송강호]", "박쥐", "괴물", "관상"}, 
	            { "[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게"}, 
	            { "[이병헌]", "지아이조", "레드", "광해"} };
		int cnt=0;
		System.out.print("검색할 배우 : ");
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
			System.out.println("일치 하는 사람이 없음");
		}	
	}
}
		


