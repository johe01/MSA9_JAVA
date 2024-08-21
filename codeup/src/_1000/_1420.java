package _1000;

import java.util.Scanner;

class Student {
	String name;
	int score;
}

public class _1420 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] arr=new String[n];
		Student[] st=new Student[n];
		
		
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextLine();
			String[] sp=arr[i].split(" ");

			st[i] = new Student();
			st[i].name=sp[0];
			st[i].score=Integer.parseInt(sp[1]);
		}
		
		sc.close();
		
		for (int i = 0; i < 3; i++) {
			int maxIdx = i;
			for (int j = i+1; j < n; j++) {
				if(st[j].score> st[maxIdx].score) {
					maxIdx=j;
				}
			}
			Student temp=st[i];
			st[i]=st[maxIdx];
			st[maxIdx]=temp;
		}
		System.out.println(st[2].name);
	}
}
