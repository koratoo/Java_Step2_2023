package chapter08;

public class Student1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 studentLee = new Student1();
		studentLee.setStudentName("�����");
		System.out.println(studentLee.StudentName);
		//System.out.println(studentLee.getSerialNum());
		System.out.println(Student1.getSerialNum());//�̷��� ���� ���� �� ����.
		Student1.serialNum++;
		
		System.out.println();
		Student1 studentKim = new Student1();
		studentKim.setStudentName("��â��");
		System.out.println(studentKim.StudentName);
		//System.out.println(studentKim.getSerialNum());
		System.out.println(Student1.getSerialNum());//�̷��� ���� ���� �� ����.
		Student1.serialNum++;
		
		System.out.println();
		Student1 studentPark = new Student1();
		studentPark.setStudentName("��â��");
		System.out.println(studentPark.StudentName);
		//System.out.println(studentKim.getSerialNum());
		System.out.println(Student1.getSerialNum());//�̷��� ���� ���� �� ����.
		Student1.serialNum++;//10003
		
	}

}
