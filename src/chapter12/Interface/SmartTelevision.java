package chapter12.Interface;

public class SmartTelevision implements Remote,Searchable{


	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("티비를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("티비를 끕니다.");

		
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
		System.out.println("현재 Tv 볼륨 : " + this.volume);
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색합니다.");
	}
}
