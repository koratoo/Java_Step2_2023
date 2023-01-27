package chapter13;

class outer{
	int outNum=100;
	static int sNum=200;
	
	Runnable getRunnable(int i) {
		int num=100;//final
		
		class MyRunnable implements Runnable{
			int localNum = 10;
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//num = 200;
			}//run
			
		}//Runnable
		
		return null;
	}
}
public class LocalInner2 {

	public static void main(String[] args) {
		
	}
}
