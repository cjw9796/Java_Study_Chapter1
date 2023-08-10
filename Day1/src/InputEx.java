import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		
		int num = 10;
		Scanner sc = new Scanner(System.in);
		
		//문제1) 정수 2개를 입력받아서 합 출력 
		
		//문제2) 성적을 입력받아 60이상 100점 이하 true,false 
		
		// 비교연산자
		// >= < 대소비교 
		// == 같니? 
		// != 다르니? 
		
		// 논리연산자 
		// and(&&) 비교 연산자 두개 이상 모두 참인 경우 ex) 영화티켓 
		// or(||) 비교연산자 두개 이상 중 하나만 참  ex) 할인카드 
		
		// 증감연산자 
		// - 무조건 1밖에 증가하거나 감소한다.
		// ++, -- 
		// ++변수명 -> 먼저 증가하고 그 다음에 실행 
		// 변수명++ -> 실행을 먼저하고 그 다음에 증가 
		
		int num1 = 10;
		int num2 = (num1--)+2;
		int num3 = 20;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3--);
		System.out.println(num3);
		
		int num4 = ++num3 - num1;
		int num5 = (num4--) * 10;
		
		//복합연산자
		// += , -=, *=, /=
        // A += B  -> A = A + B
		
		
		// 조건연산자 (삼항연산자)
		// 비교문 ? 참인경우 : 거짓인경우 ; 
		
		//String res =(10 == 10) ? "True":"False";
			//boolean res =(10 == 10) ? true:false;
		
	}

}
