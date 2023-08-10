package Practice;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] Chicken = {"후라이드치킨","양념치킨","간장치킨"};
		
		System.out.println("치킨 이름을 입력하세요: ");
		String SearchChicken = scanner.nextLine();
		
		if(SearchChicken == "후라이드치킨") {
			System.out.println("후라이드치킨 배달가능");
		}else if(SearchChicken == "양념치킨") {
			System.out.println("양념치킨 배달가능");
		}else if(SearchChicken == "간장치킨") {
			System.out.println("간장치킨 배달가능");
		}else {
			System.out.println(SearchChicken+ "는없는메뉴입니다.");
		}
		
		
		
	}

}
