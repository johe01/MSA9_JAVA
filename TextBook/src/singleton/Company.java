package singleton;

class Car{
	static int carNum=10000;
	int num;
	public Car() {
		num = ++carNum;
	}
	public int getCarNum() {
		return num;
	}
}

public class Company {
	private static Company instance = new Company();
	private Company() { }
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	public Car createCar() {
		return new Car();
	}
}
