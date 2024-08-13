package _1000;

import java.util.Scanner;

public class _1505 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][]= new int [n][n];
		int sum=1;
		int temp=n-1;
		int x=0;
		int y=0;
		for (int i = 0; i < n-1; i++) {
			arr[0][y]=sum;
			sum++;
			y++;
		}
		x++;
		for (int i = 0; i < n-1; i++) {
			arr[x][y]=sum;
			sum++;
			x++;
		}
		y--;
		for (int i = 0; i < n-1; i++) {
			arr[x][y]=sum;
			sum++;
			
		}
//		int temp = 0;
//		for (int a = 0; a < arr[0].length; a++) {
//			arr[0][a]=sum;
//			sum++;
//		}
//		for (int b = 1; b < arr.length; b++) {
//			arr[b][n-1]=sum;
//			sum++;
//		}
//		for (int a = 1; a < arr[0].length; a++) {
//			arr[n-1][n-1-a]=sum;
//			sum++;
//		}
//		for (int b = 2; b < arr.length; b++) {
//			arr[n-b][0]=sum;
//		}
	}
}
