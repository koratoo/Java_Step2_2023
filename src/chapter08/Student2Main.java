package chapter08;

public class Student2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 studentLee = new Student2();
		studentLee.setStudentName("이재민");
		System.out.println(studentLee.StudentName);
		//System.out.println(studentLee.getSerialNum());
		System.out.println(Student2.getSerialNum());//이렇게 쓰는 것이 더 좋다.
		
		System.out.println();
		Student2 studentKim = new Student2();
		studentKim.setStudentName("김창우");
		System.out.println(studentKim.StudentName);
		//System.out.println(studentKim.getSerialNum());
		System.out.println(Student2.getSerialNum());//이렇게 쓰는 것이 더 좋다.
		
		System.out.println();
		Student2 studentPark = new Student2();
		studentPark.setStudentName("박창훈");
		System.out.println(studentPark.StudentName);
		//System.out.println(studentKim.getSerialNum());
		System.out.println(Student2.getSerialNum());//이렇게 쓰는 것이 더 좋다.
		
		
	}

}
