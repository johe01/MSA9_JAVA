package _1000;

import java.util.Scanner;

public class _1226 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lotto[] = new int[7];
		int mine[] = new int[6];
		int sum = 0;
		int bonus = 0;
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = sc.nextInt();
		}
		for (int i = 0; i < mine.length; i++) {
			mine[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = 0; j < mine.length; j++) {
				if (lotto[i] == mine[j])
					sum++;
			}
		}
		for (int i = 0; i < mine.length; i++) {
			if (lotto[6] == mine[i])
				bonus = 1;
		}
		switch (sum) {
		case 6:
			System.out.println(1);
			break;
		case 5:
			if (bonus == 1)
				System.out.println(2);
			else
				System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;
		case 3:
			System.out.println(5);
			break;

		default:
			System.out.println(0);
			break;
		}
	}
}
