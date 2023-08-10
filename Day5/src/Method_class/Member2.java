package Method_class;

import java.util.Scanner;

public class Member2 {

	class objection {
		String ob;
		int pay;

	}

	public static objection objectInput() {
		Scanner sc = new Scanner(System.in);
		// 춘천 5000
		System.out.println("목적지와 운임비를 입력");
		String ob = sc.nextLine();
		int pay = sc.nextInt();

		objection o = new objection();
		o.ob = ob; // 클래스 변수 안에 ob변수에 내가 입력받은 ob변수 저장
		o.pay = pay;

		return o;

	}

	public static void main(String[] args) {
		
		//함수를 실행하면 목적지 객체 생성되서 온다. 
		
		objection o1 = objectInput();
		System.out.println(o1);

		// 열차정보 출력하는 함수
		trainprint(o1);
		
		
		// objection 클래스(목적지 클래스)
		// String 목적지, int 운임비;

		// 대구 25000
		// 부산 40000

		// 새로운 변수를 각각 만들어서 trainPrint
		// 매개변수로는 objection 타입의 변수 저장
		// return void(없다)

		// ----- 예매 정보 -----
		// 목적지 : 대구 부산
		// 운임비 : 25000 40000

	}

}
