package Generics;

import java.util.ArrayList;

class A<T>{
	int num;
}

class B<T> extends A{
	int num2;
}

class C<T> {
	int num3;
}

public class Main {
	
	public static void print(ArrayList<? extends A> list) {  //A랑 관련있는 자식것만 들어와라 
		System.out.println(list);
	}
	
	public static void print2(ArrayList<? super B> list2) {   // <? super 클래스명> b랑 관련있는 부모들만 들어와라
		System.out.println(list2);
	}

	public static void main(String[] args) {
	
		
		
		
		/* 와일드카드
		 * ?
		 * 메서드를 이용해서 제네릭 타입들을 넘기는 경우! 
		 * 제네릭 타입들의 <>타입이 맞지 않으면 실행x  
		 * 제한 걸 때 & 클래스와 인터페이스 자체를 같이 제한을 걸었는데 와일드카드에서는 &연산을 쓸 수가 없다.  
		 */
	
		// ? 모든 타입을 받을 수 있다. 
	
		// 제한걸기: <? extends 클래스명> (클래스명과 관련 있는 하위 클래스들을 받을 수 있다.)
		//위에 부모들은 들어올 수 없다. 
		
		int[] arr = new int[10];
		Integer arr2 = new Integer[10];
		
		
		
		
		ArrayList<A> list1 = new ArrayList<>();
		ArrayList<B> list2 = new ArrayList<>();
		ArrayList<C> list3 = new ArrayList<>();
		ArrayList<Object> list4 = new ArrayList<>();
		
		
		//제네릭으로 타입을 고정하면 아무리 상속 구조라고 해도 
		// 선언한 타입으로만 참조 가능하다. 
		
		list1 = list2;
	
		print(list1);
		print(list2);
	//	print(list4); // A랑 관련이 없다. 
	//	print(list3); // A랑 관련이 없다. 
		
		// <? super 클래스명>
		
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		
		print(list);
		
		

	}

}
