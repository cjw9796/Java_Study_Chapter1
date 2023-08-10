
public class Casting {

	public static void main(String[] args) {
		// 형변환 
		// 명시적(강제적)형변환
		// - 프로그래머가 강제적으로 변환을 한다.
		System.out.println((double)1);
		System.out.println((float)1);
		System.out.println((int)1.254);
		
		// 묵시적(자동적)형변환 
		System.out.println(1+1.1);
		
		// 변수: 값 저장 
		
		int a = (int)1.1; //에러. 정수형
		double b = 1.1;
		
		// 정수 + 정수 = 정수
		// 실수 + 실수 = 실수
		// 정수 + 실수 = 실수
		
		// 소수점 자리 표현 
		// %f .6자리까지 표현 
		// %lf .15자리까지 표현 
		// printf("서식",값);
		System.out.printf("%f\n",1.123456);
		System.out.printf("%.5f\n", 1.123456);
		System.out.printf("%.4f\n", 1.123456);
		System.out.printf("%.3f\n", 1.123456);
		System.out.printf("%.2f\n", 1.123456);
		System.out.printf("%.1f\n", 1.123456);
		
		/*
		 * %d  정수표현
		 * %c  한문자
		 * %s  문자열 
		 * 
		 * 100초를 1분 40초로 출력
		 */
		
		System.out.println();
		
		
	}

}
