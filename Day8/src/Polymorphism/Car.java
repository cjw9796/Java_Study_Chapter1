package Polymorphism;

//상속은 물려만 준다.(강제성이 없음)

public abstract class Car {

	String color;
	int door;

	abstract void drive() { //강제성 
		System.out.println("운전하는 기능");
	}

	abstract void stop() {
		System.out.println("멈추는 기능");
	}
	abstract void 와이퍼() {} //꼭 필요함 
	
	void 썬루프() {} //비강제성 , 오버라이딩을 해도그만 안해도그만
	void 블루투스() {}
	void 엉따() {}
	void 

}


class FireEngine extends Car {
	//default 제어자 : 생략가능, 범위: 같은 패키지에서만 접근 가능 (값 변경, 객체 생성, 메서드 호출)
	
	
	int a; 
	
	@Override
	void drive() {
		a = 1000;
		System.out.println("a");
		water();
	}

	void water() {
		System.out.println("물 뿌리는 기능");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void 와이퍼() {
		// TODO Auto-generated method stub
		
	}
}



class Ambulance extends Car {
	void siren() {
		System.out.println("환자 이송기능");
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("부모접근가능");
	}
	@Override
	void drive() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void 와이퍼() {
		// TODO Auto-generated method stub
		
	}
	
}