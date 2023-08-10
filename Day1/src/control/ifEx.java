package control;

import java.util.Scanner;

public class ifEx {

	public static void main(String[] args) {
		
		/*
		 * if(비교){
		 * 	참인경우 실행 
		 * 
		 * }else{
		 *  거짓인 경우 실행 
		 * }
		 * 
		 * if(비교){
		 * 	참인경우 실행 
		 * }else if{
		 *  참인 경우 실행 
		 * }else{
		 * 	위에 어떤 내용도 해당되지 않으면 실행!
		 * }
		 * 
		 // 문제) 시험점수3개를 입력받고 학점출력 
		// 조건 1) 3과목의 평균을 가지고 점수를 매긴다.
		// 조건 2) 3과목의 평균이 100~90 ==> A
		// 조건 3) 3과목의 평균이 89~80 ==> B
		// 조건 4) 3과목의 평균이 79~70 ==> C
		// 조건 5) 69이하                      ==> 재시험 
		// 추가조건) 각점수대별로 끝자리가 7점 이상은 + 가붙는다. 
		// 예) 98 ==> A+
		// 예) 89 ==> B+
		// 예) 79 ==> C+
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		
		/*int scoreAVG(95);
		
		if int scoreAVG (90 <= and >=100)
		System.out.println(A);
		else if scoreAVG (scoreAVG 80 >= and <80);
		System.out.println(B);
		else if scoreAVG (70 >= and <= 79 );
		System.out.println(C);
		else scoreAVG(<= 60);
		System.out.println(재시험);
		*/
		
		
		/*int a =95;
		int b =85;
		int c =75;
		int i = a+b+c/3;
		
		if  (i >= 90 && i <=100) {
		System.out.println("A");}
		
		else if(i >=80 && i <=89){
		System.out.println("B");}
		else if (i >=70 && i<=79) {
		System.out.println("C");}
		else (i <= 69){ 
		System.out.println("재시험");}
		*/
		
		
		//문제풀이
		// 문제) 시험점수3개를 입력받고 학점출력 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 시험점수를 입력하세요");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int avg = (num1+num2+num3) / 3;
		
		String res = ""; //결과를 저장하는 변수 
		if(avg >= 90 && avg <= 100) {
			res = "A";
		}else if (avg >= 80 && avg <= 89) {
			res = "B";
		}else if (avg >= 70 && avg <= 79) {
			res = "C";
		}else {
			res = "재시험";
		}
		System.out.println(res);
		System.out.println("평균:" + avg);
		
		//숫자의 자리수를 구한다. 
		//327
		//System.out.println(327 / 100); //100의 자리 구하기
		//System.out.println((327 % 100) / 10); // 10의 자리 구하기 
		
	    // 1의 자리가 저장 
		int s = avg % 10;
		
		if(s >= 7 && avg >= 70) {
			res = res + "+";
		}
	
		
		System.out.println(res);
	    
		
		//문자 + 문자 = 연결
		
		
				// 조건 1) 3과목의 평균을 가지고 점수를 매긴다.
				// 조건 2) 3과목의 평균이 100~90 ==> A
				// 조건 3) 3과목의 평균이 89~80 ==> B
				// 조건 4) 3과목의 평균이 79~70 ==> C
				// 조건 5) 69이하                      ==> 재시험 
				// 추가조건) 각점수대별로 끝자리가 7점 이상은 + 가붙는다. 
				// 예) 98 ==> A+
				// 예) 89 ==> B+
				// 예) 79 ==> C+
		
		
	}

}
