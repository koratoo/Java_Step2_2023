package chapter14.String;

public class Student {

	int studentId;
	String studentName;
	//»ı¼ºÀÚ
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentId+", " +studentName;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentId;
	}
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Student) {
			Student std  = (Student) obj;
			if(studentId==std.studentId)
				return true;
			else 
				return false;
		}
		return super.equals(obj);
	}
	
	
	
	
	
	
}
