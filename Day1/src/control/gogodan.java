package control;

import java.util.Scanner;

public class gogodan {

	public static void main(String[] args) {
		
		/*
		 *#1. 나이를 Scanner 입력 받아서 나이가 20세 미만 "소아청소년" 20세 이상 "성인"
		 * 
		 * 나이를 입력 받고 20세 미만 " 할인율 10% 입니다"출력 30세 미만 " 할인율 20% 입니다" 30세 이상 " 할인율 5% 입니다"
		 * 
		 *#2. 놀이기구 이용제한 
		 * 1. 키를 입력받는다. 
		 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
		 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다. 
		 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다. 예) 부모님과 함께
		 * 오셨나요?(yes:1, no:0) 1번누르면 "부모님과 동반 탑승가능" 2번 " 탑승불가"
		 * 
		 * 
		 *#3. 구구단 게임[1단계] 
		 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
		 * 2. 입력받은 숫자를 토대로 구구단 문제를
		 *    출력한다. 
		 *    예) 3 x 7 = ? 3. 문제에 해당하는 정답을 입력받는다. 
		 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
		 * 
		 */

		//1번 코드 (완성)
		/*Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
	     int age = sc.nextInt();
		if (age < 20){
			System.out.println("소아청소년");
		}
		
		if (age >= 20){
			System.out.println("성인");
		}
		
		if (age < 20) {
			System.out.println(" 할인율 10% 입니다");
		}
		else if (age < 30) {
			System.out.println(" 할인율 20% 입니다");
		}
		else {
			System.out.println(" 할인율 5% 입니다");
		}
		*/
		
		/*
		 * #2. 놀이기구 이용제한 
		 
		 * 1. 키를 입력받는다. 
		 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
		 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다. 
		 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다. 예) 부모님과 함께
		 * 오셨나요?(yes:1, no:0) 1번누르면 "부모님과 동반 탑승가능" 2번 " 탑승불가"*/
				 
		//2번 코드 (미완성)
		/*Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		int tall = sc.nextInt();
		
		if (tall >= 120) {
			System.out.println("놀이기구를 이용할 수 있다.");
		}
		else if (tall <= 120) {
			System.out.println("놀이기구를 이용할 수 없다. ");
		   System.out.println("부모님과 함께 오셨나요?" +"yes:1, no:0");{
			int parent = sc.nextInt();
			if(1==1) {
				System.out.println("부모님과 동반 탑승 가능");
			}
			else if(1!=0) {
				System.out.println("탑승불가");
			}
		}
		*/
		
		/*#5. 
		 * 국어 수학 영어 3개를 받아서 평균 
		 *
		 * 평균이 90점 이상인 경우 
		 * 		국어 수학 영어 모두  90점 이상 "최우수상"
		 *      그중 하나라도 90점 미만이면 "우수상"
		 *      
		 * 평균이 80점이상 89점 이하 경우
		 * 		국어 수학 영어 3개 중에 하나라도 90점 이상 "장려상"
		 * 		(삭제)국어 수학 영어 3개 모두! 90점 미만 "입상"
		 * 
		 * 평균 80미만 "안녕
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("세 과목 점수를 입력하세요");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();

		int avg = ((score1 + score2 + score3) /3);
		System.out.println(avg);
		
		if (avg >=90) {
			if(score)
			System.out.println("최우수상");
		}
		
		
	}

	
}
