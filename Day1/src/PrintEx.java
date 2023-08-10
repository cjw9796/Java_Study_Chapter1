
public class PrintEx {

	public static void main(String[] args) {
		// 계산 (산술연산자)
		// syso + ctrl + space 
		System.out.println(1+1);
		System.out.println(2-2);
		System.out.println(10*10);
		System.out.println(10 / 5); //몫
		System.out.println(10 % 2); //나머지 
		System.out.println(); //줄바꿈 

		System.out.println("프로그램 끝!");
		
		System.out.println("2*2-4 결과:" + (2*2-4));
		
		// 문제1) 월급이 150만원 연봉을 출력?
		System.out.println("연봉은" + (150*12) + "만원 입니다.");
		// 실수값 -> 정수값 출력
		System.out.println();
		// 출력할 때 소수점 2자리까지 표현 1500000.00
		System.out.println();
		// 문제2) 연봉을 출력하는데 세금 10%제외하고 연봉을 다시 출력? 
		System.out.println("세금10%를 제외한 연봉은" + (150*12 - 150*12/10) + "입니다.");
		
		// 문제3) 시험점수가 30,50,40점 평균을 구해서 출력하기 
		System.out.println("시험점수의 평균은" + ((30*40*50)/3)+ "입니다.");
		
		// 문제4) 100초를 1분 40초로 출력
		System.out.println();
		
	    // 문제5) println()
	    //          Hello World!
	    System.out.println("Hello World!");
	    
	    // 문제6) 1+2 결과를 출력
	    System.out.println(1+2);
	    
	    // 문제7) 3-2 결과를 출력
	    System.out.println(3-2);
	    
	    // 문제8) 7 3 * / (몫) (나머지값) 결과 출력 
	    System.out.println("몫:" + 7/3);
	    System.out.println("나머지" + 7%3);
	    
	    
	    
	} 

}
