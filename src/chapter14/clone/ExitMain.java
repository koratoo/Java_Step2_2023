package chapter14.clone;

public class ExitMain {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				//System.exit(i); ->완전히 프로젝트를 이탈
				break;
			}
		}//for end
		
		System.out.println("종료 코드");
	}
}
