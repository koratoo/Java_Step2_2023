package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
	
		FileInputStream fis = null;
		//fis = new FileInputStream("a.txt");
	
		try {
			fis = new FileInputStream("a.txt");//open
		}catch(FileNotFoundException e){
			System.out.println(e);
		}finally {
			try {//close
				fis.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("Finally");
		}
		System.out.println("end");
	}
}
