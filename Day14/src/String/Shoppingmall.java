package String;

import java.util.Scanner;

class Shoppingmall_Menu {
	
	

}

public class Shoppingmall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean run = true;

		while (run) {

			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("1)티셔츠");
				System.out.println("2)바지");
				System.out.println("3)뒤로가기");
				if (sel == 3) {

				}

			} else if (sel == 2) {
				System.out.println("1)가디건");
				System.out.println("2)치마");
				System.out.println("3)뒤로가기");
				if (sel == 3) {
					

				}

			} else if (sel == 3) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}
