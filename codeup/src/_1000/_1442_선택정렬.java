package _1000;

import java.util.Scanner;

public class _1442_선택정렬 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		
		}
		sc.close();

		// 선택 정렬
		for (int i = 0; i < n - 1; i++) {
			int min=i;
			for (int j = i + 1; j < n; j++) {
				if (arr[min] > arr[j]) {
					min=j;
				}
			}
			// swap
			// arr[i]와 arr[j] 교환
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
