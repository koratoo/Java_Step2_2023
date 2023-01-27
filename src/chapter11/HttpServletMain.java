package chapter11;

public class HttpServletMain {

	public static void main(String[] args) {
		
		method(new LoginService());
		method(new FileDownloadService());
	}
	
	//메서드명 method(static)
	private static void method(HttpServlet httpservlet) {

		httpservlet.service();
	}
}
