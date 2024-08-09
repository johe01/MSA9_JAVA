package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {

	public static void main(String[] args) {
		// 성적을 입력받아서, 성적에 따른 학점 A~F를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 : ");
		int score = sc.nextInt();		
		
		// 90 점 이상, A
		if ((score >= 90) && (score <= 100))
			System.out.println("A");
		// 80 점 이상, B
		else if (score >= 80)
			System.out.println("B");
		// 70 점 이상, C
		else if (score >= 70)
			System.out.println("C");
		// 60 점 이상, D
		else if (score >= 60)
			System.out.println("D");
		// 60 점 미만, F
		else if ((score < 60)&&(score>=0))
			System.out.println("F");
		else
			System.out.println("유요한 점수가 아님.");
		
		char grade = 'F';
		
		if ((score >= 90) && (score <= 100)) grade = 'A';
		if ((score >= 80) && (score < 90)) grade = 'B';
		if ((score >= 70) && (score < 80)) grade = 'C';
		if ((score >= 60) && (score < 70)) grade = 'D';
		if ((score < 60) && (score >= 0)) grade = 'F';
		System.out.println(grade);
		
		// if ~ else if~else
		if ((score >= 90) && (score <= 100)) 
			grade = 'A';
		
		else if (score >= 80)
			grade = 'B';
		// 70 점 이상, C
		else if (score >= 70)
			grade = 'C';
		// 60 점 이상, D
		else if (score >= 60)
			grade = 'D';
		// 60 점 미만, F
		else
			grade = 'F';
		System.out.println(grade);
		
		sc.close();
	}
}
