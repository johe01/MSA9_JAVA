package _1000;

import java.util.Scanner;

public class _1231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cal = sc.nextLine();
		sc.close();
		int result = 0;
		double div = 0.0;

		if (cal.contains("+")) {
			String num[] = cal.split("\\+");
			result = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
			System.out.print(result);
		} else if (cal.contains("-")) {
			String num[] = cal.split("-");
			result = Integer.parseInt(num[0]) - Integer.parseInt(num[1]);
			System.out.print(result);
		} else if (cal.contains("/")) {
			String num[] = cal.split("/");
			div = (double)Integer.parseInt(num[0]) / Integer.parseInt(num[1]);
			System.out.printf("%.2f", div);
		} else if (cal.contains("*")) {
			String num[] = cal.split("\\*");
			result = Integer.parseInt(num[0]) * Integer.parseInt(num[1]);
			System.out.print(result);
		}

	}
}
