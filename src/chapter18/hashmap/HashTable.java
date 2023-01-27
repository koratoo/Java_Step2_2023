package chapter18.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTable {

	public static void main(String[] args) {
		//HashTable : 동기화
		Map<String, String> map = new Hashtable<String,String>();
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.print("아이디 : ");
			String id = sc.next();
			
			if(map.containsKey(id)) {
				System.out.print("비밀번호 : ");
				String pw = sc.next();
				if(map.get(id).equals(pw)) {
					System.out.println("비밀번호 일치");
					break;
				}else {
					System.out.println("비밀번호 불일치");
					continue;
				}//inner if
			}else {
				System.out.println("입력하신 아이디는 존재하지 않습니다.");
			}//out if
		}//while
	
	}
}
