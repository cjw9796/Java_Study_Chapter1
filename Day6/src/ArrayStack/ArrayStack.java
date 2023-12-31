package ArrayStack;

import java.util.Stack;

class A {
	// 컴파일 시에 자동으로 작성, 기본생성자는 생략이 가능하다.
}

public class ArrayStack {

	int top; // 마지막 데이터가 어디인지 알려주는 방번호(인덱스)
	int size; // 스택 배열의 크기
	int[] stack;

	ArrayStack() {
	} // 기본생성자

	public ArrayStack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}

	// 추가
	void push(int item) {
		stack[++top] = item;
		System.out.println(stack[top] + "push");
		
	}

	// 삭제
	void pop() {
		System.out.println(stack[top] + "pop");
		int pop = stack[top];
		stack[top--] = 0;

	}

	// 조회
	void peek() {
		System.out.println(stack[top] + "peek!");
	}

	public static void main(String[] args) {

		//stack util 이용 
		Stack<Integer> stack1 = new Stack<>();
		
		//추가 
		stack1.push(10);
		
		//삭제
		stack1.pop();
		stack1.remove(0);
		//조회
		stack1.peek();
		
		
		
		//스택 객체 생성 
		ArrayStack stack = new ArrayStack(7);
		
		//함수실행 
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.peek();
		
		//remove() 값 삭제 , pop() 인덱스 삭제
		//remove() 삭제한 값을 확인시키지 않고 그냥 삭제
		//pop() 삭제한 값을 프로그래머한테 보여준다. 
		stack.pop(); //30
		stack.pop(); //20
		stack.pop(); //10
		
		stack.peek();
	
		
		/*
		 *자료구조란? 
		 *-데이터를 효율적으로 다룰 수 있게 도와주는 데이터 보관 방법
		 *-효율적(검색, 삭제, 추가) 쉬워야된다
		 *
		 * 스택(Stack)
		 * -컴퓨터에서 아주 많이 사용되는 자료구조 
		 * -LIFO(가장 최근에 들어온 데이터가 가장 먼저 나간다.(후입선출))
		 * 
		 * 
		 */
		

	}

}
