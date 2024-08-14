package Day07.Review;

import java.util.Scanner;

public class Ex05_Matrix {
	// 양의 정수 M과 N을 입력받아 저장하고,
	// M행 N열의 2차원 배열을 생성한다.
	// 각 요소의 값을 입력받고, 그대로 출력하시오.
	// (입력 예시)
	// M : 2
	// N : 3
	// 1 2 3
	// 4 5 6
	// (출력 예시)
	// 1 2 3
	// 4 5 6
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("M : ");
		int m = sc.nextInt();
		System.out.print("N : ");
		int n = sc.nextInt();
		
		// M행 N열의 2차원 배열 선언 및 생성
		int mat[][] = new int[m][n];
		
		// 입력
		// 2차원배열은 이중반복문 접근한다.
		// 바깥쪽 반복문			-반복변수 i : 행 접근
		// 안쪽 반복문				-반복변수 j : 열 접근
		// mat.length			: - 행의 개수
		// mat[i].length		: - 열의 개수
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// 출력
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		//foreach 으로 2차원 배열 출력
		for (int[] row : mat) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
