package chapter15;

public class Person {

	public String name;
	public int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name) {
		this.name=name;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//==========================================
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " +age;
	}
	
	
	
}
