package _1000;

import java.util.Scanner;

public class _1228 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double weight = sc.nextDouble();

		sc.close();
		double stWeight = (height - 100) * 0.9;
		double obesity = (weight - stWeight) * 100 / stWeight;
		if (obesity > 20) {
			System.out.print("비만");
		} else if (obesity > 10 && obesity <= 20) {
			System.out.print("과체중");
		} else {
			
			System.out.print("정상");
		}

	}
}
