package Farm;

import java.util.Scanner;

public class FarmMenu {

	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();

	void mainMenu() { // 메인메뉴 시작 -------------------------------------
		while (true) {
			System.out.println("==========KH마트==========");
			System.out.println("*****메인 메뉴*****");

			System.out.println("1. 직원메뉴");
			System.out.println("2. 고객메뉴");
			System.out.println("9. 종료");

			System.out.println();
			System.out.println("메뉴번호 선택 >>");
			int key = sc.nextInt();
			sc.nextLine();

			switch (key) {
			case 1: {
				adminMenu();
				break;

			}
			case 2: {
				customerMenu();
				break;
			}
			case 9: {
				System.out.println("프로그램 종료!");
				return;
			}

			default:
				System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
			}
		}

	}// 메인메뉴 끝 -------------------------------------

	void adminMenu() { // 직원메뉴 시작 -------------------------------------
		while (true) {
			System.out.println("*****직원 메뉴*****");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println();
			System.out.println("메뉴번호 선택 >>");

			int key = sc.nextInt();
			sc.nextLine();

			switch (key) {
			case 1: {
				addNewKind();
				break;
			}
			case 2: {
				removeKind();
				break;
			}
			case 3: {
				changeAmount();
				break;
			}
			case 4: {
				printFarm();
				break;
			}
			case 9: {
				System.out.println("메인으로 돌아갑니다.");
				return;
			}
			default:
				System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
			}

		}

	}// 직원메뉴 끝 -------------------------------------

	void customerMenu() { // 고객메뉴 시작 -------------------------------------
		while (true) {
			System.out.println("*****고객 메뉴*****");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println();
			System.out.println("메뉴번호 선택 >>");
			int key = sc.nextInt();
			sc.nextLine();

			switch (key) {
			case 1: {
				buyFarm();
				break;
			}
			case 2: {
				removeFarm();
				break;
			}
			case 3: {
				printBuyFarm();
				break;
			}
			case 9: {
				System.out.println("메인으로 돌아갑니다.");
				return;
			}
			default:
				System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
			}

		}

	} // 고객메뉴 끝 -------------------------------------

	void addNewKind() { // 1-1 새 농산물 추가
		System.out.println("1.과일 / 2. 채소 / 3. 견과");
		System.out.println("추가할 종류 번호: ");
		int key = sc.nextInt();

		switch (key) {
		case 1: {
			System.out.println("이름: ");
			String addname = sc.nextLine();
			System.out.println("수량: ");
			int howmany = sc.nextInt();

			Fruit temp = new Fruit(addname, howmany);

			// adminlist.put(temp);

			int res  = fc.addList(temp); // 컨트롤러의 메서드가 실행되면 리턴값이 1
			if(res == 1) {
				System.out.println("추가 완료!");
			}else {
				System.out.println("에러!");
			}

		}
		case 2: {
			System.out.println("이름: ");
			String addname = sc.nextLine();
			System.out.println("수량: ");
			int howmany = sc.nextInt();

			Vegetable temp2 = new Vegetable(addname, howmany);

			int res = fc.addList(temp2); // 컨트롤러의 메서드가 실행되면 리턴값이 1
			if (res == 1) {
				System.out.println("추가 완료!");
			} else {
				System.out.println("에러!");
			}
		}
		case 3: {
			System.out.println("이름: ");
			String addname = sc.nextLine();
			System.out.println("수량: ");
			int howmany = sc.nextInt();

			Nut temp3 = new Nut(addname, howmany);

			int res = fc.addList(temp3); // 컨트롤러의 메서드가 실행되면 리턴값이 1
			if (res == 1) {
				System.out.println("추가 완료!");
			} else {
				System.out.println("에러!");
			}

		}
		default: {
			System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
		}
		}

	}

	void removeKind() { // 1-2 농산물 종류 삭제
		System.out.println("1.과일 / 2. 채소 / 3. 견과");
		System.out.println("삭제할 종류 번호: ");
		int key = sc.nextInt();
		switch (key) {
		case 1: {
			System.out.println("이름: ");
			String delname = sc.nextLine();
			System.out.println("수량: ");
			int howmany = sc.nextInt();

		}
		case 2: {
			System.out.println("이름: ");
			String delname = sc.nextLine();
			System.out.println("수량: ");
			int howmany = sc.nextInt();

		}
		case 3: {
			System.out.println("이름: ");
			String delname = sc.nextLine();
			System.out.println("수량: ");
			int howmany = sc.nextInt();

		}

		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
		}
	}

	void changeAmount() { // 1-3 농산물 종류 수정
		System.out.println("1.과일 / 2. 채소 / 3. 견과");
		System.out.println("수정할 종류 번호: ");
		int key = sc.nextInt();
		switch (key) {
		case 1: {
			System.out.println("이름: ");
			String rename = sc.nextLine();
			System.out.println("수량: ");
			int howmany = sc.nextInt();

		}
		case 2: {
			System.out.println("이름: ");
			String rename = sc.nextLine();
			System.out.println("수량: ");
			int howmany = sc.nextInt();

		}
		case 3: {
			System.out.println("이름: ");
			String rename = sc.nextLine();
			System.out.println("수량: ");
			int howmany = sc.nextInt();

		}

		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
		}
	}

	void printFarm() { // 1-4 농산물 목록 출력용 메소드
	}

	void buyFarm() { // 2-1 농산물 구매용 메소드
		System.out.println("1.과일 / 2. 채소 / 3. 견과");
		System.out.println("구매할 종류 번호: ");
		int key = sc.nextInt();
		switch (key) {
		case 1: {
			System.out.println("이름: ");
			String purchasename = sc.nextLine();

		}
		case 2: {
			System.out.println("이름: ");
			String purchasename = sc.nextLine();

		}
		case 3: {
			System.out.println("이름: ");
			String purchasename = sc.nextLine();

		}

		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
		}

	}

	void removeFarm() { // 2-2 농산물 구매 취소용 메소드
		System.out.println("1.과일 / 2. 채소 / 3. 견과");
		System.out.println("구매취소할 종류 번호: ");
		int key = sc.nextInt();
		switch (key) {
		case 1: {
			System.out.println("이름: ");
			String PurchaseRemoveName = sc.nextLine();

		}
		case 2: {
			System.out.println("이름: ");
			String PurchaseRemoveName = sc.nextLine();

		}
		case 3: {
			System.out.println("이름: ");
			String PurchaseRemoveName = sc.nextLine();

		}

		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
		}
	}

	void printBuyFarm() { // 2-3 구입한 농산물 출력용 메소드
	}

}
