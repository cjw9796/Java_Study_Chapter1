package String;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class StringTokenMain {

	public static void main(String[] args) {
				// StringTokenizer 클래스
				//  문자열을 구분자를 기준으로 토큰(token) 이라는
				//  여러 개의 문자열로 잘라내는데 사용 
				//  구분자를 넘겨 주지 않을 경우 공백으로 설정 
				
				// 문자열을 공백 문자를 구분자로 자리기 
				//new StringTokenizer();
				
				// 문자열을 매개변수로 지정된 구분자로 자르기
				//new StringTokenizer(String sr,String delim);
				
				// 문자열을 매개변수로 지정된 구분자(delim)로 자르기
				// returnDelims 의 값을 true로하면 구분자도 토큰으로 간주 
				//new StringTokenizer(String sr,String delim,boolean returnDelims);
		
		try {
		String str1 = "Wellc%ome/ to/ the% Java* HelloWorld";
		
		StringTokenizer st = new StringTokenizer(str1,"%",true);
		System.out.println(st.countTokens());
		
		String str2 = "Wellc%ome/ to/ the% Java* HelloWorld";
		
		StringTokenizer st2 = new StringTokenizer(str2,"&",true);
		System.out.println(st2.countTokens());
		
		//nextToken()
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken()); 
		
		System.out.println(st2.nextToken("%"));
		
		}catch(NoSuchElementException e) {
			System.out.println("기호가 없다.");
		}
		
		
		//문자열 토큰이 남아있다면 true, 없으면 false
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken()); 
//		}
			
	
		
	}

}
