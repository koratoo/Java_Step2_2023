package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		//    �θ�   = �ڽ�(�ڵ� ����ȯ)
		Customer vc = new VIPCustomer(10003,"������",20000); 
		System.out.println(vc.showCustomer());
	
		if(vc instanceof Customer) {
			System.out.println("vc�� Customer�� �ڽ�Ŭ�����Դϴ�.");
		}
	}
}
