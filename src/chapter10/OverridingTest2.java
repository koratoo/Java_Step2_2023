package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		//    부모   = 자식(자동 형변환)
		Customer vc = new VIPCustomer(10003,"김유진",20000); 
		System.out.println(vc.showCustomer());
	
		if(vc instanceof Customer) {
			System.out.println("vc는 Customer의 자식클래스입니다.");
		}
	}
}
