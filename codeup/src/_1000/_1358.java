package _1000;

import java.util.Scanner;

public class _1358 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < ((n+1)/2); i++) {
			for (int j = 1; j <= n/2-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=(i*2+1); j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		System.out.println();
		
		for (int i = 1; i <= ((n+1)/2); i++) {
			for (int j = 1; j <=((n+1)/2)-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=(i*2-1); j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		sc.close();
	}
}
