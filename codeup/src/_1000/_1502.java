package _1000;

import java.util.Scanner;

public class _1502 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][]=new int [n][n];
		int sum=1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[j][i]=sum;
				sum++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
