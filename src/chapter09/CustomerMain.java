package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		
		//VIP��
		int price = 10000;
		System.out.println("-------------------VIP��------------------");
		VIPCustomer vipcs = new VIPCustomer(1004, "ȫ�浿", 900);
		
		//customer -> VIP�� �Ѿ���鼭 ������ ������
		int vipprice = vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"���� "+vipprice+"���� ���� �Ϸ��Ͽ����ϴ�.");
		System.out.println(vipcs.showCustomer());
		System.out.println("-------------------�Ϲݰ�------------------");
		Customer cus = new Customer();
		int cusprice = cus.calcPrice(price);
		cus.customerName="�輱��";
		
		System.out.println(cus.getCustomerName()+"���� ���ұݾ��� "+cusprice+"���Դϴ�.");
		System.out.println(cus.showCustomer());
				
	}
}
