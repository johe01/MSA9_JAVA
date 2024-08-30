package Test;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			
			// 작성 위치
			int op = scanner.nextInt();
			switch (op) {
			case 1:
				System.out.print("예금액> ");
				balance+=scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				int withdraw = scanner.nextInt();
				if(balance>withdraw)
					balance-=withdraw;
				else System.out.println("잔고가 부족합니다.");
				break;
			case 3:
				System.out.println("잔고> "+ balance);
				break;
			case 4:
				run=false;
				break;
			default:
				System.out.println("1~4 중에 입력해주세요.");
				break;
			}
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
		
	}
}
