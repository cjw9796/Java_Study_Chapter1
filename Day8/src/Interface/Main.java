package Interface;

/*
 * interface 인터페이스명 
 * 인터페이스의 멤버
 * -상수(final)
 * -추상메서드만 가능
 * -객체 생성x
 * -하나 인터페이스를 가지고 여러개 객체에 구현할 수 있다. (다형성)
 */

interface Phone{
	void call();
	void ring();
}

interface Messenger{
	void sendMsg();
	void receiveMsg();
}

interface Alarm{
	//인터페이스 비프음,음악재생
	
	//public static final 생략가능 
	int num = 0;
	
	void beep();
	void playmusic();
}

class Smartphone implements Alarm,Phone,Messenger{
//메서드 오버라이딩(재정의)
	@Override
	public void beep() {
		System.out.println("삐삐삐");
		
	}

	@Override
	public void playmusic() {
		System.out.println("음악연주중~");
	
		
	}

	@Override
	public void sendMsg() {
		System.out.println("보내기");
		
	}

	@Override
	public void receiveMsg() {
		System.out.println("받기");
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ring() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Main {

	public static void main(String[] args) {
		
		//다형성
		Smartphone s1 = new Smartphone();
		
		//인터페이스
		//-자신이 멤버로 가지고 있는 메서드, 상수에만 접근할 수 있다. 
		//-오버라이딩 
		Alarm a1 = s1;
		Messenger m1 = s1;
		Phone p1 = s1;
		
		
	}
}

/*
1.인터페이스란
-인터페이스란, 역할을 부여하는 것이다.
-인터페이스는 추상 메소드로 구성된다.
-추상 메소드란, 중괄호 내부가 없는 껍데기 메소드이다.
2.인터페이스 정의 및 구현
-인터페이스 구현 시, implements 키워드를 사용한다.
-해당 인터페이스(역할)를 구현하는(부여받은) 클래스를 구현체 클래스라 한다.
-구현체 클래스는 모든 추상 메소드를 오버라이딩(재정의)해야 한다.
3.인터페이스의 장점
-프로그램 설계의 명확성
-서로 다른 객체에게 관계성 부여(업캐스팅 가능)
-한 객체를 다양한 인터페이스로 해석 가능(다형성)
 */
