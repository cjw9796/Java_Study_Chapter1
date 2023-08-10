package Practice;

import java.util.Random;
import java.util.Scanner;

public class Practice5 { //조건문과 반복문 종합문제 (실습문제 5번)

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int com = r.nextInt(100) + 1;
		int score = 100;
		int me = 0;
		int count = 1;

		while (com != me && score != 0) { // true
			System.out.println("1~100 사이의 임의의 난수를 맞춰보세요: ");
			me = sc.nextInt();

			
			if (me > com) {
				System.out.println("Down");
				count++;

			} else if (me < com) {
				System.out.println("Up");
				count++;
			} else if (me == com) {
				System.out.println("정답입니다!!");
				System.out.println(count + "회만에 맞추셨습니다.");
			}
			
			 if (me > 100 || me < 1) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
				count = 1;

			}

		} // while끝

	}

}
