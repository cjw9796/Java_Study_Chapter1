package Class;

import java.util.ArrayList;
import java.util.Arrays;

//클래스의 첫글자는 대문자 
class Cat{
	
	// 필드(정보, 상태)영역
	String name; //이름
	String breeds; //품종
	double weight; //몸무게
	boolean res;
	
	// 메서드(동작, 기능) 영역
	void claw() {
		System.out.println("할퀴기");
	}
	void meow() {
		System.out.println("야옹!");
	}
	
	
}

// 학생
// 필드 이름, 학번 배열로 

class Stu{
	String name;
	int hakbun;
	int[] scores = new int[3];
	ArrayList<Integer> scores1 = new ArrayList<>(); 
	
	//학생의 기능(동작)영역
	void info() {
		System.out.println(name);
		System.out.println(hakbun);
		
		Arrays.toString(scores);
		
	}
	
}


public class ClassEx02 {

	public static void main(String[] args) {
		
		// 학생 객체 생성
		
		Stu Student1 = new Stu();
		Stu Student2 = new Stu();
		
		// 값 저장
		Student1.name = "이서희";
		Student1.scores1.add(10);
		Student2.scores1.add(25);
		
		
		
		
		// 출력 (이서희 학번:1001 점수들:[10,20,30]) 
//		System.out.println(Student1.name + " "
//		+"학번: " + Student1.hakbun + "점수들:" Arrays.toString(Student1.scores));
		System.out.println(Student1.scores1);
		System.out.println(Student2.scores1);
		System.out.println(Student1.name);
		
		//student1.info(); //서희 변수 안에 들어가서 함수 실행 
		
		
		// 프로젝트 폴더 안에 클래스명은 중복 될 수 없다.
		// 객체 생성
		// 객체는 자동으로 초기화 String = null, int = 0, double = 0.0 
		
	 Cat c = new Cat();
	 
	 //저장
	 c.name = "나비";
	 c.weight = 1.5;
	 c.breeds = "먼치킨";
	 
 
	 
	 System.out.println(c.name);
	 System.out.println(c.weight);
	 System.out.println(c.res);
     
	
	
	
	
	
	}

}
