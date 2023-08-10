package Practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("양의 정수: ");
		int n = scanner.nextInt();

		
		int[] arr = new int[n];

		
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		
	//출력
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	

	}

}

