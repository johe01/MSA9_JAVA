package _1000;

import java.util.Scanner;

public class _1271 {

	public static void main(String[] args) {
		// 1. n 입력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		// 2. n번 반복하면서 n개의 데이터를 입력
		for (int i = 1; i <= n; i++) {
			int input = sc.nextInt();
			// 3. 최댓값과 입력데이터 비교
			// 4. 최댓값보다 입력데이터가 더 크면 최댓값에 입력데이터 대입
			if (input>max) max= input;	
		}	
		// 5. 최댓값을 출력
		System.out.println(max);
		sc.close();
	}
}
