package Generics;

	//인터페이스 추상메서드들의 제네릭 타입을 지정 
	//인터페이스 객체 생성 x 
	//1회용 익명클래스(내부클래스중에)
	
	interface ISample<T>{
		public void addElement(T t, int index);
		public T getElement(int index);
	}


class Sample<T> implements ISample<T>{

	@Override
	public void addElement(T t, int index) {
		array[index] = t;
		
	}

	@Override
	public T getElement(int index) {
		return array[index];
	}
	
	
	
//	public void addElement(T t, int index) {
//		array
//	}
//	
//	public T getElement(int index) {
		return array[index];
		//return으로 Main이든 내가 호출한 메서드든 
		//그걸 콘솔에 보여주려면 무조건 println()
		//저장만 하겠다. 변수에 저장! 객체주소 -> 참조변수 
//	}
	
	
	
	
}


//제네릭 많이 사용되는 람다 표현식의 함수형 인터페이스
//두 매개변수를 받아서 더하는 인터페이스 
interface IAdd<T>{
	public T add(T x, T y);
}


public class Main {

	public static void main(String[] args) {
		
		//제네릭을 통해 람다 함수의 타입을 결정 
		//매개변수 x와 y 그리고 반환형 타입이 int형으로 설정된다. 
		//일반변수를 객체화 시켜주는 래퍼클래스! 
		//자동으로 포장한다. 
		
		IAdd<Integer> o = (x,y) -> x+y; 
		
		int result = o.add(10, 20);
		//결과값 콘솔에 보여줘라 
		System.out.println();
		
		
		
		
//		//객체 생성
//		Sample<String> sa = new Sample<>();
//		
//		sa.addElement("This is string", 5);
//		System.out.println(sa.getElement(5));
		
	}
}


/*
class Sample<T>{
	
	void method() {
		//T t = new T(); //이런식으로 작성
		//new 연산자 뒤에 제네릭 타입 , 파라미터가 올 수 없다. 
	}
	//static 멤버는 클래스가 동일하게 공유하는 변수로서 제네릭 객체가 생성되기 전에 이미 자료 타입이 정해져 있어야 된다. 
	
	public static T addAge(int n) {
		
	}
	
}



public class Main {

	public static void main(String[] args) {
		
		//제네릭으로 배열을 선언 
		//기본적으로 제네릭 클래스 자체를 배열로 만들 수 없다. 
		
		
		// Sample<Integer>[] arr1 = new Sample<>[10]; x 
		
		//제네릭 배열을 선언하고 저장하고 싶다. 
		Sample<Integer>[] list = new Sample[10];  //정수만 저장해!
		
		list[0] = new Sample<Integer>();
		list[1] = new Sample<>();
		
		//제네릭은 타입을 지정! 
		// list[2] = new Sample<String>(); // String 타입이 들어오면 에러 (기존에 정수로 설정해서) 
		
		
		
		

	}

}

*/