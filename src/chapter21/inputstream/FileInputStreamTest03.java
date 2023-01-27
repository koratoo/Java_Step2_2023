package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest03 {
	
	public static void main(String[] args) throws IOException {
		
		
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			//fis = new FileReader("input.txt");
			byte[] bs = new byte[10];
			int i;
			//fis.read() : 파일을 끝까지 읽으면 -1을 반환한다.
			while((i=fis.read(bs))!=-1){

				for(byte b:bs) {
					System.out.print((char)b+" ");
				}//10개 출력 완료
				System.out.println(" : "+i+"바이트 읽음");
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("end");
	}
	
}
