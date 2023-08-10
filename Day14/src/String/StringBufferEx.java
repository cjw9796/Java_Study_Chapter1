package String;

public class StringBufferEx {
	//String, StringBuffer, StringBuilder
	//공통점: 문자열을 다룬다.
	//차이점: 사용 목적에 따라 쓰임새가 많이 다르다. 
	
	//StringBuffer, StringBuilder
	//문자열을 연산(추가하거나 변경)할 때 자주 쓴다. 
	
	void showstr() {
	String str = "";
	str += "이서희";
	str += ",";
	str += "jump to java";
	}
	
    
	static void showstrbu() {
		/*
		 * 버퍼(buffer)
		 * -임시 저장 공간(독립적인 공간)
		 * -문자열을 바로 추가할 수가 있고 공간 낭비도 없고 연산속도가 매우 빠르다. 
		 */
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append("world");
		sb.append("java");
		sb.append("fun?");
		
		String result = sb.toString();
		System.out.println(result);
		System.out.println(sb.hashCode());
		System.out.println(result.hashCode());
	}
	
	static void showstrbu2() {
		//mutable 변경 가능 
		
		String str = "abcdefg";
		//append()맨 마지막에 문자를 추가 
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb);
		//문자열 자르기 (추출) substring(시작,끝)
		
		//문자열 중간에 추가하기 
		sb.insert(2, "추가합니다");
		System.out.println(sb);
		//삭제
		sb.delete(2, 4);
		System.out.println(sb);
		//버퍼 용량
		System.out.println(sb.capacity());
		
		//뒤집기 reverse() 
		StringBuffer sb3 = new StringBuffer(30);
		
		//길이 확인 length()
		//문자열 치환 replace()
		
		String str3 = "aaa";
		//전부 대문자로 변경 (Upper),전부 소문자로 변경(lower)
		str3 = str3.toUpperCase();
		System.out.println(str3);
		str3 = str3.toLowerCase();
		System.out.println(str3);
		
		//String 클래스로 문자를 여러개를 연결+
		String a = new StringBuffer("hello").append("world")
				.append("java!").toString();
		System.out.println(a);
		
		
	}
	
	public static void main(String[] args) {
		//StringBuffer 객체 생성
				StringBufferEx.showstrbu2();
	}

}
