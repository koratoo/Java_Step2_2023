package chapter17.stack;

import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {
		Object obj;
		
		Stack<Object> st = new Stack<Object>();
		
		if(st.empty()) {
			for(int i=1;i<=5;i++) {
				st.push(new String("Hi!" +i));
				System.out.println(" 입력 "+i+"번째 : "+st.peek());
			}
		}//if
		
		st.pop();
		System.out.println("현재 Top위치(peek) : "+st.peek());
		st.pop();
		System.out.println("현재 Top위치(peek) : "+st.peek());
		st.push(new String("Happy!!"));
		System.out.println("현재 Peek : "+st.peek());
		st.push(new String("Good!!"));
		System.out.println("현재 Peek : "+st.peek());
	}
}
