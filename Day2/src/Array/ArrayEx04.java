package Array;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		/*
		 * # 숫자이동[1단계] 1. 숫자2는 캐릭터이다. 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로 숫자2를 입력하면, 캐릭터가 오른쪽으로
		 * 이동한다. 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다. 4. {0, 0, 2, 0, 0, 0, 0}; ==> 왼쪽 ==>
		 * {0, 2, 0, 0, 0, 0, 0};
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		// 배열의 실제 값이 0 = 빈공간
		// 2 = 주인공 옷
		int[] game = { 0, 0, 0, 2, 0, 0, 0 };

		// 게임 화면을 출력
		int size = game.length;
		int index = 0; // 방에 접근할 번호
		int player = 3; // 주인공이 있는 방번호를 저장

		while (true) {

			index = 0; // 한번 반복을 하면 index값이 7까지 감
						// 초기화 하지 않으면 index 7
						// size 7 index 7 false 
						// 따라서 index = 0;을 통해 초기화 
			while (index < size) {

				if (game[index] == 0) {
					System.out.print("__ ");
				} else {
					System.out.print("옷 ");
				}
				index = index + 1; // index++
			}
			System.out.println();
			System.out.println("왼쪽 1 or 오른쪽 2 입력하세요");

			int move = scan.nextInt();

			if (move == 1) { // 왼쪽으로 움직이는 코드
				// 왼쪽으로 이동시 기존에 있던 방은 빈방
				if (player != 0) {
					game[player] = 0;
					game[player - 1] = 2;
					player -= 1;
				}
			}

			else if(move==2) {// 오른쪽으로 움직이는 코드

				if (player + 1 < 7) {
					game[player] = 0;
					game[player + 1] = 2;
					player += 1;
				}
			}else if(move==0) {
				break;
			}

		} // 무한반복 while의 끝
		
		System.out.println("게임 종료!");
		
		
		
		
		

	}
}