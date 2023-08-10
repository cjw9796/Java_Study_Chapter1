package Sort;

public class RecursionMain {

	public static void Function(int num) throws StackOverflowError {
		System.out.println("반갑습니다.");

		if (num == 0) {
			return;
		}

		Function(num - 1);
	}

	// 1부터 5까지 합을 구하는 재귀함수를 작성
	public static int Function2(int num) {

		if (num == 1) { // 함수가 끝나면 마지막 1도 더해야된다. 따라서 리턴값 1 줌
			return 1;
		}
		return num + Function2(num - 1);
	}

	public static void main(String[] args) {
		/*
		 * 재귀함수 -자기 자신을 다시 호출하여 문제를 해결해 가는 함수
		 * 
		 * StackOverflowError 스택이 넘칠 수 있다.
		 * 
		 * 끝나는 조건을 잘 줘야된다.
		 * 
		 */
		try {
			Function(5);
			int res = Function2(5);
			System.out.println(res);
			
			//1+N 까지의 합을 구하기! 
			//피보나치수열 구하기 
			
		} catch (StackOverflowError e) {
			System.out.println("재귀함수 예외발생 조건 작성하기");
		}

	}

}
