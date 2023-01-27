package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {

	public Class loadClass(String fileName,String className) 
			throws ClassNotFoundException, FileNotFoundException {
	
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		
		return c;
	}
	
	public static void main(String[] args)  {
		ThrowsException2 test = new ThrowsException2();
		
		try {
			test.loadClass("b.txt", "java.lang.String");
		}  catch (FileNotFoundException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	} 
	
	
}
