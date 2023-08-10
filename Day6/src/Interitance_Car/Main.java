package Interitance_Car;



public class Main {

	public static void main(String[] args) {
		
		아반떼 a1 = new 아반떼();
		
		System.out.println(a1.brandName);
		a1.색상 = "흰색";
		a1.최대속력 = 200;
		a1.차량명 = "아반떼";
		a1.등급 = "소형";
		
		그랜저 g1 = new 그랜저();
		System.out.println(g1.brandName);
		g1.색상 = "회색";
		g1.최대속력 = 260;
		g1.차량명 = "그랜저";
		g1.등급 ="대형";
		
		
		제네시스 g2 = new 제네시스();
		System.out.println(g2.brandName);
		g2.색상 = "검정";
		g2.최대속력 = 300;
		g2.차량명 = "제네시스";
		g2.등급 ="대형";
		
	
/*부모클래스에서 상속해준 변수 메서드 이미 자식클래스 안에 만들어져있다.
 * 자식은 부모클래스 안에 있는 내용을 언제든지 가져다가 쓸 수 있다. 
 * 
 */
		
		// 현대자동차
		// 브랜드명
		// 차명
		// 최대속력
		// 등급
		// 색상
		
		//공통기능 
		//주행한다
		//브레이크
		//후진한다
		
		// 아반떼 흰색 소형 현대자동차 200
		// 그랜저 회색 대형 현대자동차 260
		// 제네시스 블랙 대형 현대자동차 300 +안마기능  
		

	}

}
