package Method;

public class MethodEx02 {
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int mult(int a, int b) {
		return a*b;
	}
	
	public static double div(int a, int b) {
		return (double) a / b;
	}
	
	
	public static void main(String[] args) {
	//모든 결과값을 출력하는건 main //내가 만든 함수는 실제 시작을 main안에서 해야된다.
		
		int a = 10, b = 20;
	
		double res3 = div(a,b);
		System.out.println("나눈 결과:" + res3);
		

		int res2 = mult(a,b);
		System.out.println("곱한 결과:" + res2);
		
		
		int res = add(a,b);
		System.out.println("더한 결과:" + res);
		
		
		
		
		
		//함수명 loop
		//매개변수 10
		//기능 1부터 매개변수의 값까지 더한다음
		//결과를 return해서 출력하기 
		
		//함수명:maxnumber,minnumber
		//3개의 정수를 매개변수로 받아서
		//가장 큰 값과 가장 작은 값 main에서 return출력
		
		//문자열을 비교하는 함수 
		//함수명 equals
		//매개변수 str1, str2
		//return true, false 
		
		
		String str1 = "hello";
		String str2 = "world";
		
		
		
	}
	

}

/*
public static void show(int temp) {
	
	System.out.println(number);
}

public static  String input() {
	
	String name = "이서희";
	int number2 = 100;
	double number3 = 10.254;
	
	return name ; //main에게 데이터를 보낸다. 
	
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int number = 10;
	
	//{}기점으로 범위가 나눠진다. 따라서 데이터를 이동시킬 매개변수가 필요 
	show(number);
	
	//내가 만든 함수에서 main으로 데이터를 이동시킬 것!
	String name = input();  
	System.out.println(name); 
	
	//하나의 정수를 Scanner로 받아서 제곱하는 함수를 만드세요 
	// 입력(보내줘야하는정수)
	//함수명 sq 
	// return 
	
	
	
} // main end
*/