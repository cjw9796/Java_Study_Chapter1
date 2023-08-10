package Loop;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		/*
		 * # 반복문 for
		 * 1. 반복문의 조건 3가지
		 * 1) 초기식
		 * 2) 조건식
		 * 3) 증감식
		 * 2. for문의 구조
		 * for(초기식;조건식;증감식){
		 * 		조건식이 참일 동안 실행할 문장;
		 * }
		 * 3. for문의 실행순서
		 * 초기식 → 조건식 → 실행문 → 증감식 → 조건식 → 실행문 → 증감식 ...
		 */
		
		
		// 1부터 10까지 반복해 3미만 7이상 출력 
		/*
		for(int i = 1; i<=10; i++) {
			if (i<3 && i>=7) {
				
			}System.out.println(i);
		}
			*/	
		
		// 1부터 100까지 반복 홀수와 짝수의 합을 각각 출력 
		/*
		int x = 0;
		for(int i=1; i<= 100; i++) {
			if(i%2==1) {
				x+=i;
			}
		}
		System.out.println(x);
		
		int y = 0;
		for(int i=1; i<= 100; i++) {
			if(i%2==0) {
				y+=i;
			}
		}
		System.out.println(y);
		*/
		/*
		int jjak = 0; // 짝수합
		int hol = 0; // 홀수합 
		
		for(int i =0; i<5; i++) {
			if(i%2 == 0) {
				//짝수
				jjak += i;
				}
			hol += i;
			}
		*/
		
		
		
		// 1. 5회 반복을 하면서 정수를 입력 받는다.
		// 2. 입력받은 정수를 전부 합을 출력한다.
		// 3. 만약에 입력받은 합이 100 이상이면 반복이 5회가 아닐지라도 즉시 종료 
		/*
		Scanner sc = new Scanner(System.in);
		
		int sum1 = 0;
		int total = 0; //누적합
		
		int i=0;
		for(i=0; i<5; i++) {
			System.out.println("정수입력:");
			int num = sc.nextInt();
			
			total += num;
			
			if(total >= 100) {
				break;
			}
			System.out.println(total);
		}
		
		*/
		
		// if문 먼저 , switch문 바꾼 작성
		//월 입력 받는다.
		// 3~5월 까지는 봄 
		// 6월~8월 까지는 여름 
		// 9~11월 까지는 가을 
		// 12월 ~ 2월 까지는 겨울 
		// 무한적으로 입력을 받다가 99 숫자를 입력하면 프로그램 종료 
		// 단 1~12 외에 숫자를 입력하면 "월을 잘못 입력했습니다."
		
		/* 
		 
		//if문 작성(내풀이)
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력해 주세요:");
	    int month = sc.nextInt();
		
	    if((month == 3) || (month == 4) || (month == 5)) {
	    	System.out.println("봄입니다.");
	    }
	    else if((month == 6) || (month ==7) || (month == 8)) {
	    	System.out.println("여름입니다.");
	    }
	    else if((month == 9) || (month ==10) || (month == 11)) {
	    	System.out.println("가을입니다.");
	    }
	    else if((month == 12) || (month ==1) || (month == 2)) {
	    	System.out.println("겨울입니다.");
	    }
	    else if((month == 99)) {
	    	 sc.close();
	    }
	    else {
	    	System.out.println("월을 잘못 입력했습니다.");
	    }
		*/
		
		
		
	    //switch문 바꾼 작성(내풀이)
		/*
		Scanner sc2 = new Scanner(System.in);
		System.out.println("월을 입력해 주세요:");
	    int month2 = sc2.nextInt();
	    switch(month2) {
	    case 3 : case 4 : case 5:
	    	System.out.println("봄입니다."); break;
	    case 6 : case 7 : case 8: 
	    	System.out.println("여름입니다."); break;
	    case  9: case 10 : case 11:
	    	System.out.println("가을입니다."); break;
	    case 12 : case 1 : case 2:
	    	System.out.println("겨울입니다."); break;
	    case 99:
	    	sc2.close();
	    default :
            System.out.println("월을 잘못 입력했습니다."); break;
	    	
		}
		
	    */
	    
	    
		
		
		
	} //end
}


