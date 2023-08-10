package MusicExample;

import java.util.Scanner;



public class MusicView {

		
	
	private static Scanner sc = new Scanner(System.in);

	// 실제 화면에서 입력한 처리하는 부분
	private static MusicController mc = new MusicController(sc);

	void mainMenu() {
		//
		System.out.println("메뉴를 입력:");
		int sel = sc.nextInt();

		// 위에서 메뉴를 선택한 sel 변수가 들어간다.
		switch (sel) {
		case 1:
			addList();
			break;
		case 2:
			addAtZero();
			break;
		case 3:
			printAll();
			break;
		case 4:
			searchMusic();
			break;
		case 5:
			removeMusic();
			break;
		case 6:
			setMusic();
			break;
		case 7:
			ascTitle();
			break;
		case 8:
			descSinger();
			break;
		case 9:
			menuExit();

			break;

		}

		System.out.println("******* 메인 메뉴*******");
		System.out.println("1.마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 가수명 내림차순 정렬");
		System.out.println("9. 종료");
		// System.out.println("메뉴번호 선택");

	}

	void addList() { // 1번메뉴
		System.out.println("1.마지막 위치에 곡 추가");

		// 뮤직에 대한 입력을 받는다.
		System.out.println("곡 명:");
		String name = sc.nextLine();

		sc.nextLine();

		System.out.println("가수 명:");
		String sname = sc.nextLine();

		// Music클래스를 만들어서 한꺼번에 넘겨준다.
		Music temp = new Music(name, sname);
		
		// 실제 저장을 하는 것은 컨트롤러가 한다.
		// 뷰입장에서는 컨트롤러가 가지고 있는 list 안보여요!
		// addList() 컨트롤러에 메서드를 만들어서 뮤직에 대한 객체의 
		// 주소값을 주겠다.
		int res  = mc.addList(temp); // 컨트롤러의 메서드가 실행되면 리턴값이 1
		if(res == 1) {
			System.out.println("추가 완료!");
		}else {
			System.out.println("에러!");
		}

	
	}

	public static void addAtZero() { // 2번메뉴
		System.out.println("2. 첫 위치에 곡 추가");
		Scanner addList = new Scanner(System.in);
		System.out.println("곡 명을 입력하세요:");
		String songname = addList.nextLine();

		Scanner addList2 = new Scanner(System.in);
		System.out.println("가수명을 입력하세요:");
		String singername = addList2.nextLine();
	}

	public static void printAll() { // 3번메뉴
		System.out.println("3. 전체 곡 목록 출력");

	}

	public static void searchMusic() { // 4번메뉴
		System.out.println("4. 특정 곡 검색");
		Scanner addList = new Scanner(System.in);
		System.out.println("곡 명을 입력하세요:");
		String songname = addList.nextLine();

	}

	public static void removeMusic() { // 5번메뉴
		System.out.println("5. 특정 곡 삭제");
		Scanner addList = new Scanner(System.in);
		System.out.println("곡 명을 입력하세요:");
		String songname = addList.nextLine();

	}

	public static void setMusic() { // 6번메뉴
		System.out.println("6. 특정 곡 정보 수정");
		Scanner addList = new Scanner(System.in);
		System.out.println("수정할 곡 명을 입력하세요:");
		String songname = addList.nextLine();

		Scanner addList2 = new Scanner(System.in);
		System.out.println("수정할 가수명을 입력하세요:");
		String singername = addList2.nextLine();

		// setmusic으로 값 넘기기

	}

	public static void ascTitle() { // 7번메뉴
		System.out.println("7. 곡명 오름차순 정렬");

	}

	public static void descSinger() { // 8번메뉴
		System.out.println("8. 가수명 내림차순 정렬");
	}

	public static void menuExit() { // 9번 종료
		System.out.println("9. 종료");
	}

	
}
