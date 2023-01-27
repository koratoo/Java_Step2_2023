package chapter13;

public class AnonyInner {

	public void test() {
		// TODO Auto-generated method stub

		new TestInter() { //TestInter ti = new TestInter(); -> ti.printData()
			
			@Override
			public void printData() {
				// TODO Auto-generated method stub
				System.out.println("화요팅!!!");
			}//추상 메소드 구현
		}.printData();
	}//메서드 끝
	public static void main(String[] args) {
		
		AnonyInner in = new AnonyInner();
		in.test();
	}
}
