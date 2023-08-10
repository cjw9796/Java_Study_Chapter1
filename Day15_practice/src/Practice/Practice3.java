package Practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 사용자에게 양의 정수 입력 받기
		System.out.print("양의 정수: ");
		int n = scanner.nextInt();

		// 입력 받은 값만큼 배열 크기 할당
		int[] arr = new int[n];

		// 1부터 입력 받은 값까지 배열에 초기화
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		// 배열의 값을 출력
	
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(); // 개행

	}

}
