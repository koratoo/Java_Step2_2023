package chapter19.stream;

import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{
	
	//BinaryOperator : FunctionalInterface
	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length)
			
			return s1;
		else 
			return s2;
	}
}
public class RaduceTest {

	public static void main(String[] args) {
		String[] greetings = {"æ»≥Á«œººø‰","hi","hello","Good Morning"};
		
	
		
	}
}
