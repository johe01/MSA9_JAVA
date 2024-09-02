package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] str = a.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (Integer.parseInt(str[i])==0) break;
			System.out.println(str[i]);
		}
		
		
	}
}
