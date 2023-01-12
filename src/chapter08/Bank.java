package chapter08;

public class Bank {

	private String point;
	private String tel;
	static float interest;
	public Bank(String point, String tel) {
		this.point=point;
		this.tel=tel;
	}
	
	public void getBank() {
		// TODO Auto-generated method stub
		System.out.println("지점 : "+point+"\n"+
								"전화번호 : " + tel +"\n" +
								"은행이자 : " + interest);
	}
}
