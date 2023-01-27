package chapter19;

public class TestMyNumber {

	public static void main(String[] args) {
		
		/*
		//인스턴스 변수방에 구현부를 저장한다.
		MyNumber max=(x,y) -> (x>=y)?x:y;
		//구현부를 대입하여 실행한다.
		System.out.println(max.getMax(10, 20));
		*/
		
		
		//람다를 안쓸 경우
		//추상메소드는 객체를 만들 수 없다.
		//오버라이드를 해야 객체를 만들어 줌
		MyNumber aa = new MyNumber() {
			
			@Override
			public int getMax(int x, int y) {

				int max=(x>=y)?x:y;
				return max;
			}
		};
	
		//==================================
		System.out.println(aa.getMax(10, 20));
	
	}
}
