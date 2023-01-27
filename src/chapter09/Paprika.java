package chapter09;

public class Paprika extends Vegetable{

	private String color;
	private int price;
	private String name;
	
	//setter
		public void Set2(String a, int b, String c) {
			color = a;
			price = b;
			name = c;
		}
		
		public void Disp1() {
			System.out.println("----paprika----");
			System.out.println("분류 : " + sort);
			System.out.println("계절 : " + season);
			System.out.println("이름 : " + super.name);//부모의 이름을 쓰고 싶을때
			
		}
		
		public void Disp2() {
			System.out.println("----paprika----");
			System.out.println("분류 : " + sort);
			System.out.println("계절 : " + season);
			System.out.println("이름 : " + name);//부모의 이름을 쓰고 싶을때
			System.out.println("색깔 : " + color);
			System.out.println("가격 : " + price);
		}
}
