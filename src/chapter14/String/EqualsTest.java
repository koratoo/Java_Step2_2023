package chapter14.String;

public class EqualsTest {

	public static void main(String[] args) {
		
		//String Ŭ������ �̹� toString���� ������ �Ǿ��ִ�.
		String str1 = new String("test");
		String str2 = new String("test");
		
		Student studentLee = new Student(100,"�̻���");
		Student studentLee3 = new Student(100,"�̻���");
		
		Student studentLee2 = studentLee;		
		//������ �ּ��� �� �ν��Ͻ� ��, �������ּ�
		System.out.println("-----������ �ּ�(==)�� �� �ν��Ͻ� ��------");
			if(studentLee == studentLee2){
				System.out.println("studentLee�� 2�� �ּҴ� ����.");
			}else {
				System.out.println("�ּҰ� �޶��.");
			}
			
		System.out.println("-----������ �ּ��� �� �ν��Ͻ� ��------");
			if(studentLee.equals(studentLee2)){
				System.out.println("studentLee�� 2�� �ּҴ� ����.");
			}else {
				System.out.println("�ּҰ� �޶��.");
			}
			
		System.out.println("-----������ �ּ��� �� �ν��Ͻ� ��------");
			if(studentLee == studentLee3){
				System.out.println("studentLee�� 3�� �ּҴ� ����.");
			}else {
				System.out.println("�ּҰ� �޶��.");
			}
		System.out.println("---------������ �� ���-------------");
		System.out.println("studentLee�� hash�ڵ� : " + studentLee.hashCode());
		System.out.println("studentLee�� hash�ڵ� : " + studentLee2.hashCode());
		
	}
}
