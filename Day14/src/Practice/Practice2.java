package Practice;

import java.util.Scanner;

public class Practice2 { //조건문과 반복문 종합문제 (실습문제 2번)
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수:");
		int num = scan.nextInt(); 
	
		if (num %2 == 0) { //짝수 
			System.out.println("수");
			
		}else if(num %2 ==1){ //홀수 
			System.out.println("박");
			
		}else if(num < 1) {//양수가 아닌경우 
			System.out.println("양수가 아닙니다.");
			System.out.println("정수: ");
			int num2 = scan.nextInt();
			
			if(num2 %2 == 0) { //짝수 
				System.out.println("수");
				
			}else if(num2 %2 ==1){ //홀수 
				System.out.println("박");
				
			}
		}
		

	}

}