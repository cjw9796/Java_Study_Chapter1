package MusicExampleteacher;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicView { // 관리하는 클래스
	// 상속이 안된다.!
	// 이 scanner 사용하려면 지금 생성된 주소값을 넘겨줘야된다.
	private Scanner sc = new Scanner(System.in);

	// 실제 화면에서 입력한 처리하는 부분
	private MusicController mc = new MusicController(sc);

	// 이미 컨트롤러가 만들어 놓은 주소값을 가지고 주소값 복사해서
	// 저장해서 사용하기

	void mainMenu() {
		
		System.out.println("메뉴를 입력:");
		int sel = sc.nextInt();
		
		// 위에서 메뉴를 선택한 sel 변수가 들어간다.
		switch(sel) {
		case 1:
			// 추가 메서드 
			addList();
			
			// 1.뷰가 컨트롤러가 가지고 있는 arraylist 접근하기
			// 자신이 가지고 있는 mc변수가 컨트롤러다 
			System.out.println(mc.list.size());
			
			break;
		}
		
		/*
		 * ******* 메인 메뉴 ******* 1. 마지막 위치에 곡 추가 // addList() 실행 2. 첫 위치에 곡 추가 //
		 * addAtZero() 3. 전체 곡 목록 출력 // printAll() 4. 특정 곡 검색 // searchMusic() 5. 특정 곡
		 * 삭제 // removeMusic() 6. 특정 곡 정보 수정 // setMusic() 7. 곡명 오름차순 정렬 // ascTitle()
		 * 8. 가수명 내림차순 정렬 // descSinger() 9. 종료 // “종료” 출력 후 main()으로 리턴 메뉴 번호 선택 : >>
		 * 입력 받음 // 메뉴 화면 반복 실행 처리
		 */
	}
	// 뷰가 가지고 있는 addList() 함수가 실행된다. 
	
	void addList() {

		// 뮤직에 대한 입력을 받는다. 
		System.out.println("곡명:");
		String name = sc.nextLine();
		
		// 위에서 입력받으면 엔터가 남아있다. 버퍼를 비우는 작업
		sc.nextLine();
		
		System.out.println("가수명:");
		String sname = sc.nextLine();
		
		// Music클래스를 만들어서 한꺼번에 넘겨준다.
		Music temp = new Music(name,sname);
		
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

}
