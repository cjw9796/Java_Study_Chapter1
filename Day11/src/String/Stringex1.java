package String;

import java.util.Scanner;

public class Stringex1 { //문자열을 입력받아 대소관계 판정

	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("문자열 s1: "); String s1= stdIn.next(); 
		System.out.println("문자열 s2: "); String s2= stdIn.next();

		int balance = s1.compareTo(s2);
		if(balance <0) {
			System.out.println("s1이 작다");
		}else if(balance >0) {
			System.out.println("s2가 작다");
		}else {
			System.out.println("같다");
		}
	}

}
