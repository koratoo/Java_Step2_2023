package chapter14.String;

public class EqualsTest {

	public static void main(String[] args) {
		
		//String 클래스는 이미 toString으로 재정의 되어있다.
		String str1 = new String("test");
		String str2 = new String("test");
		
		Student studentLee = new Student(100,"이상한");
		Student studentLee3 = new Student(100,"이상한");
		
		Student studentLee2 = studentLee;		
		//동일한 주소의 두 인스턴스 비교, 물리적주소
		System.out.println("-----동일한 주소(==)의 두 인스턴스 비교------");
			if(studentLee == studentLee2){
				System.out.println("studentLee와 2의 주소는 같다.");
			}else {
				System.out.println("주소가 달라요.");
			}
			
		System.out.println("-----동일한 주소의 두 인스턴스 비교------");
			if(studentLee.equals(studentLee2)){
				System.out.println("studentLee와 2의 주소는 같다.");
			}else {
				System.out.println("주소가 달라요.");
			}
			
		System.out.println("-----동일한 주소의 두 인스턴스 비교------");
			if(studentLee == studentLee3){
				System.out.println("studentLee와 3의 주소는 같다.");
			}else {
				System.out.println("주소가 달라요.");
			}
		System.out.println("---------데이터 값 출력-------------");
		System.out.println("studentLee의 hash코드 : " + studentLee.hashCode());
		System.out.println("studentLee의 hash코드 : " + studentLee2.hashCode());
		
	}
}
