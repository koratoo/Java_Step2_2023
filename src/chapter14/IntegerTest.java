package chapter14;

//Wrapper 
public class IntegerTest {

	public static void main(String[] args) {
		
		//��Ҽ� ������ �ƴѵ� �� ������ �����̶� �������� ����
		//Integer i = new Integer(100); 
		
		Integer num = 100; // ����ڽ� : �Ϲ��ڷ� => Ŭ������ ����
		
		int iNum = num.intValue(); // ��ڽ� : Ŭ���� => �Ϲ��ڷ�
		
		int jNum = 200;
		
		int sum = iNum+jNum;
		System.out.println(sum);
		
		//��ڽ�
		int total = num + jNum;// num.intValue(jNum)
		System.out.println(total);
		
		//����ڽ� Ŭ���� Ÿ��
		//�Ϲ� Ÿ�� ��ڽ�
		Integer i = jNum;
		System.out.println(i);//Integer.valueOf(jNum)�� ����
	}
}
