package Practice;

import java.util.Scanner;

public class Practice4 { //조건문과 반복문 종합문제 (실습문제 4번)

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
		///////////////////////////////////////////
		System.out.println("더 하시겠습니까? (Y/N)");
		char ch2 = sc.next().charAt(0);
		
		char char1 = 'Y'; 
		char char2 = 'y';   
		char char3 = 'N'; 
		char char4 = 'n'; 
		
		if(ch2 == char1 && ch2 == char2 && ch2 == char3 && ch2 == char4) {
			System.out.println("문자열: ");  
			String str2 = sc.nextLine();  
			
			
		}else{
			System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
			System.out.println("더 하시겠습니까? (Y/N)");
		}
		
		
		
		

	}

}
