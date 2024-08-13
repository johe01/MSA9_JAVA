package 점메추;

public class Menu {

	private String type; // 메뉴 종류 (한식, 중식, 일식 등)
	private String name; // 메뉴 이름
	private double price; // 가격
	private double distance; // 거리 (단위: km)

	public Menu(String type, String name, double price, double distance) {
		this.type = type;
		this.name = name;
		this.price = price;
		this.distance = distance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return String.format("종류: %s\n이름: %s\n가격: %.2f\n거리: %.2f km", type, name, price, distance);
	}

}
