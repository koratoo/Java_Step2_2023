package chapter11;

public class HttpServletMain {

	public static void main(String[] args) {
		
		method(new LoginService());
		method(new FileDownloadService());
	}
	
	//�޼���� method(static)
	private static void method(HttpServlet httpservlet) {

		httpservlet.service();
	}
}
