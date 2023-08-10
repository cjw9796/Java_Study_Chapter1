package Loop;

import java.util.Random;
import java.util.Scanner;

public class LoopEx01 {

	public static void main(String[] args) {
		/*
		 * 출력형식
		 * println() 줄바꿈 포함 o
		 * printf() 줄바꿈 포함 x
		 * print() 줄바꿈 포함 x
		 *  
		 * 반복문
		 * while(조건문){
		 *  //참인동안 반복하는 문장들
		 * }
		 * 
		 * 
		 * for 
		 * 
		 */

		
		// 문제1) 1~5까지 반복해 출력
		// 시작:1
		// 조건: 1~5까지 반복
		// 증감: 1씩
		// 정답1) 12345
		
	   /* int start = 1;
	    while(start <=5) {
	    	System.out.println(start);
	    	start = start +1; //증감식 
	    	
	    }
	    */
	    
		/* int i = 0; 
		while(i<5) {
			i++;
			System.out.println(i);
		}
		*/
		
		// 문제1) 1~10까지 반복해 5~9 출력
				// 정답1) 5,6,7,8,9
		// \t tap 만큼
		// \n 줄바꿈
		
		/*int i = 1;
		
		while(i<=10) {
			
			if(i>=5 && i <=9) {
			System.out.print(i + "\t");
			
		}
			i +=1;
		}
		*/
		
		// 문제2 10~1까지 반복해 6~3 거꾸로 출력
		// 결과) 6543
		
		/*int i = 10;
		
		while(i >= 1) {
			
			if(i >=3 && i <=6) {
				System.out.println(i);
			}
			i--;
		}*/
		
		
		/*
		 * #구구단게임[3단계]
		 * 1. 구구단 게임을 5회 반복한다.
		 * 2. 정답을 맞추면 20점이다.
		 * 3. 게임 종료 후, 성적을 출력한다.
		 *
		
		Scanner sc = new Scanner(System.in);
		//랜덤(로또 임의의 수를 하나 뽑는다.)
		Random r = new Random();
		//nextInt(개수) + 시작수
		//1부터 시작해서 3까지 3개중에 하나를 뽑는다. 
		System.out.println(r.nextInt(3)+1);
		
		
		int count = 1;
		int total = 0; //누적 점수를 저장
		int totalcount =0; //맞춘 개수를 저장
		while(count <=5) {
			//1. 랜덤값을 뽑는다.
			// 2단부터 9단 하나 뽑고
			// 1부터 9까지만 곱한다.
			
			int x = r.nextInt(8)+2;
			int y = r.nextInt(9)+1;
			
			int ans = x*y; //정답을 저장
		    System.out.println(x+"x"+ y+"=?");
			System.out.println("정답을 입력");
			int my = sc.nextInt();
					
					
			if(ans == my) {
				total +=20;
				//20씩 더하기 
				totalcount++;
			}
			
		}
		System.out.println("성적:"+ total);
		System.out.println("성적:"+ totalcount * 20);
		*/
		
		
		
		/*
		 * 문제1) 9의 배수중 일의자리가 6인 첫번째 배수 출력 ==> 답: 36
		 * 문제2) 9의 배수중 십의자리가 6인 첫번째 배수 출력 ==> 답:63
		 * 문제3) 8의 배수중 150보다 작고 150에 가장 가까운수를 출력 ==> 답: 144 
		 * 
		 * */
		
		
		
		
		
		/*
 	 Up & Down 게임[2단계]
	 * 1. com 은 랜덤으로 1~100사이를 저장한다.
	 * 2. me 는 1~100사이를 입력한다. 	 
	 * 3. com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 
	 * 4. 정답을 맞추면 게임은 종료된다.
	 *    단! 100점 틀릴 때마다 5점 감소! 0이 되면 게임종료!
	*/
 	
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int com = r.nextInt(100) +1;  
		int score = 100;
		int me = 0;
		
			    //com == me && score == 0
		      
		while(com != me && score != 0 ) {  //true
			System.out.println("1~100 사이의 숫자를 입력하세요");
			me = sc.nextInt();
			
		
				score -= 5;
				if(me > com)
				{
					System.out.println("Down");
					//System.out.println("5점 감점 현재 점수" + score + "입니다.");
				}
				
				if(me < com)
				{
					System.out.println("Up");
				}
				System.out.println("5점 감점 현재 점수" + score + "입니다.");
				
			}
		}
		System.out.println("정답입니다.");
		
		
		/*
 	정수를 무한적으로 입력 받다가 -100을 입력하면 프로그램 종료!
 	
 	횟수값을 입력 받아서 횟수만큼 이름을 출력하기 
 	횟수 : 3
 	횟수 : 10
		 */
		
	int num = 0;
	
	
	do {
		 num = sc.nextInt();
		System.out.println(num);
	}while(num != -100);
		
	while(num != -100) {
		int num1 = sc.nextInt();
		System.out.println(num1);
		if(num1 == -100) break; 
	}
		
	// for(초기식;조건식;증감식)	
	for(int num=0;num != -100;)

		
		
		
		
		
	}

}
