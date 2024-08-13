package Day07.Review;

public class Ex02_ThreeSixNine {

	public static void main(String[] args) {
		// 정수 1~100 까지 수를 반복하여 출력하면서,
		// 해당 수가 3 또는 6 도는 9가 될 때는
		// 자리수마다 369가 되는 개수 만큼 정수 대신 "*" 출력하는 프로그램을 작성하시오.
		for (int i = 1; i <= 100; i++) {
			int n = i / 10; 	// 십의 자리수
			int m = i % 10;		// 일의 자리수
			boolean a = (n == 3) || (n == 6) || (n == 9);
			boolean b = (m == 3) || (m == 6) || (m == 9);
			if (a && b)
				System.out.println("**");
			else if (a || b)
				System.out.println("*");
			else
				System.out.println(i);
		}
	}
}
