package chapter15;

public class StBufferMain2 {

	public static void main(String[] args) {
		String javaStr = new String("Java");
		//ó�� ������ �޸��� �ּ�
		System.out.println("javaStr�� ó�� ������ �޸� �ּ� : " +System.identityHashCode(javaStr));
	
		StringBuffer buffer = new StringBuffer(javaStr);
		System.out.println("���� �� buffer �޸��ּ� : " + System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append("JSP ");
		buffer.append("programming is fun!!");
		System.out.println("���� �� buffer �޸��ּ� : " + System.identityHashCode(buffer));
		
		javaStr=buffer.toString();
		System.out.println(buffer);
		System.out.println("���� ������� javaStr �Ÿ� �ּ� : " +System.identityHashCode(javaStr));
	}
}
