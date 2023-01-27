package chapter19.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class TravelTest {

	public static void main(String[] args) {
		List<TravelCustomer> customerList = new ArrayList<>();
		//객체생성
		TravelCustomer customerToe = new TravelCustomer(10,1000,"토마스");
		TravelCustomer customerKim = new TravelCustomer(25,1100,"김마스");
		TravelCustomer customerPark = new TravelCustomer(21,1400,"박마스");
		
		//추가
		
		customerList.add(customerToe);		
		customerList.add(customerKim);		
		customerList.add(customerPark);		
		
		System.out.println("--고객 명단 추가된 순서대로 출력--");
		//map : 데이터를 특정 조건에 해당하는 값으로 변환해 줌
		customerList.stream().map(c -> c.getName()).forEach(s->System.out.println(s));
		
		System.out.println();
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		
		
		//filter : 특정 조건에 맞는 데이터만 걸러낸다.
		System.out.println("==20세 이상만 정렬하여 출력==");
		customerList.stream().filter(c->c.getAge()>20).
							  map(c->c.getName()).
							  sorted().
							  forEach(s->System.out.println(s));
		
		
		
	}
}
