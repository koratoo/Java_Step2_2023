package chapter13;

public class MemberInner {

	int a = 10;
	private int b =100;
	static int c = 200;
	
	//������
	public MemberInner() {}
	//�޼ҵ�
	
	//����Ŭ���� -> �̺�Ʈ ó���Ҷ� ���� ���ȴ�.
	class Inner{
		//�ʵ��
		//������
		//�޼ҵ�
		public void printData() {
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b);
			System.out.println("static c : " + c);
		}
		
		
	}
	public static void main(String[] args) {
		
//		MemberInner outer = new MemberInner();
//		outer.new Inner();
		
		MemberInner.Inner inner = new MemberInner().new Inner();
		inner.printData();
	}
}
