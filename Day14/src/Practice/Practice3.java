package Practice;

import java.util.Scanner;

public class Practice3 { //조건문과 반복문 종합문제 (실습문제 3번)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열: ");
		String str = sc.nextLine();
		
		System.out.println("문자 입력 :");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(str+ "안에 포함된 " + ch + "개수: " + count);
		

	}

}
