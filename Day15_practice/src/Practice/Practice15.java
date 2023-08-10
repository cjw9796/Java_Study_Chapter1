package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // 사용자로부터 문자열 입력 받기
	        System.out.print("문자열을 입력하세요: ");
	        String inputString = scanner.nextLine();

	        // 입력 받은 문자열을 문자 배열로 변환
	        char[] charArray = inputString.toCharArray();

	        // 중복을 피하기 위해 문자를 저장할 ArrayList 선언
	        ArrayList<Character> characterList = new ArrayList<>();

	        // 문자열에 있는 문자를 배열에 저장하고 중복 제거
	        for (char c : charArray) {
	            if (!characterList.contains(c)) {
	                characterList.add(c);
	            }
	        }

	        // 문자열에 있는 문자 출력
	        System.out.print("문자열에 있는 문자: ");
	        for (char c : characterList) {
	            System.out.print(c + ", ");
	        }

	        // 문자의 개수 출력
	        System.out.println("\n문자 개수: " + characterList.size());

	        scanner.close();

	}

}
