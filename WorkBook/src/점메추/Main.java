package 점메추;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MenuManager menuManager = new MenuManager();

		logo();

		while (true) {
			System.out.println("::::::::::::::::::");
			System.out.println("\n1. 메뉴 추가하기");
			System.out.println("2. 메뉴 수정하기");
			System.out.println("3. 메뉴 삭제하기");
			System.out.println("4. 메뉴 전체출력");
			System.out.println("5. 종류별로 메뉴 출력하기");
			System.out.println("6. 종류별 메뉴 추천★");
			System.out.println("7. 메뉴 추천★");
			System.out.println("0. 종료하기");

			System.out.print("\n번호 선택(0~7): ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("메뉴 종류 (예. 한식, 중식): ");
				String type = scanner.nextLine();
				System.out.print("메뉴 이름: ");
				String name = scanner.nextLine();
				System.out.print("메뉴 가격: ");
				double price = scanner.nextDouble();
				System.out.print("식당 거리 (km): ");
				double distance = scanner.nextDouble();
				menuManager.addMenu(type, name, price, distance);
				break;
			case 2:
				System.out.print("수정할 메뉴 이름: ");
				String oldName = scanner.nextLine();
				System.out.print("(수정) 메뉴 종류: ");
				String newType = scanner.nextLine();
				System.out.print("(수정) 메뉴 이름: ");
				String newName = scanner.nextLine();
				System.out.print("(수정) 메뉴 가격: ");
				double newPrice = scanner.nextDouble();
				System.out.print("(수정) 식당 거리 (km): ");
				double newDistance = scanner.nextDouble();
				menuManager.updateMenu(oldName, newType, newName, newPrice, newDistance);
				break;
			case 3:
				System.out.print("삭제할 메뉴 이름: ");
				String deleteName = scanner.nextLine();
				menuManager.deleteMenu(deleteName);
				break;
			case 4:
				menuManager.printAllMenus();
				break;
			case 5:
				System.out.print("출력할 메뉴 종류 (예. 한식, 중식): ");
				String typeToPrint = scanner.nextLine();
				menuManager.printMenusByType(typeToPrint);
				break;
			case 6:
				System.out.print("추천 받을 메뉴 종류 (예. 한식, 중식): ");
				String typeToRecommend = scanner.nextLine();
				if (typeToRecommend.isEmpty()) {
					typeToRecommend = null;
				}
				menuManager.recommendMenu(typeToRecommend);
				break;
			case 7:
				System.out.println(":::::::::::: 점메츄~! ::::::::::::");
				menuManager.recommendMenu(null);
				break;
			case 0:
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("유효한 번호를 입력해주세요!");
			}
		}
	}

	public static void logo() {
		System.out.println("::::::::::::::::::::::::::::::::::::::");
		System.out.println(" 점 심 메 뉴 추 천 ");
		System.out.println("::::::::::::::::::::::::::::::::::::::");
	}
}
