package chapter19;

public class TestStringConcat {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="World!";
		
				
		//인스턴스 변수
		System.out.println("--인스턴스 변수--");
		StringConcatImple ci = new StringConcatImple();
		ci.makeString(s1, s2);
		
		//람다식
		System.out.println("--람다식--");
		StringConcat concat2=(s,v) ->System.out.println(s+" "+v);
		concat2.makeString(s1, s2);
		
		//익명 내부 클래스
		System.out.println("--익명 내부클래스 방식--");
		StringConcat concat3=new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+", "+s2);
			}
		};
		concat3.makeString(s1, s2);
	}
}
