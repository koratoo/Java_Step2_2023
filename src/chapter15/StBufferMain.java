package chapter15;

public class StBufferMain {

	public static void main(String[] args) {
		
	
	StringBuffer buf = new StringBuffer("Nice Day");
	
	System.out.println(buf.toString());
	System.out.println(buf.length()); //8
	//StringBuffer �⺻ �뷮 16 + �߰�(8) =24
	System.out.println(buf.capacity());
	//24�� �Ѿ�� ������(25~50)������ ���� �ִ� �뷮*2+2=50
	buf.ensureCapacity(100);
	System.out.println(buf.capacity());
	
	}
}
