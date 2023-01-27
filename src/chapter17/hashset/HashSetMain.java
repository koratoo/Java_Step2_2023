package chapter17.hashset;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add(new String("임정희"));
		hs.add(new String("박현정"));
		hs.add(new String("홍연희"));
		hs.add(new String("강감찬"));
		
		System.out.println(hs);
		
		hs.add(new String("강감찬"));
	}
}
