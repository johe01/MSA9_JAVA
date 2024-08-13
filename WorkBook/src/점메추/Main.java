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
					System.out.print("");
					String type = scanner.nextLine();
					
			}
		}
	}
	
	public static void logo() {
		System.out.println("::::::::::::::::::::::::::::::::::::::");
		System.out.println(" 점 심 메 뉴 추 천 ");
		System.out.println("::::::::::::::::::::::::::::::::::::::");
	}
}
