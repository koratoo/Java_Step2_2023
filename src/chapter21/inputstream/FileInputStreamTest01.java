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
		//�ѱ� ����
		//FileInputStream fis = null;
		FileReader fis =null;
		
		try {
			fis = new FileReader("input.txt");
			int i;
			//fis.read() : ������ ������ ������ -1�� ��ȯ�Ѵ�.
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
				//NullPointerException�� ���� ���� ����
				//catch
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println();
		System.out.println("end");
	}
	
}
