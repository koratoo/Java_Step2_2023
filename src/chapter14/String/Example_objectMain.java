package chapter14.String;

public class Example_objectMain {

	public static void main(String[] args) {
		
		Example_object v1 = new Example_object();
		v1.setValue("Test");
		
		System.out.println(v1.getValue());
		
		Example_object v2 = new Example_object();
		v2.setValue("100");
	}
}
