package chapter17.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;



public class ComparatorTest1 {

	public static void main(String[] args) {
		
		//default�� �������̵� �Ǿ� �ִ� String / Integer
		Set<String> set = new TreeSet<>();
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
	}
}
