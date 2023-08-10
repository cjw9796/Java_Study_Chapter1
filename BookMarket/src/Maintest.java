import java.util.Scanner;

public class Maintest {

	// 메뉴별 메서드 만들기 ++

	// 1.고객정보 확인하기 메서드
	public static void menuGeustInfo() {
		System.out.println("1. 고객 정보 확인하기");

	}

	// 2.장바구니 상품 목록 보기 메서드
	public static void menuCartItemlist() {
		System.out.println("2. 장바구니 상품 목록 보기");

	}

	// 3.장바구니 비우기 메서드
	public static void menuCartClear() {
		System.out.println("3. 장바구니 비우기");

	}

	// 4.바구니에 항목 추가하기 메서드
	public static void menuCartAddItem() {
		System.out.println("4.바구니에 항목 추가하기");

	}

	// 5.장바구니의 항목 수량 줄이기 메서드
	public static void menuCartRemoveItemCount() {
		System.out.println("5.장바구니의 항목 수량 줄이기");

	}

	// 6. 장바구니의 항목 삭제하기 메서드
	public static void menuCartRemoveItem() {
		System.out.println("6.장바구니의 항목 삭제하기");

	}

	// 7.영수증 표시하기 메서드
	public static void menuCartBill() {
		System.out.println("7. 영수증 표시하기");

	}

	// 8.종료 메서드
	public static void menuExit() {
		System.out.println("8.종료");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Name;
		int PhoneNumber;
		int MenuNumber;
		Maintest maintest = new Maintest(); // Maintest 객체생성

		System.out.println("이름을 입력하세요.");
		Name = sc.next();
		System.out.println("연락처를 입력하세요");
		PhoneNumber = sc.nextInt();

		System.out.println("현재 고객 정보:");
		System.out.println("이름:" + Name + "연락처:" + PhoneNumber);

		System.out.println("**********************************************");
		System.out.println("	Welcome to Shopping Mall");
		System.out.println("	Welcome to Book Market!");
		System.out.println("**********************************************");
		System.out.println("1. 고객 정보 확인하기 \t 4.바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기 \t 5.장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기 \t	 6.장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기 \t	 8.종료");
		System.out.println("**********************************************");

		System.out.println("메뉴 번호를 선택해주세요");
		System.out.println("1부터 8까지의 숫자를 입력하세요");
		MenuNumber = sc.nextInt();

		switch (MenuNumber) {
		case 1:
			Maintest.menuGeustInfo();

			break;
		case 2:
			Maintest.menuCartItemlist();

			break;
		case 3:
			Maintest.menuCartClear();
			break;
		case 4:
			Maintest.menuCartAddItem();
			break;
		case 5:
			Maintest.menuCartRemoveItemCount();
			break;
		case 6:
			Maintest.menuCartRemoveItem();
			break;
		case 7:
			Maintest.menuCartBill();
			break;
		case 8:
			Maintest.menuExit();
			break;

		default:
			break;
		}

	}

}