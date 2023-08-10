package Practice;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 배열 길이 입력 받기
        System.out.print("정수: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        // 배열 값 초기화
        for (int i = 0; i < length; i++) {
            System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
            arr[i] = scanner.nextInt();
        }

        // 배열 전체 값 출력
        System.out.print("배열: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 배열 값의 합 계산 및 출력
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        System.out.println("총 합: " + sum);

        scanner.close();

	}

}
