package chapter19;

@FunctionalInterface
public interface Add {
	//@FunctionalInterface : �������̽��� �����ϵ� �߻�޼ҵ�� �ϳ��� ������ �� ����
	public int add(int x, int y);
	
	public default int sub(int n1, int n2) {
		return 0;
	}
}
