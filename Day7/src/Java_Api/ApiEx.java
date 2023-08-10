package Java_Api;

import java.util.Random;

import A.Main;

public class ApiEx {

	public static void main(String[] args) {
		
		Main a1 = new Main(); //public설명 
		System.out.println(a1.a);
		a1.a=100;
		
		/*자바api
		 자바 API란
자바 API란 미리 만들어진 도구(클래스)이다.
자바 API는 패키지를 통해 제공된다.
패키지
패키지란, 소스코드를 담는 디렉터리이다.
패키지는 관련 코드를 묶거나, 같은 이름의 코드를 구분하기 위해 사용한다.
자바 API 사용 예
자바 API 문서 또는 구글링을 통해 API를 검색한다.
학습 시 많이 사용하는 API로 Math, Random, ArrayList 등이 있다..  
		 */
		
		/*
		 * 패키지
		 * -디렉터리(폴더)
		 * -중복적인 메서드,변수,클래스명을 분리
		 * 패키지 역할: 관련 코드들을 하나로 묶어서 관리를 수월하게 한다.
		 */
		
		//import 
		//-객체의 위치를 컴파일한테 알려준다. 
	    //math 클래스
		
		double r1 = Math.random();
		System.out.println(r1);
		
		double a1 = Math.abs(-9.81); //절댓값
		System.out.println(a1);
		
		//max,min
		double m = Math.max(3.14, 12.7);
		System.out.println(m);
		double m2 = Math.min(3.14, 12.7);
		System.out.println(m2);
		
		//랜덤
		Random r = new Random();
		
		int a = r.nextInt(); // -21억~+21억 사이 숫자
		double a2 = r.nextDouble(); //math.random()과 동일함 
		boolean a3 = r.nextBoolean(); 
		
		System.out.println(a);
		System.out.println(a2);
		System.out.println(a3);
		
		/*주사위를 100번 던질 것!
		 * 1~6사이에 숫자가 몇번씩 나왔는지 출력
		 * 배열
		 * 100번을 던지고 나면 
		 * 1개수 : 2
		 * 2개수 : 0
		 * 3개수 : 50
		 * 4개수 : 10
		 * 5개수 : 28
		 * 6개수 : 10
		 * 
		 */
		
		
	}

}
