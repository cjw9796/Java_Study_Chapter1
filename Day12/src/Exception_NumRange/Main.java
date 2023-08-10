package Exception_NumRange;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수1:");
			int num1 = sc.nextInt();
			
			System.out.println("정수2:");
			int num2 = sc.nextInt();

			System.out.println(num1 + "은" + num2 + "의 배수인가?");
			System.out.println(num1 % num2 ==0 );

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
