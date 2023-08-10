package Practice;

import java.util.Random;

public class Practice11 {

	public static void main(String[] args) {
		 int[] arr = new int[10];
	        
	        Random random = new Random();
	        
	        
	        // 1~10 사이의 난수를 발생시켜 배열에 초기화
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = random.nextInt(10) + 1;
	        }
	        
	        // 배열의 값 출력
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	}

}
