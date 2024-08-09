package _1000;

import java.util.Scanner;

public class _1253 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//
		if(a>b) {
			int temp =a;
			a=b;
			b = temp;
		}
		for (int i = a; i <= b; i++) {
			System.out.print(i+" ");
		}
//		int max, min;
//		if (a>b) {
//			max=a;
//			min=b;		
//		}
//		else {
//			max=b;
//			min=a;	
//		}
//		for (int i = min; i <=max; i++) {
//			System.out.print(i+" ");
//		}
		
		sc.close();
	}
}
