package InheritanceQuiz;

public class Student extends Person {
	
	int grade; //학년
	String major; //전공 

	Student(){} //기본 생성자 

	
	//매개변수 생성자
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super();
		this.grade = grade;
		this.major = major;
	}

	//getter setter 
	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}

	//tostring 각 필드 반환 
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", major=" + major + "]";
	}
	
	
	
	
	
	

}
