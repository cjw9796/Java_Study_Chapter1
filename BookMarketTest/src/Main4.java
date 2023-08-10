import java.util.Scanner;
import java.util.ArrayList;

public class Main4 { //완성 
	static ArrayList<String> cartItemList = new ArrayList<>();
	static ArrayList<Integer> cartItemCountList = new ArrayList<>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String userName = input.next();

		System.out.print("연락처를 입력하세요 : ");
		int userMobile = input.nextInt();

		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";

		boolean quit = false;

		while (!quit) {
			System.out.println("***********************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);

			menuIntroduction(); // 메뉴표시

			System.out.print("메뉴 번호를 선택해주세요 ");
			int n = input.nextInt();

			if (n < 1 || n > 9) {
				System.out.println("1부터 9까지의 숫자를 입력하세요.");
			} else {
				switch (n) {

				case 1:
					// System.out.println("현재 고객 정보 : ");

					menuGuestInfo(userName, userMobile);
					break;
				case 2:
					// System.out.println("장바구니 상품 목록 보기 :");
					menuCartItemList();
					break;
				case 3:
					// System.out.println("장바구니 비우기");
					menuCartClear();
					break;
				case 4:
					// System.out.println("장바구니에 항목 추가하기 : ");
					menuCartAddItem();
					break;
				case 5:
					// System.out.println("5. 장바구니의 항목 수량 줄이기");
					menuCartRemoveItemCount();
					break;
				case 6:
					// System.out.println("6. 장바구니의 항목 삭제하기");
					menuCartRemoveItem();
					break;
				case 7:

					// System.out.println("7. 영수증 표시하기");
					menuCartBill(userName, userMobile);
					break;
				case 8:
					// System.out.println("8. 종료");
					menuExit();
					quit = true;
					break;
				case 9:
					// System.out.println("9. 관리자로그인");
					AdminInfo(userName, userMobile);
				}
			}
		}

	}

	public static void menuIntroduction() {
		System.out.println("******************************");
		System.out.println(" 1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
		System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println(" 3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
		System.out.println(" 7. 영수증 표시하기 \t8. 종료");
		System.out.println(" 9. 관리자 로그인");
		System.out.println("******************************");
	}

	public static void menuGuestInfo(String name, int mobile) { // 1. 고객 정보 확인하기
		System.out.println("현재 고객 정보 : ");
		System.out.println("이름 " + name + " 연락처 " + mobile);
	}

	public static void AdminInfo(String name, int mobile) { // 9.관리자 로그인
		Scanner input = new Scanner(System.in);
		System.out.println("관리자 정보를 입력하세요");
		System.out.println("아이디:");
		int id = input.nextInt();
		System.out.println("비밀번호: ");
		int password = input.nextInt();

		int AdminID = 1111; // 관리자 id
		int AdminPW = 2222; // 관리자 pw

		if (id == AdminID && password == AdminPW) {
			System.out.println("로그인 성공");
			System.out.println("관리자 정보: ");
			System.out.println("이름 " + name + " 연락처 " + mobile);
			System.out.println("아이디" + id + "비밀번호" + password);
		} else {
			System.out.println("로그인에 실패하였습니다.");
			return;
		}

	}

	public static void menuCartItemList() { // 2. 장바구니 상품 목록 보기
		System.out.println("장바구니 상품 목록 보기 :");
		if (cartItemList.isEmpty()) {
			System.out.println("장바구니에 항목이 없습니다.");
		} else {
			for (int i = 0; i < cartItemList.size(); i++) {
				System.out.println((i + 1) + ". " + cartItemList.get(i) + " 수량: " + cartItemCountList.get(i));
			}
		}
	}

	public static void menuCartClear() { // 3. 장바구니 비우기
		System.out.println("장바구니를 비우시겠습니까? (Y/N)");
		Scanner input = new Scanner(System.in);
		String choice = input.next();
		if (choice.equals("Y")) {
			cartItemList.clear();
			cartItemCountList.clear();
			System.out.println("장바구니가 비워졌습니다.");
		} else {
			System.out.println("취소되었습니다.");
		}
	}

	public static void menuCartAddItem() { // 4. 바구니에 항목 추가하기
		Scanner input = new Scanner(System.in);
		System.out.println("추가할 도서의 ID를 입력하세요 : ");
		String itemName = input.nextLine();
		System.out.println("수량을 입력하세요 : ");
		int itemCount = input.nextInt();

		if (cartItemList.contains(itemName)) {
			int index = cartItemList.indexOf(itemName);
			cartItemCountList.set(index, cartItemCountList.get(index) + itemCount);
		} else {
			cartItemList.add(itemName);
			cartItemCountList.add(itemCount);
		}

		System.out.println("장바구니에 " + itemName + " " + itemCount + "개를 추가했습니다.");
	}

	public static void menuCartRemoveItemCount() { // 5. 장바구니의 항목 수량 줄이기
		Scanner input = new Scanner(System.in);
		System.out.println("수량을 줄일 도서의 ID를 입력하세요  : ");
		String itemName = input.nextLine();

		if (cartItemList.contains(itemName)) {
			int index = cartItemList.indexOf(itemName);
			System.out.println("현재 " + itemName + "의 수량은 " + cartItemCountList.get(index) + "개 입니다.");
			System.out.println("얼마나 줄이시겠습니까? : ");
			int itemCount = input.nextInt();

			if (itemCount >= cartItemCountList.get(index)) {
				cartItemList.remove(index);
				cartItemCountList.remove(index);
				System.out.println(itemName + "이/가 삭제되었습니다.");
			} else {
				cartItemCountList.set(index, cartItemCountList.get(index) - itemCount);
				System.out.println(itemName + "의 수량이 " + itemCount + "개 줄었습니다.");
			}

		} else {
			System.out.println("해당 상품이 장바구니에 존재하지 않습니다.");
		}
	}

	public static void menuCartRemoveItem() { // 6. 장바구니의 항목 삭제하기
		Scanner input = new Scanner(System.in);
		System.out.println("삭제할 도서의 ID를 입력하세요  : ");
		String itemName = input.nextLine();

		if (cartItemList.contains(itemName)) {
			int index = cartItemList.indexOf(itemName);
			cartItemList.remove(index);
			cartItemCountList.remove(index);
			System.out.println(itemName + "이/가 삭제되었습니다.");
		} else {
			System.out.println("해당 상품이 장바구니에 존재하지 않습니다.");
		}
	}

	public static void menuCartBill(String name, int mobile) { // 7. 주문처리하기
		Scanner input = new Scanner(System.in);
		System.out.println("배송 받을 분은 고객 정보와 같습니까? (Y/N)");
		String choice = input.next();
		if (choice.equals("Y")) {
			System.out.println("배송지를 입력하세요: ");
			String address = input.next();

			System.out.println("-----배송받을 고객 정보-----");
			System.out.println("이름 " + name + " 연락처 " + mobile);
			System.out.println("배송지: "+ address);
		} 
		else if (choice.equals("N")) {
			System.out.println("배송받을 고객명을 입력하세요");
			String name2 = input.next();
			System.out.println("배송받을 고객의 연락처를 입력하세요");
			int mobile2 = input.nextInt();
			System.out.println("배송받을 고객의 배송지를 입력하세요");
			String address2 = input.next();
			
			System.out.println("-----배송받을 고객 정보-----");
			System.out.println("이름 " + name2 + " 연락처 " + mobile2);
			System.out.println("배송지: "+ address2);
		}

		menuCartItemList(); // 장바구니 상품 목록: 출력

	};

	public static void menuExit() { // 8.종료
		System.out.println("8. 종료");
	}

}
