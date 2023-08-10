package Vector;

import java.util.Arrays;
import java.util.Random;

public class StringEx {

	public static void main(String[] args) {

		String[] arr = { "IMF", "제주도", "자바도시", "한글나라", "컴퓨터", "java", "python", "초롱초롱", "군고구마", "바람", "스크립터", "모카" };

		// 배열을 정렬

		Arrays.sort(arr);
		// --------------------------------------------------

		// toString()
		System.out.println(Arrays.toString(arr));

		// --------------------------------------------------
		// 기준이되는변수값.compareTo(비교할 값)

		// 숫자 일 때(기본자료형x Integer)

		/*
		 * 비교했을 때 같으면 0 다르면 기준이 되는 값 > 비교하는 값 1(양수) 기준이 되는 값 < 비교하는 값 -1(음수)
		 * 
		 */

		// 문자일 때
		// 비교했을 때 같으면 0
		// 비교했을 때 다르면 -> 비교하는 값이 작으면 음수 (-1)
		// 비교했을 때 다르면 -> 비교하는 값이 크면 양수 (1)
		// 다르면 문자의 개수만큼 리턴

		String str1 = "a";
		String str2 = "b";
		String str3 = "a";

		int res1 = str1.compareTo(str2);
		System.out.println(res1); // 결과:-1, 비교했을 때 다르면 -> 비교하는 값이 작으면 음수 (-1)

		int res2 = str2.compareTo(str1);
		System.out.println(res2); // 결과:1, 비교했을 때 다르면 -> 비교하는 값이 크면 양수 (1)

		int res3 = str1.compareTo(str3);
		System.out.println(res3); // 결과:0, 비교했을 때 같으면 0

		// "hello"
		String str = "hello";
		System.out.println(str);
		// 문자 한개 추출 chatAt(방번호)
		char ch = str.charAt(0);
		System.out.println(ch);

		ch = str.charAt(2);
		System.out.println(ch);

		ch = str.charAt(4);
		System.out.println(ch);

		str = "python java html jsp spring";

		// 문자 여러개를 추출(슬라이싱)
		// substring(시작번호,끝번호)

		String res = str.substring(7, 11);
		System.out.println(res);

		str = "python,java,html,jsp,spring";

		// 구분자를 이용해서 잘라내기
		// split('구분자')
		// 구분자를 이용해서 배열형태로 저장이 되서 온다.

		String[] arr2 = str.split(",");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

		String[] arr3 = str.split(" ");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		//길이확인 length()
		System.out.println(str.length());
		
		//문제풀이 
		
		String jumin = "890101-2012932";
		// 문제1  성별출력
		// 출력: 여성 
		//
		
		char ch2 = jumin.charAt(7);
		if(ch == 1) { 
			System.out.println("남자입니다.");
		}
		else {
			System.out.println("여자입니다.");
		}
		 
		// 문제1 두번째풀이
		// jumin.equals(비교할값)
		
		
		
		// 이메일을 입력 받는다. 
		// empress8069@gmail.com
		// 9글자 이상 "가입이 가능하다."
		// 9글자 미만 "가입이 불가능하다."
		// 구분자를 이용해서 아이디와 도메인 주소를 분리 
		// .com .net 으로 끝나니? -> "정상적으로 가입이 가능하다" 
		// 아니면 "정상적으로 가입할 수 없습니다."
		
		
		
		

	}

}
