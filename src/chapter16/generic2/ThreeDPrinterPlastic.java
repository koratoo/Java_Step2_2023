package chapter16.generic2;

public class ThreeDPrinterPlastic {

	private Plastic plastic;
	
	
	public ThreeDPrinterPlastic() {
		plastic = new Plastic();
	}
	
	private Plastic getMaterial() {

		return plastic;
	}
	
	public void setMaterial(Plastic plastic) {
		// TODO Auto-generated method stub
		this.plastic = plastic;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
