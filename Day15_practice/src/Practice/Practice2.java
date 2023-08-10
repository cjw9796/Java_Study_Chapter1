package Practice;

public class Practice2 {

	public static void main(String[] args) {
		// 길이가 10인 배열 선언
        int[] arr = new int[10];

        // 1부터 10까지의 값을 역순으로 배열에 넣음
        for (int i = 0; i < 10; i++) {
            arr[i] = 10 - i;
        }

        // 배열의 값을 출력
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(); // 개행

	}

}
