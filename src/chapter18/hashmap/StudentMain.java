package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class StudentMain {
	
	public static void main(String[] args) {
		//학생 정보, 점수
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		//중복 X
		map.put(new Student(1,"홍길동") , 95);
		map.put(new Student(2,"김민주") , 90);
		map.put(new Student(3,"이민주") , 85);
		map.put(new Student(4,"김길동") , 70);
		map.put(new Student(5,"이길동") , 65);
		
		//저장된 총 Entry수 출력
		System.out.println("총 Entry 수 : "+map.size());
		
		//하나씩 처리하는 방법
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator= keySet.iterator();
		while(keyIterator.hasNext()) {
			Student key = keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t" +key +" : " +value);
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		
		Student std;
		int input;
		String name;
			while(true)
			{
				System.out.print("학생 번호를 입력하세요 : ");
				input = sc.nextInt();
				System.out.print("학생 이름을 입력하세요 : ");
				name  = sc.next();
				std = new Student(input,name);
				System.out.println(std.toString() + " "+map.get(std));
				
			}
		
			
			
	}

}
