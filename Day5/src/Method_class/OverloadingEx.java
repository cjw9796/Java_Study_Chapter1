package Method_class;

//계산기

class Calc{
	
	// 더하는 기능
	//void 
	
	
	
}

public class OverloadingEx {
	
	public static void add(int a, int b) {
		System.out.println("정수 합:"+ (a+b));
	}

	public static void add(double a, double b) {
		System.out.println("실수 합:"+ (a+b));
		
	}
	
	public static void add(int a, double b) {
		System.out.println("정수와 실수 합:"+ (a+b));
		
	}
	
	public static void main(String[] args) {
		
		
		add(1,1);
		add(1.1,2.2);
		add(1,2.5);
		
		
		// 똑같은 이름의 함수를 여러개 정의할 수 있다. 
		// 오버로딩(new 새로운 함수를 만든다)
		
		// 조건 
		// 함수명 똑같아야 된다.
		// 리턴값은 똑같을 필요없다.
		// 매개변수의 개수가 다르거나 매개변수 타입이 달라야된다. 
		
		
		
		
		
		

	}

}
