package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest01 {
	
	public static void main(String[] args) throws IOException {
		
		/*
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		*/
		//한글 깨짐
		//FileInputStream fis = null;
		FileReader fis =null;
		
		try {
			fis = new FileReader("input.txt");
			int i;
			//fis.read() : 파일을 끝까지 읽으면 -1을 반환한다.
			while((i=fis.read())!=-1){
				System.out.print((char)i +" ");
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println(e);
				//NullPointerException을 잡지 못해 죽음
				//catch
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println();
		System.out.println("end");
	}
	
}
