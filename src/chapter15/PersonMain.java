package chapter15;

public class PersonMain {

	public static void main(String[] args) throws ClassNotFoundException {
		//방법1
		Person person = new Person();
		Class pClass1 = person.getClass();
		//클래스의 정보 
		System.out.println(pClass1.getName());
		
		//방벙2
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		//방법3
		Class pClass3=Class.forName("chapter15.Person");
		System.out.println(pClass3.getName());
	}
}
