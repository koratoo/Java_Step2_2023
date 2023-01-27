package chapter16.generic1;

class MyArrayG<String>{

	public void add(java.lang.String string) {
		// TODO Auto-generated method stub
		
	}

	public java.lang.String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class MyArrayTest2 {

	public static void main(String[] args) {
		
		MyArrayG<String> myArray1 = new MyArrayG<>();
		myArray1.add(new String("test"));
		String str = myArray1.get(0);
		System.out.println(str);
	}
}
