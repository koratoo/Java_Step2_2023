package chapter14.clone;

public class SystemTimeMain {
	
	public static void main(String[] args) {
		
		long time1 =System.nanoTime();
		
		int sum =0;
		for(int i=1; i<=10000;i++) {
			sum+=i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1 ~ 10000 ������ �� : " +sum);
		System.out.println("��꿡 �ҿ�Ǵ� �ð� : " +(time2-time1)+" �����ʰ� �ҿ�Ǿ����ϴ�.");
		
	}

}
