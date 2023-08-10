package Polymorphism;



public class PolymorphismEx {

	public static void main(String[] args) {
		
		Car c1 = new Car(); //레퍼런스 변수
		FireEngine f1 = new FireEngine(); //레퍼런스변수
		Ambulance a1 = new Ambulance(); //레퍼런스 변수 
		
		// 부모클래스인 Car 만들어진 소방차
		// 참조: 주소값 가리킨다.
		// 부모클래스가 참조를 하고 있으면 부모가 물려준 변수,메서드만 접근이 가능하다.
		// 자식클래스에 있는 내용을 접근하고 싶을 경우에는 오버라이딩 사용 
		Car c2 = f1;
		c2.drive();
		
		Car c3 = a1; 
		c3.stop();
		
		//Object 클래스
		//모든 클래스에 최고 부모! 자동상속이 이루어진다.
		
	    Object o1 = new Car();
	    Object o2 = new FireEngine();
	    Object o3 = new Ambulance();
	    
	    boolean res = o1 instanceof Car;
	    System.out.println(res);
	    
	    res = c3 instanceof Ambulance; 
	    System.out.println(res);
	    
	    String str = "이서희";
	    res = str instanceof String;
	    System.out.println(res);
	    
	    res = str instanceof Object;
	    System.out.println(res);

	}

}

//참조 변수의 개수? 
//Ambulance 자기 자신의 주소값 저장
//          car, object,자기자신 : 3개 

//instance of 연산자 
//참조변수가 참조하는 인스턴스의 실제 타입을 체크 
//참조할수 있으면 true, 참조 못하면 false 
// 객체변수 instance of 클래스명 


/*
 * 다형성
 * -업캐스팅과 똑같은 내용
 * -하나의 참조변수로 여러 타입의 객체를 참조할 수 있는 것 
 * -서로 상속관계가 있어야 가능
 * -형변환이 가능해야함 
 * -부모는 자식을 참조가능하다.
 * -자식은 부모 참조 안된다. 가능하게-> 인터페이스 
 */