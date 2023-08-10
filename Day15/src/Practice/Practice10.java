package Practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("주민등록번호(-포함): ");
		int number = scanner.nextInt();
		
		int[] arr = new int[number];
		
		int i = 0;
		for(i=0; i<arr.length; i++) {
			if(i <= 7) {
				System.out.println(arr);
			}else {
				System.out.println("*");
			}
		}
		
		
		

	}

}
