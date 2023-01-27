package chapter16.generic2;

public class ThreeDPrinter<T> {

	private T material;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
}
