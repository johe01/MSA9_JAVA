package _1000;

import java.util.Scanner;

public class _1205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		sc.close();
		double res[]=new double [8];
		res[0]=a+b;
		res[1]=a-b;
		res[2]=b-a;
		res[3]=a*b;
		res[4]=a/b;
		res[5]=b/a;
		res[6]=Math.pow(a, b);
		res[7]=Math.pow(b, a);
		double max=res[0];
		for (int i = 1; i < res.length; i++) {
			if(max<res[i])
				max=res[i];
		}
		System.out.printf("%.6f",max);
	}
}
