package Class;

import java.awt.Image;
import java.io.PrintStream;


/*
 * # 클래스
 * 1. 정의(설계도)
 * 	1) class	: 키워드
 * 	2) Ex01		: 클래스명
 * 	3) {}		: 자료형의 영역(기본 자료형을 조합해 생성)
 * 2. 선언
 * 	1) 자료형	 변수명  = new 자료형();	
 *  2) Ex01  e    = new Ex01(); 
 */

// 객체 
//- 클래스를 통해 만들어진 프로그램의 구성요소 

// 클래스 멤버 
// - 필드(정보/상태)
// - 메서드 (기능 / 동작) 

/*
 * 학생 클래스 만들기
 * 이름, 생년월일,주소,핸드폰번호,성별 
 * 본인 정보를 저장하고 출력 
 */

class 학생 {
	
	String 이름;
	String 생년월일;
	String 주소;
	String 핸드폰번호;
	String 성별;
		
}


// 주민등록증 자료형을 만들 것
// class 
class 주민등록증 { // 틀을 만들어 놓은것 new int[6] 
	
	String 이름;
	String 주민번호;
	String 주소;
	String 발급기관;
	int 발급일자; 
	Image 사진; 
	
}

class 카드{ 
	
	String 카드번호;
	String 카드명;
	String 소유자;
	int cvc;
	String 등급;
} 

class 주차관리{
	String 차량번호;
	String 입고시간;
	String 출고시간;
	int 요금;
	boolean 할인여부;
}



public class ClassEx01 {

	public static void main(String[] args) {
		// 사용자 정의 자료형
		// 기본자료형 int, float, double, char
		// 프로그래머가 프로그램에 맞게 다양한 기존 자료형으로 새로운 자료형을 만든다.
		// -타입이 다른 자료형을 묶는다. 
		
		// 배열은 동일한 자료형(데이터 타입)여러개를 선언
		// 클래스 다른 자료형으로 여러개를 선언 
		
	    // 객체 지향 프로그래밍 
		// -조립식 프로그래밍 
		// ex) 자전거(프로그램) = 몸체(객체) + 바퀴 + 핸들 
		
		// 조립식 프로그램에 좋은 점(장점)
		// -재활용성이 높다(재사용) 
		// -확장성이 좋음 
		// -관리도 쉽다. 
	

	}

}
