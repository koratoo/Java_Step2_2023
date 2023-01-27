package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest04 {
	
	public static void main(String[] args) throws IOException {
		
		
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			//fis = new FileReader("input.txt");
			byte[] bs = new byte[10];
			int i;
			//fis.read() : ������ ������ ������ -1�� ��ȯ�Ѵ�.
			while((i=fis.read(bs))!=-1){

				for(int j=0; j<i; j++) {
					System.out.print((char)bs[j]+" ");
				}//10�� ��� �Ϸ�
				System.out.println(" : "+i+"����Ʈ ����");
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("end");
	}
	
}
