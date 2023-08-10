package InheritanceQuiz;

public class Person {
	
	String name; //이름
	int age; //나이 
	double height;  //키
	double weight;  //몸무게 
	
	Person(){}//기본 생성자

	
	//매개변수 생성자
	public Person(String name, int age, double height, double weight, int grade, String major, int salary, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	//getter setter 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}

	//tostring  각 필드 반환 
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}; 
	
	
	

	
	
	
	

}
