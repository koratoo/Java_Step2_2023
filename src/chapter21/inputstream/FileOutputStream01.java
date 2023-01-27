package chapter21.inputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {

	public static void main(String[] args) throws IOException {
		
		//FileOutputStream fos = new FileOutputStream("output1.txt");//��ü����
		FileOutputStream fos = new FileOutputStream("output2.txt");//Ư���ε��� ����
		try (fos){
			byte[] bs = new byte[26];
			byte data=65;
			
			for(int i=0; i<bs.length;i++) {
				bs[i] =data;
				data++;
				//System.out.print((char)bs[i]+" ");
			}
			//fos.write(bs);
			fos.write(bs,2,10);//2������� 10�� ����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
		
	}
}
