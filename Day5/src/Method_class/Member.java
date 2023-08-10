package Method_class;

import java.util.Random;
import java.util.Scanner;

class Objection{
	String ob;
	int pay;
	
	public Objection(String _ob, int _pay) {
		
		ob = _ob;
		pay = _pay;
	}	
}

public class Member {

	public static void trainPrint(Objection o) {
		System.out.println("----예매 정보----");
		System.out.println("목적지 : " + o.ob);
		System.out.println("운임비 : " + o.pay);
	}

	
	public static void main(String[] args) {
	 
		// 수원
		// 광주
		// 대전
	
		Objection h1 = new Objection("수원", 3000);		
		Objection h2 = new Objection("광주", 35000);
		Objection h3 = new Objection("대전", 25000);
		
		// 배열 
		//  나란하게 선언 (접근이 쉽다. 인덱스번호로 접근)
		
		// 내가 만든 클래스로 여러개를 저장 
		// 배열은 클래스명[개수] 기본타입[개수] 만큼 변수를 묶었다.(똑같은 자료형)
		Objection[] list = new Objection[3];
		
		// h1변수의 주소값을 list 배열의 0번 방에 저장 
		list[0] = h1;
		list[1] = h2;
		list[2] = h3;
		
		// h1으로 접근을 했을 때 수원
		// list[0] 접근을 했을 때 수원
		
		System.out.println(h1.ob);   
		System.out.println(list[0].ob);
		System.out.println(h2.ob);   
		System.out.println(list[1].ob);
		System.out.println(h3.ob);   
		System.out.println(list[2].ob);
		
		// h2 -> list[1] 저장 해서 ob출력 
		
		// h3 -> list[2] 
		
		
	}
} // 클래스 끝

