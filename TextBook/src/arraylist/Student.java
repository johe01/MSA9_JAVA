package arraylist;

import java.util.ArrayList;

public class Student {

	// 멤버 변수
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	// 생성자
	public Student(int studentID, String studnetName) {
		this.studentID = studentID;
		this.studentName = studnetName;
		subjectList = new ArrayList<Subject>();
	}
	
	// 메소드
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 "+ studentName + "의 "+s.getName()+" 과목의 성적은 "
					+ s.getScorePoint()+"점 입니다.");
		}
		System.out.println("학생 "+studentName+"의 총점은 "+total+"점 입니다.");
	}

}
