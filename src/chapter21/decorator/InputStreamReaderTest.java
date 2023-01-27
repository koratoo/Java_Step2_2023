package chapter21.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		//FileInputStream : 파일로 저장되어 있는 것만 읽음
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			//System.in은 바이트 단위로 처리가 가능함
			//InputStreamReader isr2 = new InputStreamReader(System.in);
			
			int i;
			while((i=isr.read())!=-1) {
				System.out.println((char)i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		/*
		
		//Socket의 예
		Socket socket = new Socket();
		try {
			InputStreamReader ir = new InputStreamReader(socket.getInputStream());
			//한줄씩 읽어들이기
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
		
	}
}
