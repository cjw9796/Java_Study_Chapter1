package Lottery;

import java.util.HashSet;
import java.util.Scanner;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController mc = new LotteryController();

	void mainMenu() { // 메인메뉴
		while (true) {
			System.out.println("=======KH 추첨 프로그램=======");

			System.out.println("*******메인 메뉴*********");

			System.out.println("1. 추첨 대상 추가"); // insertObject 실행
			System.out.println("2. 추첨 대상 삭제"); // deleteObject 실행
			System.out.println("3. 당첨 대상 확인"); // winObject 실행
			System.out.println("4. 정렬된 당첨 대상 확인");// sortedwinObject (Lottery Controller)실행
			System.out.println("5. 당첨 대상 검색"); // searchWinner 실행
			System.out.println("9. 종료"); // 종료 후 main으로 이동

			System.out.println("메뉴번호 선택 >>");
			int key = sc.nextInt();
			sc.nextLine();

			switch (key) {
			case 1: {
				insertObject();
				break;
			}

			case 2: {
				deleteObject();
				break;
			}
			case 3: {
				winObject();
				break;
			}
			case 4: {
				// sortedwinObject(); //(Lottery Controller)랑 연결
				break;
			}
			case 5: {
				searchWinner();
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

	}

	void insertObject() { // 추첨대상 추가를 위해 정보를 받는 메소드
		
		//System.out.println("추가할 추첨 대상 수: ");
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("핸드폰 번호: ");
		String phone = sc.nextLine();
		String[] lottery= name.split("");
		String[] win = phone.split(phone);
		
		Lottery temp = new Lottery(lottery[0], lottery[1]);
		
		boolean res = mc.insertObject(lottery[0], temp);
		
		if(res) {
			System.out.println("**명 추가 완료되었습니다.");
		}else {
			System.out.println("추가 실패!");
		}
//		
//		System.out.println("핸드폰 번호: ");
//		String phone = sc.nextLine();
//		String[] list = phone.split(phone);
//		
//		Lottery temp = new Lottery(list[0], list[1]);
		
	}

	void deleteObject() { // 특정 추첨 대상 삭제 결과를 알리는 메소드
		System.out.println("삭제: ");
		String name = sc.nextLine();
		if(Lottery.contains(name)) {
			Lottery.remove(name);
			System.out.println("삭제 완료");
		}else{
			System.out.println("존재하지 않는 대상입니다.");
		}

	}

	void winObject () { // println 메소드를 이용하여 당첨 대상자 출력

}

	}
	
	void sortedwinObject() { //정렬된 당첨 대상 확인
		
	}

	void searchWinner() { // 당첨자 중 특정 대상이 있는지 결과를 출력
		System.out.println("검색할 대상의 이름과 핸드폰번호를 입력하세요");
		String name = sc.nextLine(); 
		HashSet<Lottery> win = new HashSet<>();
		System.out.println(win.contains(name)); //Hashset 값 검색 
		if(win.contains(name)) {
			System.out.println("name"+"당첨목록에 있습니다.");
	}else {
		System.out.println("당첨목록에 없습니다.");
	}

}
