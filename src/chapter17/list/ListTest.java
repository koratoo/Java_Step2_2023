package chapter17.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		
		ls.add("Hi!");
		ls.add("Happy!");
		ls.add("Nice!");
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}
		System.out.println();
		System.out.println("-----데이터 추가 후 -----");
		ls.add(3,"Day!");
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}
		System.out.println();
		System.out.println("-----데이터 삭제 후 -----");
		ls.remove(0);
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}
		
		
	}
}
