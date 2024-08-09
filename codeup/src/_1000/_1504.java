package _1000;

import java.util.Scanner;

public class _1504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][]= new int [n][n];
		int sum=1;
		for (int i = 0; i < n; i++) {
			if (0==i%2) {
				for (int j = 0; j < n; j++) {
					arr[j][i]=sum;
					sum++;
					}
				}
			else {
				for (int j = n-1; j>=0; j--) {
					arr[j][i]=sum;
					sum++;
				}
			}		
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {

				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
