package chapter16.generic2;

public class ThreeDPrinterMain {

	public static void main(String[] args) {
		ThreeDPrinter printerPowder = new ThreeDPrinter();
		Powder p1 = new Powder();
		p1.doprinting();	
		printerPowder.setMaterial(p1);
		
		Powder p2 = (Powder) printerPowder.getMaterial();
		System.out.println(p2);
		
		System.out.println("=============Generic Powder==============");
		ThreeDPrinter<Powder> GenericPowder = new ThreeDPrinter<Powder>();
		
		GenericPowder.setMaterial(new Powder());
		Powder powder = (Powder) GenericPowder.getMaterial();
		System.out.println(powder);
	}
}
