package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1==myCompany2);
		
		Car mySonata = myCompany1.createCar();
		Car yourSonata = myCompany2.createCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}
}
