package chapter20;

public class IDFormatTest {

	private String userID;

	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException{
		if(userID==null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}else if(userID.length() <8 || userID.length()>20) {
			throw new IDFormatException("아이디는 8~20글자 사이입니다.");
		}
		this.userID=userID;
	}
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		/*
		String  userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			// TODO: handle exception
			System.out.println(e);//코드와 메세지
			System.out.println(e.getMessage());//메세지만 출력
		}
		*/
		String userID="12345678";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {//개발자가 만든 Exception
			// TODO: handle exception
			System.out.println(e.getMessage());//메시지만 출력
		}
	}
	
}
