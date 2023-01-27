package chapter14.hashcode;

public class Key {

	public int number; //회원번호
	public int name;
	public int addr;
	
	public Key(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();//원래 힙메모리 16진수
	}

	@Override
	public boolean equals(Object obj) {
			if(obj instanceof Key) {
				Key compareKey = (Key) obj;
				if(this.number == compareKey.number) {
					return true;//값 일치
				}
			}
		return super.equals(obj);
	}
	
	
}
