package chapter08;

public class Student2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 studentLee = new Student2();
		studentLee.setStudentName("�����");
		System.out.println(studentLee.StudentName);
		//System.out.println(studentLee.getSerialNum());
		System.out.println(Student2.getSerialNum());//�̷��� ���� ���� �� ����.
		
		System.out.println();
		Student2 studentKim = new Student2();
		studentKim.setStudentName("��â��");
		System.out.println(studentKim.StudentName);
		//System.out.println(studentKim.getSerialNum());
		System.out.println(Student2.getSerialNum());//�̷��� ���� ���� �� ����.
		
		System.out.println();
		Student2 studentPark = new Student2();
		studentPark.setStudentName("��â��");
		System.out.println(studentPark.StudentName);
		//System.out.println(studentKim.getSerialNum());
		System.out.println(Student2.getSerialNum());//�̷��� ���� ���� �� ����.
		
		
	}

}
