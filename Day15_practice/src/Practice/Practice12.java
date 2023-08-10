package Practice;

import java.util.Random;

public class Practice12 {

	public static void main(String[] args) {
		// 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
        int[] arr = new int[10];
        
        Random random = new Random();
        
        // 1~10 사이의 난수를 발생시켜 배열에 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 1;
        }
        
        // 배열의 값 출력
        System.out.print("배열 전체 값 : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // 최대값과 최소값 찾기
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // 최대값과 최소값 출력
        System.out.println("\n최대값 : " + max);
        System.out.println("최소값 : " + min);

	}

}
