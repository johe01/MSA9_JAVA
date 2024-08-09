package _1000;

import java.util.Scanner;

public class _1354 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i >=1; i--) {
			// 1 2 3 4 5 : i
			// 5 4 3 2 1 : 6-i
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		sc.close();
	}
}
