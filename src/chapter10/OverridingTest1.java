package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10001,"이순진");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomer());
		
		VIPCustomer customerKim = new VIPCustomer(10002, "김유신", 1004);
		customerKim.bonusPoint = 1000;
		System.out.println(customerKim.showCustomer());
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + "님이 " + customerLee.calcPrice(price) + "원을 지불 완료하였습니다.");
		System.out.println(customerKim.getCustomerName() + "님이 " + customerKim.calcPrice(price) + "원을 지불 완료하였습니다.");
	}
}
