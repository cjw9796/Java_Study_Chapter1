package Practice;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 요일 배열 초기화
        String[] daysOfWeek = {"월", "화", "수", "목", "금", "토", "일"};

        // 숫자 입력 받기
        System.out.print("0 ~ 6 사이 숫자 입력: ");
        int inputNum = scanner.nextInt();

        // 입력 받은 숫자에 따라 요일 출력
        if (inputNum >= 0 && inputNum <= 6) {
            System.out.println(daysOfWeek[inputNum] + "요일");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

        scanner.close();

	}

}
