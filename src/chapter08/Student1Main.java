package chapter08;

public class Student1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 studentLee = new Student1();
		studentLee.setStudentName("이재민");
		System.out.println(studentLee.StudentName);
		//System.out.println(studentLee.getSerialNum());
		System.out.println(Student1.getSerialNum());//이렇게 쓰는 것이 더 좋다.
		Student1.serialNum++;
		
		System.out.println();
		Student1 studentKim = new Student1();
		studentKim.setStudentName("김창우");
		System.out.println(studentKim.StudentName);
		//System.out.println(studentKim.getSerialNum());
		System.out.println(Student1.getSerialNum());//이렇게 쓰는 것이 더 좋다.
		Student1.serialNum++;
		
		System.out.println();
		Student1 studentPark = new Student1();
		studentPark.setStudentName("박창훈");
		System.out.println(studentPark.StudentName);
		//System.out.println(studentKim.getSerialNum());
		System.out.println(Student1.getSerialNum());//이렇게 쓰는 것이 더 좋다.
		Student1.serialNum++;//10003
		
	}

}
