package _1000;

import java.util.Scanner;

public class _1405 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		int arr[][]=new int [n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j-1]=sum;
				
//				int res =(n+i+j)%(n+1);
//				if (res==0) {
//					
//				}
//				arr[i-1][j-1]=
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
