package chapter13;

import java.util.Scanner;

public class EnumMain {

	//enum은 배열 같다...
	public enum Item {Start,Pause,Exit} //0 1 2
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하세요[0:게임시작, 1:일시정지,2:게임종료] : " );
		
			int n = scan.nextInt();
			
			
			Item start = Item.Start;//start 의 0번
			Item pause = Item.Pause;//pause 의 1번
			Item exit  = Item.Exit;//exit 의 2번
				
				//ordinal : 기억된 숫자를 가져와라
				if(n == start.ordinal()) // n == 0 인가요?
					System.out.println("게임이 시작함");
				else if(n == pause.ordinal())
					System.out.println("게임이 정지함");//n==1인가요?
				else {
					System.out.println("게임이 끝남");//n==2인가요?
					return;//if를 빠져나간다. break : 여기서 끝
				}
				
			}//while end
		}
	}

