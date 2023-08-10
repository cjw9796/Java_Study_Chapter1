package Practice;

import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 배열의 크기 입력 받기
        System.out.print("배열의 크기를 입력하세요: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        // 문자열 배열 선언 및 할당
        String[] stringArray = new String[size];

        // 사용자로부터 배열의 각 인덱스에 값을 입력하여 초기화
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + "번째 문자열: ");
            stringArray[i] = scanner.nextLine();
        }

        // 사용자로부터 더 값을 입력할 것인지 확인
        String input;
        do {
            System.out.print("더 값을 입력하시겠습니까? (Y/N): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("Y")) {
                System.out.print("더 입력하고 싶은 개수: ");
                int num = scanner.nextInt();
                scanner.nextLine(); // 버퍼 비우기

                // 배열 크기 늘리기
                String[] tempArray = new String[stringArray.length + num];
                System.arraycopy(stringArray, 0, tempArray, 0, stringArray.length);
                stringArray = tempArray;

                // 사용자로부터 추가할 값을 입력하여 초기화
                for (int i = size; i < size + num; i++) {
                    System.out.print((i + 1) + "번째 문자열: ");
                    stringArray[i] = scanner.nextLine();
                }

                size += num;
            }
        } while (input.equalsIgnoreCase("Y"));

        // 배열 전체 값을 출력
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(stringArray[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();

	}

}
