package chapter17.list;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이길동");
		list.add("삼길동");
		list.add("사길동");
		list.add("오길동");
		System.out.println(list);
		
		System.out.println("list[0] : "+ list.get(0));
		System.out.println("list[2] : "+ list.get(2));
	}
}
