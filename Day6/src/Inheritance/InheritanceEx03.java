package Inheritance;

class A{
	int num; 
	
	//생성자 부모클래스에 변수에 초기화! 
	//A(){System.out.println("A");}
	A(int num){
		this.num = num;
		System.out.println("A클래스");
	}
}
//부모클래스에서 생성자가 생기면
//부모의 변수를 초기화해서 자식클래스에 줘야된다.

class B extends A{
	B(int num){
		super(num);
		//this.num = num;
		
		System.out.println("B클래스");
	}
}

class person{
	String name;
	int age;
	
	person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
}


class Teacher extends person{

	Teacher(String name, int age) {
		super(name, age);
		
	}
	void lecture() {
		System.out.println("강의한다.");
	}
	
}

class student extends person{

	student(String name, int age) {
		super(name, age);
	}
	void study() {
		System.out.println("공부한다.");
	}
	
}

// super(): 부모클래스의 생성자를 호출한다. 무조건 생성자 함수가 시작하자마자 바로 첫번째 줄에 선언되야한다.
// 자바의 상속: 다중상속x -> 인터페이스 

public class InheritanceEx03 {

	public static void main(String[] args) {
		// 상속 받은 자식클래스 객체를 생성 
		B b1 = new B(10);
		//상속받은 부모클래스의 객체 먼저 생성 이후에 자식클래스 생성됨

		
		System.out.println(b1.num);
		
		
		
		
	}

}
