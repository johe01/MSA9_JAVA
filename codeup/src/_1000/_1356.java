package _1000;

import java.util.Scanner;

public class _1356 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			// 첫 번째, 마지막 줄, 모든 열 *
			if((i==0)||(i==n-1)) {
				for (int j = 0; j < n; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			// 나머지 (2~(N-1)번 줄, 첫번째와 마지막 열만 *
			else {
				// 첫번째 열 *
				System.out.print("*");
				// 빈칸을 N-2 개 출력
				for (int j = 0; j < n-2; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}
		
		sc.close();
	}
}
