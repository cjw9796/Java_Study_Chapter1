package Practice;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int size;
        int[] arr;

        // 3이상의 홀수 자연수를 입력받기
        do {
            System.out.print("정수: ");
            size = scanner.nextInt();

            if (size < 3 || size % 2 == 0) {
                System.out.println("다시 입력하세요.");
            }
        } while (size < 3 || size % 2 == 0);

        arr = new int[size];

        int middle = size / 2;

        // 배열의 중간까지 오름차순으로 값 할당
        for (int i = 0; i <= middle; i++) {
            arr[i] = i + 1;
        }

        // 배열의 중간 이후부터 내림차순으로 값 할당
        for (int i = middle + 1; i < size; i++) {
            arr[i] = middle - (i - middle);
        }

        // 배열 값 출력
        System.out.print("배열: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();

	}

}
