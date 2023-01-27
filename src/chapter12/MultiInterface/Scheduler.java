package chapter12.MultiInterface;

public interface Scheduler {
	//다음 고객의 콜 가져오기
	public void getNextCall();
	//상담원에게 콜 전달
	public void sendCallToAgent();
	
}
