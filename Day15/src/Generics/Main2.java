package Generics;

public class FruitBox<T,U>{
	//독립적으로 운영되는 제네릭 메서드
	public <T,U> void printBox(T x, U y) {
		System.out.println(x.getClass());
		System.out.println(x.getClass());
	}
}

public class Main2 { //FruitBox<T> Main 

	public static void main(String[] args) {
		//public static 객체 생성 클래스명으로 접근 
		//FruitBox.addBoxStatic(1, 2); 
		
		//매개변수의 데이터형을 보고 타입을 추론 
		
		FruitBox<Integer, Long> box1 = new FruitBox<>();
		
		//인스턴스화에 지정된 타입 파라미터
		box1.printBox(1, 1);
		
		//제네릭 메서드에서 다른 타입으로 정의 
		box1.<String,Double>printBox("hello", 5.55);
		box1.printBox("hello", 5.55); //생략이 가능하다. 
		
		
		
		
		
		

	}

}
