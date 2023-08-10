package InheritanceQuiz;

import java.util.Scanner;

public class PersonMenu {
	
	public static Scanner sc = new Scanner(System.in);
	
	// public static PersonController pc = new PersonController(sc);
	
	
	//메인 메뉴를 출력하는 메소드 
	public void mainMenu(){
		int sel = sc.nextInt();
		switch(sel) {
		case 1:
			studentMenu();
			break;
		case 2:
			employeeMenu();
			break;
		default : 
			System.out.println("종료합니다.");
			
		}
		
		System.out.println("1. 학생메뉴");
		System.out.println("2. 사원메뉴");
		System.out.println("9. 끝내기");
		
	}
	
	
	
	//학생 메뉴 출력하는 메소드
	public void studentMenu() {
		int sel = sc.nextInt();
		switch(sel) {
		case 1:
			insertStudent();
			break;
		case 2:
			printStudent();
			break;
		default : 
			System.out.println("메인으로 돌아갑니다.");
			
		}
		System.out.println("1. 학생추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
		
	}
	
	//사원 메뉴를 출력하는 메소드
	public void employeeMenu() {
		int sel = sc.nextInt();
		switch(sel) {
		case 1:
			insertEmployee();
			break;
		case 2:
			printEmployee();
			break;
		default : 
			System.out.println("메인으로 돌아갑니다.");
			
		}
		System.out.println("1. 사원추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		
	}
	
	//사용자에게 객체 배열에 저장할 학생 데이터를 받는 메소드 
	public void insertStudent() {
		System.out.println("학생 이름:");
		String name = sc.nextLine();
		System.out.println("학생 나이:");
		int age = sc.nextInt();
		System.out.println("학생 키:");
		double height = sc.nextDouble();
		System.out.println("학생 몸무게:");
		double weight = sc.nextDouble();
		System.out.println("학생 학년:");
		int grade = sc.nextInt();
		System.out.println("학생 전공:");
		String major = sc.nextLine();
		
		//student 정보를 입력받아서 student 클래스로 넘겨준다.? 
		Student stutemp = new Student(name, age, height, weight, grade, major);
		
	}
	
	//객체 배열에 저장된 학생 데이터를 출력하는 메소드 
	public void printStudent() {
		
	}
	
	//사용자에게 객체 배열에 저장할 사원 데이터를 받는 메소드
	public void insertEmployee() {
		System.out.println("사원 이름:");
		String name = sc.nextLine();
		System.out.println("사원 나이: ");
		int age = sc.nextInt();
		System.out.println("사원 키: ");
		double height = sc.nextDouble();
		System.out.println("사원 몸무게: ");
		double weight = sc.nextDouble();
		System.out.println("사원 급여: ");
		int salary = sc.nextInt();
		System.out.println("사원 부서: ");
		String dept = sc.nextLine();
		
		//Employee 정보를 입력받아서 Employee 클래스로 넘겨준다. 
		Employee emptemp = new Employee(name,age,height,weight,salary,dept);

	}
	
	//객체 배열에 저장된 사원 데이터를 출력하는 메소드
	public void printEmployee() {
		
	}

}
