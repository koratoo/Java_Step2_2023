package chapter20;

public class AutoCloseObj implements AutoCloseable{

	//AutoCloseable : try(...)������ ����� ��ü�鿡 ���ؼ� try�� ����Ǵ� �������� �ڿ��� �ڵ����� �������ִ� ���
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("���ҽ��� close() �Ǿ����ϴ�.");
	}

	
}
