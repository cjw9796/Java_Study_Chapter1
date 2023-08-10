package Practice;

public class Practice1 { //배열 실습문제 1번 

	public static void main(String[] args) {
		 // 길이가 10인 배열 선언
        int[] arr = new int[10];

        // 1부터 10까지의 값을 배열에 넣음
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }

        // 배열의 값을 출력
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
      

	}

}
