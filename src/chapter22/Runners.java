package chapter22;

import java.util.Random;

public class Runners {

	public static void main(String[] args) {
		
		int[] playerRandom=new int[5];
		String[] playerJump = {"","","","",""};
		
		boolean finish = false;
		int finishPlayer=0;
		
		//도약거리
		for(int i=0;i<playerRandom.length;i++) {
			playerRandom[i]=new Random().nextInt(4);
		}
		
		//각 선수에게 도약거리 적용
		for(int i=0;i<playerJump.length;i++) {
			switch (playerRandom[i]) {
			case 0:
				playerJump[0]+="      ";
				break;
			case 1:
				playerJump[1]+="  ";
				break;
			case 2:
				playerJump[2]+="      ";
				break;
			case 3:
				playerJump[3]+="   ";
				break;
			case 4:
				playerJump[4]+="      ";
				break;
			}
		}
		
		for(int i=0;i<playerJump.length;i++) {
			System.out.println(i+1+"번 선수 점프 : "+playerJump[i]+"o/");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
		   }
		}
		
		
	}
}
