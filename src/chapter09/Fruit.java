package chapter09;

public class Fruit {
	
	private String sort;//분류
	private String season;//계절과일
	
	//생성자
	
	//setter
	public void Set1(String a, String b) {
		sort = a;
		season = b;
	}
	
	
	//getter
	public void Disp1() {
		System.out.println("분류 : " + sort);
		System.out.println("계절 : " + season);
	}
}
