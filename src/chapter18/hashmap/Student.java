package chapter18.hashmap;

public class Student {

	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno+name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (sno == student.sno) && (name.equals(student.name));
		}else {
			return false;
		}
	
	}

	@Override
	public String toString() {

		return "학번 : "+sno +"번, 이름 : "+name+"님의 점수";
	}

	
	
	
}
