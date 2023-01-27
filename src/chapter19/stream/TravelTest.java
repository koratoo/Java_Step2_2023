package chapter19.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class TravelTest {

	public static void main(String[] args) {
		List<TravelCustomer> customerList = new ArrayList<>();
		//��ü����
		TravelCustomer customerToe = new TravelCustomer(10,1000,"�丶��");
		TravelCustomer customerKim = new TravelCustomer(25,1100,"�踶��");
		TravelCustomer customerPark = new TravelCustomer(21,1400,"�ڸ���");
		
		//�߰�
		
		customerList.add(customerToe);		
		customerList.add(customerKim);		
		customerList.add(customerPark);		
		
		System.out.println("--�� ��� �߰��� ������� ���--");
		//map : �����͸� Ư�� ���ǿ� �ش��ϴ� ������ ��ȯ�� ��
		customerList.stream().map(c -> c.getName()).forEach(s->System.out.println(s));
		
		System.out.println();
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		
		
		//filter : Ư�� ���ǿ� �´� �����͸� �ɷ�����.
		System.out.println("==20�� �̻� �����Ͽ� ���==");
		customerList.stream().filter(c->c.getAge()>20).
							  map(c->c.getName()).
							  sorted().
							  forEach(s->System.out.println(s));
		
		
		
	}
}
