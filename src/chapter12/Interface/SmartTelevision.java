package chapter12.Interface;

public class SmartTelevision implements Remote,Searchable{


	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Ƽ�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Ƽ�� ���ϴ�.");

		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume >  Remote.MAX_VOLUME) {
			this.volume = Remote.MAX_VOLUME;
		}else if(volume<Remote.MIN_VOLUME) {
			this.volume=Remote.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("���� Tv ���� : " + this.volume);
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "�� �˻��մϴ�.");
	}
}
