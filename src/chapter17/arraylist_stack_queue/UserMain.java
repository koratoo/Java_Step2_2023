package chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import chapter17.Member;

public class UserMain {

	public static void main(String[] args) {
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		
		while(true) {
			System.out.print("���̵� ���� : ");
			Scanner sc = new Scanner(System.in);
			
			UserInfo ui = new UserInfo();
			ui.setId(sc.next());
			
			//���̵� �ߺ� üũ
			Iterator<UserInfo> it = arr.iterator();
			
			//Next��ư�� Ȱ��ȭ �Ǿ��°�?
			while(it.hasNext()) {
				
				
			}//while
			//�ߺ��� ���̵� �ƴ϶�� pwd�Է� 
			arr.add(ui);
			
		}
	}
}
