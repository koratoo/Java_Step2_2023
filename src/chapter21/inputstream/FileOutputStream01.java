package chapter21.inputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {

	public static void main(String[] args) throws IOException {
		
		//FileOutputStream fos = new FileOutputStream("output1.txt");//전체저장
		FileOutputStream fos = new FileOutputStream("output2.txt");//특정인덱스 저장
		try (fos){
			byte[] bs = new byte[26];
			byte data=65;
			
			for(int i=0; i<bs.length;i++) {
				bs[i] =data;
				data++;
				//System.out.print((char)bs[i]+" ");
			}
			//fos.write(bs);
			fos.write(bs,2,10);//2번방부터 10개 저장
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("저장이 완료 되었습니다.");
		
	}
}
