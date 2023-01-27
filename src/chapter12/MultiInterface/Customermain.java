package chapter12.MultiInterface;

public class Customermain {

	public static void main(String[] args) {
		Customer customer = new Customer();
		System.out.println("---------Buy---------");
		Buy buy = customer;
	}
}
