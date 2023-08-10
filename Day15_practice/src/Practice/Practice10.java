package Practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("주민등록번호(- 포함) : ");
	        String input = scanner.nextLine();

	        // 주민등록번호에서 -를 기준으로 앞자리와 뒷자리로 분리
	        String[] split = input.split("-");
	        String front = split[0];
	        String back = split[1];

	        // 뒷자리에 있는 성별자리부터 끝까지 *로 가리기
	        String hiddenBack = back.substring(0, 1) + "*******";

	        // 원본 배열 값은 변경 없이 복사본으로 출력
	        System.out.println(front + "-" + hiddenBack);

	        scanner.close();

	}

}
