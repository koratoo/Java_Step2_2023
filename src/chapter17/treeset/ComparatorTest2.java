package chapter17.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return (s1.compareTo(s2)) * -1;
	}
	
}
public class ComparatorTest2 {

	public static void main(String[] args) {
		//오름차순
		//Set<String> set = new TreeSet<>();
		//내림차순
		Set<String> set = new TreeSet<>(new MyCompare());
		set.add("aaa");
		set.add("bbb");
		set.add("hhh");
		set.add("ccc");
		
		System.out.println(set);
		
	}
}
