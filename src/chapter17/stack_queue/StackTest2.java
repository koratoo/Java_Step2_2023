package chapter17.stack_queue;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack=new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		return(arrayStack.remove(len-1));
	}
}

public class StackTest2 {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("Java");
		stack.push("Oracle");
		stack.push("Python");
		stack.push("Spring");
		
		System.out.println(stack.pop());
	}
}
