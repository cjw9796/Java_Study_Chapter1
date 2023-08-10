package Method;

import java.util.Scanner;

public class Coffee {
	
	class menu{
		String menu;
		int price;
		
		public menu(String _menu, int _price) {
			menu = _menu;
			price = _price;
		}
	}

	
	class size{
		String size;
		
		public size(String _size) {
			size = _size;
		}
		
	}

	


	public Coffee(String _menu, String _size, int _price){
		
//		menu = _menu;
//		size = _size;
//		price = _price;
//		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("커피와 사이즈를 입력");
		String menu = sc.nextLine();
		String size = sc.nextLine();
		
	menu sc1= new menu("아메리카노",3900);
	menu sc2= new menu("카페모카",4500);
	menu sc3= new menu("카페라떼",5000);
	menu sc4= new menu("그린티라떼",5500);
		
		menu[] list = new menu[4];
		
		list[0] = sc1;
		list[1] = sc2;
		list[2] = sc3;
		list[3] = sc4;
		
		System.out.println(sc1.menu);   
		System.out.println(list[0].menu);
		
		//price()
		//매개변수로 커피의 가격과 사이즈의 가격 받는다. 
		// return 하지말고 println("총 가격:"+ ** + "원 입니다.")출력
		//
	   	
   
		
		//User_Coffee 클래스
		//정보
		//주문번호
		//지불금액
		//메뉴
		//사이즈
		
		//User_Coffee 클래스의 정보를 출력하는 함수를 만들어서 출력하기 
		
		
		
	} //

}
