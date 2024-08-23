package generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// Powder 형으로 GenericPrinter 생성
		// setter, getter, GenericPrinter 출력
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		// Plastic 형
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		
	}
}
