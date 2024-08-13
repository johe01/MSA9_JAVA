package 점메추;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MenuManager {

	private List<Menu> menus;

	public MenuManager() {
		menus = new ArrayList<>();
		// 한식 메뉴 5개 추가
		menus.add(new Menu("한식", "김치찌개", 8000, 0.5));
		menus.add(new Menu("한식", "된장찌개", 7000, 0.6));
		menus.add(new Menu("한식", "비빔밥", 9000, 0.4));
		menus.add(new Menu("한식", "불고기", 12000, 0.8));
		menus.add(new Menu("한식", "삼겹살", 1500, 1.0));

		// 중식 메뉴 5개 추가
		menus.add(new Menu("중식", "짜장면", 6000, 0.3));
		menus.add(new Menu("중식", "짬뽕", 7000, 0.3));
		menus.add(new Menu("중식", "탕수육", 15000, 0.4));
		menus.add(new Menu("중식", "마파두부", 12000, 0.5));
		menus.add(new Menu("중식", "군만두", 5000, 0.4));

		// 일식 메뉴 5개 추가
		menus.add(new Menu("일식", "초밥", 15000, 1.2));
		menus.add(new Menu("일식", "라멘", 9000, 1.0));
		menus.add(new Menu("일식", "돈까스", 10000, 0.9));

		// 양식 메뉴 5개 추가
		menus.add(new Menu("양식", "스테이크", 25000, 1.5));
		menus.add(new Menu("양식", "파스타", 13000, 1.3));
		menus.add(new Menu("양식", "피자", 20000, 1.4));
		menus.add(new Menu("양식", "리조또", 14000, 1.2));
		menus.add(new Menu("양식", "햄버거", 8000, 1.0));
	}
	// 메뉴 추가
	public void addMenu(String type, String name, double price, double distance) {
		menus.add(new Menu(type, name, price, distance));
		System.out.println("메뉴 추가: " + name);
	}
	
	// 메뉴 수정
	public void updateMenu(String name, String newType, String newName, double newPrice, double newDistance) {
		for (Menu menu : menus) {
			if (menu.getName().equals(name)) {
				menu.setType(newType);
				menu.setName(newName);
				menu.setPrice(newPrice);
				menu.setDistance(newDistance);
				System.out.println("메뉴 수정: "+ newName);
				return;
			}
		}
		System.out.println("메뉴를 찾을 수 없음: " + name);
	}
	
	// 메뉴 삭제
	public void deleteMenu(String name) {
		menus.removeIf(menu -> menu.getName().equals(name));
		System.out.println("메뉴 삭제: " + name);
		
	}
	
	// 전체 메뉴 출력
	public void printAllMenus() {
		System.out.println("전체 메뉴:");
		for (Menu menu : menus) {
			System.out.println(menu);
		}
	}
	
	// 종류별 메뉴 출력
	public void printMenusByType(String type) {
		System.out.println("종류 별 메뉴 출력 - " + type + ":");
		for (Menu menu : menus) {
			if (menu.getType().equalsIgnoreCase(type)) {
				System.out.println(menu);
			}
		}
	}
	
	// 메뉴 랜덤 추천
	public void recommendMenu(String type) {
		List<Menu> filteredMenus = new ArrayList<>();
		for (Menu menu : menus) {
			if (type == null || menu.getType().equalsIgnoreCase(type)) {
				filteredMenus.add(menu);
			}
		}
		
		if (filteredMenus.isEmpty()) {
			System.out.println("등록된 메뉴가 없습니다.");
		}
		else {
			Random random = new Random();
			Menu recommendedMenu = filteredMenus.get(random.nextInt(filteredMenus.size()));
			System.out.println("추천 메뉴 :");
			System.out.println("★★★★★★★★★★★★★★★★★★★★★");
			System.out.println(recommendedMenu);
			System.out.println("★★★★★★★★★★★★★★★★★★★★★");
		}
	}
}
