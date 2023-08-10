package Book;

import java.util.Scanner;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	void Mainmenu() {
		while (true) {
			System.out.println("==Welcome KH Library==");
			System.out.println("*****메인 메뉴*****");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 선택>>");

			int sel = sc.nextInt();

			switch (sel) {
			case 1: {
				insertBook();
				break;
			}
			case 2: {
				selectList();
				break;
			}
			case 3: {
				searchBook();
				break;
			}
			case 4: {
				deleteBook();
				break;
			}
			case 5: {
				ascBook();
				break;
			}
			case 9: {
				System.out.println("프로그램을 종료합니다.");
				return;
			}

			default:
				System.out.println("잘못 입력하였습니다. 다시 선택해 주세요");

			}

		}

	}

	void insertBook() {
		while (true) {
			Book b = null;
			System.out.println("=====새 도서 추가=====");
			System.out.println("책 정보를 입력해 주세요.");
			System.out.println("도서 명: ");
			String title = sc.nextLine();
			System.out.println("저자 명: ");
			String author = sc.nextLine();
			System.out.println("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타)");
			int sel = sc.nextInt();
			System.out.println("가격");
			int price = sc.nextInt();

			switch (sel) {
			case 1:
				b = new humanities("인문", title);
				break;
			case 2:
				b = new science("과학", title);
				break;

			case 3:
				b = new foreignLanguages("외국어", title);
				break;
			case 4:
				b = new others("기타", title);
				break;

				if (bc.insertbook(b)) {
					System.out.println("새 도서 추가 성공");
				} else
					System.out.println("새 도서 추가 실패");

			}

		}
	}

	void selectList() {
		System.out.println();

	}

	void searchBook() {
		System.out.println("검색 키워드: ");

	}

	void deleteBook() {
		System.out.println("삭제 할 도서 명: ");
		System.out.println("삭제 할 저자 명: ");

	}

	void ascBook() {

	}

}
