package Day13.Ex04_수강과정등록;

public class Person {
	
	// 생성자
	// getter, setter
	// toString
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}

class Student extends Person {

	public Student(String name) {
		super(name);
		
	}

	@Override
	public String toString() {
		return "Student ["+this.getName()+"]";
	}	
	
}

class Worker extends Person {

	public Worker(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Worker ["+this.getName()+"]";
	} 

}

class HighStudent extends Student {

	public HighStudent(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "HighStudent ["+this.getName()+"]";
	}
	
	
}

class MiddleStudent extends Student {

	public MiddleStudent(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "MiddleStudent ["+this.getName()+"]";
	}
	
}