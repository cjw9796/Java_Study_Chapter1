package Final;


class Company{

	
	static final String name;
	
	//static은 프로그램 시작전에 이미 메모리에 생성이 되기때문에 상수final이라고 해도 값을 초기화하지 못한다. 
//	Company(String com){
//		this.name = com;
//	}
	
	//String name = "kh회사";
	
	final void print() {
		System.out.println(name);
	}
	void setInfo(final int temp) {
		
		//temp = 10; //매개변수의 값은 변경x 
	} 
}

class Company_sbs extends Company{
	
	//상속은 가능하지만 오버라이딩 x 
}

// class Company_sbs extends Company{} //클래스에 final을 붙이게 되면 상속 불가능 

public class Main {

	public static void main(String[] args) {
		Company_sbs cs = new Company_sbs();
		cs.print();
		
		//final 객체
		final Company c = new Company();
		//c= new Company();  객체를 한번 생성했다면 재생성 불가능 
		// 객체 안에 있는 변수는 값을 변경 가능하다. 
		
		//c.name = "m회사"; static final을 썻을 경우에는 값을 변경 못함 

	}

}

//class Person{
//	final int hp = 100;
//	final int age = 0;
//
//}
//
//class Tank{
//	final int hp = 100;
//	
//	Tank(int hp){// 생성자
//		//this.hp = hp;
//	}
//
//	@Override
//	public String toString() {
//		return "탱크" + this.hp;
//	}
//	
//}
//		final int num = 10;
//		
//		Tank a = new Tank(10);
//		System.out.println(a);

/*
 *  상수(final)
 *  -변수처럼 값을 저장하지만 한번 값을 저장하면 변경 할 수 없다.
 *  -변수 생성과 동시에 초기화까지 진행되야 된다.
 *  - 상속을 했을 때 오버라이딩을 불가능하게 한다.
 *  -- final class 로 설정하면 클래스 상속이 불가능하다.
 *  
 *  클래스 안에 final 상수값을 줄 때
 *  객체를 생성할 때 마다 특정한 값으로 초기화 
 *  생성자 
 */
