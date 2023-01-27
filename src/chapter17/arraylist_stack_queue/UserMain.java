package chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import chapter17.Member;

public class UserMain {

	public static void main(String[] args) {
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		
		while(true) {
			System.out.print("아이디 생성 : ");
			Scanner sc = new Scanner(System.in);
			
			UserInfo ui = new UserInfo();
			ui.setId(sc.next());
			
			//아이디 중복 체크
			Iterator<UserInfo> it = arr.iterator();
			
			//Next버튼이 활성화 되었는가?
			while(it.hasNext()) {
				
				
			}//while
			//중복된 아이디가 아니라면 pwd입력 
			arr.add(ui);
			
		}
	}
}
