package Inheritance;


	
	class 히어로 {
		String name;
		int age;
		int hei;
		double wei;
		String blood;
		
		void 먹다() {
			System.out.println("먹는다.");
		}
		void 논다() {
			System.out.println("논다.");
		}
		void 잔다() {
			System.out.println("잔다.");
		}
	}
	
	class 캡틴 extends 히어로{
		void 방패공격() {
			System.out.println("방패공격");
		}
	}
	class 아이언맨 extends 히어로{
		void 한손공격() {
			System.out.println("한손공격");
	}}
	class 헐크 extends 히어로{
		void 초록공격() {
			System.out.println("초록공격");
	}}
	class 위도우 extends 히어로{
		void 암살공격() {
			System.out.println("암살공격");
	}}
	
	public class InheritanceEx02 {
	public static void main(String[] args) {
		
		
		캡틴 캡틴틴 = new 캡틴();
		아이언맨 아아이언맨 = new 아이언맨();
		헐크 헐헐크 = new 헐크();
		위도우 위위도우 = new 위도우();
		
		System.out.println();
		
		// //히어로 클래스 상속
		// 캡틴=방패공격()
		// 아이언맨 = 한손공격()
		// 헐크 = 초록공격()
		//위도우 = 암살()
		
		
		//Person 클래스
		//이름,나이,키,몸무게,혈액형
		// 먹다.놀다.잔다.  

	}

	}
	
