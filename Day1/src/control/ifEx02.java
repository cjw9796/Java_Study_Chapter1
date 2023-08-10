package control;

import java.util.Scanner;

public class ifEx02 {

	public static void main(String[] args) {
		/*
		 * #최대값 구하기[1단계]
		 * 1. 숫자 3개를 입력받는다. 
		 * 2. 입력받은 3개의 수를 비교하여,
		 * 3. 가장 큰 수(MAX)를 출력한다.
		 * 4. 가장 작은 수 (MIN)을 출력한다. 
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요.");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		int max = number1;
		int min = number1;
		
		//큰값구하기
		if(max < number3) {
			max = number3;
		}
		if(max < number3) {
			max = number3;
		}
		
		//작은값 구하기
		if(min > number3) {
			min = number2;
		}
		if(min < number3) {
			min = number3;
		}
		// 문제2) 
		// println()한번만 이용해서 
		// 최대값 : **입니다. 
		// 최소값 : **입니다. 
		
		System.out.println("최대값:" + max + "\n" + "최소값:" + min);
		
		
		
		
		
		//input.close();
		
	}

}
