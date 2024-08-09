package _1000;

/**
 * 두 정수(a, b)를 입력받아
	a와 b가 같으면 1을, 같지 않으면 0을 출력하는 프로그램을 작성해보자.
 */

import java.util.Scanner;

public class _1050 {
	
	public static void main(String[] args) {
		// 1. 정수 2개 입력
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		// 2. (조건) ? 참 : 거짓;
		int result = (a==b)?1:0;
		System.out.println(result);
		
		sc.close();
	}

}
