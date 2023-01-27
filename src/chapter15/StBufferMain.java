package chapter15;

public class StBufferMain {

	public static void main(String[] args) {
		
	
	StringBuffer buf = new StringBuffer("Nice Day");
	
	System.out.println(buf.toString());
	System.out.println(buf.length()); //8
	//StringBuffer 기본 용량 16 + 추가(8) =24
	System.out.println(buf.capacity());
	//24를 넘어가면 허용범위(25~50)까지는 갖고 있는 용량*2+2=50
	buf.ensureCapacity(100);
	System.out.println(buf.capacity());
	
	}
}
