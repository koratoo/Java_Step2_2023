package chapter18.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTable {

	public static void main(String[] args) {
		//HashTable : ����ȭ
		Map<String, String> map = new Hashtable<String,String>();
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���.");
			System.out.print("���̵� : ");
			String id = sc.next();
			
			if(map.containsKey(id)) {
				System.out.print("��й�ȣ : ");
				String pw = sc.next();
				if(map.get(id).equals(pw)) {
					System.out.println("��й�ȣ ��ġ");
					break;
				}else {
					System.out.println("��й�ȣ ����ġ");
					continue;
				}//inner if
			}else {
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�.");
			}//out if
		}//while
	
	}
}
