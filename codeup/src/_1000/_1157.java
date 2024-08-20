package _1000;

import java.util.Scanner;

public class _1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double distance=sc.nextDouble();
		sc.close();
		if(distance>=50 && distance<=60) {
			System.out.println("win");
		}
		else System.out.println("lose");
	}
}
