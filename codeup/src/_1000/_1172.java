package _1000;

import java.util.Scanner;

public class _1172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[]=new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
}
