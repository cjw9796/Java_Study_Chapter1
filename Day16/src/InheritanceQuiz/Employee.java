package InheritanceQuiz;

public class Employee extends Person{
	int salary;  //급여
	String dept; //부서
	

	Employee ()	{} //기본생성자 


	
	//매개변수 생성자 
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super();
		this.salary = salary;
		this.dept = dept;
	}


	//getter setter 
	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	//tostring  각 필드 반환
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dept=" + dept + "]";
	};
	
	
	
	
	
	
	

}
