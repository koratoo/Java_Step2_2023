package chapter13;

public class AnonyInner {

	public void test() {
		// TODO Auto-generated method stub

		new TestInter() { //TestInter ti = new TestInter(); -> ti.printData()
			
			@Override
			public void printData() {
				// TODO Auto-generated method stub
				System.out.println("ȭ����!!!");
			}//�߻� �޼ҵ� ����
		}.printData();
	}//�޼��� ��
	public static void main(String[] args) {
		
		AnonyInner in = new AnonyInner();
		in.test();
	}
}
