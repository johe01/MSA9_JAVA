package _1000;

import java.util.Scanner;

public class _1443_삽입정렬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int key, j=0;

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		sc.close();
		
		for (int i = 1; i < n; i++) {
			key=arr[i];
			for (j = i-1; j >= 0; j--) {
				if(arr[j]>key) {					
					arr[j+1]=arr[j];
				}
			}
			arr[j+1]=key;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
