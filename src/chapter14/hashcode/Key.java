package chapter14.hashcode;

public class Key {

	public int number; //ȸ����ȣ
	public int name;
	public int addr;
	
	public Key(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();//���� ���޸� 16����
	}

	@Override
	public boolean equals(Object obj) {
			if(obj instanceof Key) {
				Key compareKey = (Key) obj;
				if(this.number == compareKey.number) {
					return true;//�� ��ġ
				}
			}
		return super.equals(obj);
	}
	
	
}
