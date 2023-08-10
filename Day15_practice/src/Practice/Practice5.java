package Practice;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // 사용자에게 문자열 입력 받기
	        System.out.print("문자열 입력: ");
	        String inputStr = scanner.nextLine();

	        // 사용자에게 검색할 문자 입력 받기
	        System.out.print("문자 입력: ");
	        char searchChar = scanner.next().charAt(0);

	        // 입력 받은 문자열을 char 배열로 변환
	        char[] charArray = inputStr.toCharArray();

	        // 검색할 문자의 개수와 인덱스 출력
	        int count = 0;
	        System.out.print(inputStr + "에 " + searchChar + "가 존재하는 위치(인덱스): ");
	        for (int i = 0; i < charArray.length; i++) {
	            if (charArray[i] == searchChar) {
	                System.out.print(i + " ");
	                count++;
	            }
	        }
	        System.out.println();
	        System.out.println(searchChar + " 개수: " + count);

	        scanner.close();

	}

}
