package Practice;

import java.util.Random;

public class Practice13 {

	public static void main(String[] args) {
		// 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
        int[] arr = new int[10];

        Random random = new Random();

        // 중복된 값이 없는 배열에 초기화
        for (int i = 0; i < arr.length; i++) {
            int randomNumber;
            boolean isDuplicate;
            do {
                isDuplicate = false;
                randomNumber = random.nextInt(10) + 1;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == randomNumber) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);
            arr[i] = randomNumber;
        }

        // 배열의 값 출력
        System.out.print("배열 값 : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

	}

}
