package chapter19;

public class TestAdd {

	public static void main(String[] args) {
		//람다식 : 매개변수 부터 시작함
		//Lamda : 메소드 이름 없이 구현부만 존재함
		//-> : C언어의 포인터
		//Add라는 addF클래스에 x,y매개변수의 합을 담는다.
		//이름 없이 값만 노출 / 간결한 함수
		Add addF=(x,y) -> x+y;
		
		System.out.println(addF.add(3, 5));
		
	}
}
