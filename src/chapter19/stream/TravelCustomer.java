package chapter19.stream;

public class TravelCustomer {

	private int age;
	private int price;
	private String name;
	 
	
	
	public TravelCustomer(int age, int price, String name) {
		this.age = age;
		this.price = price;
		this.name = name;
	}


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


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "TravelCustomer [age=" + age + ", price=" + price + "]";
	}
	
	
}
