package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		
		//VIP고객
		int price = 10000;
		System.out.println("-------------------VIP고객------------------");
		VIPCustomer vipcs = new VIPCustomer(1004, "홍길동", 900);
		
		//customer -> VIP로 넘어오면서 가격이 변동됨
		int vipprice = vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"님이 "+vipprice+"원을 지불 완료하였습니다.");
		System.out.println(vipcs.showCustomer());
		System.out.println("-------------------일반고객------------------");
		Customer cus = new Customer();
		int cusprice = cus.calcPrice(price);
		cus.customerName="김선달";
		
		System.out.println(cus.getCustomerName()+"님의 지불금액은 "+cusprice+"원입니다.");
		System.out.println(cus.showCustomer());
				
	}
}
