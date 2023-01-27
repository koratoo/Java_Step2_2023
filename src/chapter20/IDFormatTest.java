package chapter20;

public class IDFormatTest {

	private String userID;

	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException{
		if(userID==null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");
		}else if(userID.length() <8 || userID.length()>20) {
			throw new IDFormatException("���̵�� 8~20���� �����Դϴ�.");
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
			System.out.println(e);//�ڵ�� �޼���
			System.out.println(e.getMessage());//�޼����� ���
		}
		*/
		String userID="12345678";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {//�����ڰ� ���� Exception
			// TODO: handle exception
			System.out.println(e.getMessage());//�޽����� ���
		}
	}
	
}
