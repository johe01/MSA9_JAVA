package _1000;

import java.util.Scanner;

public class _1357 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		for (int i = 1; i <=n-1; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//		for (int i = n-1; i >=1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();	
//		}
		// 방법 바꿔서 다시
		for (int i = 0; i < 2*n-1; i++) {
			if (i<n) {
				for (int j = 0; j < i+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for (int j = 0; j < 2*n-1-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
		// 풀이
		for (int i = 1; i <= 2*n-1; i++) {
			if (i<=n) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for (int j = 1; j <= 2*n-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
}
