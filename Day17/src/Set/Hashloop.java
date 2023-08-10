package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashloop {

	public static void main(String[] args) {
		// 여러개를 동시에 추가
		
		HashSet<String> hset1 = new HashSet<>();
		
		hset1.add("로봇");
		hset1.add("신발");
		hset1.add("농구공");
		
		System.out.println(hset1);
		
		HashSet<String> hset2 = new HashSet<>();
		hset2.add("야구공");
		hset2.add("나나나");
		hset2.addAll(hset1); //hset1 Hashset 전체 추가 
		
		System.out.println(hset2);
		
		//컬렉션 순서가 없는 데이터를 뽑아서 
		//반복시키는 반복자 
		//iterator() : 컬렉션에서 요소들을 읽어오는 방법 
		
		//hasNext(): 다음 데이터가 있으면 true 없으면 false 
		//next() : 데이터 반환 
		//remove() : next 읽어온 데이터를 삭제
		
		//반복자 사용하기 
		//인터페이스로 구현이 되어있다.
		//iterator() 메서드 안에서 반복자에 대한 객체를 생성해서 iter변수에 저장한다. 
		Iterator<String> iter = hset2.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//또는  
		for(String s : hset2) {
			System.out.println(s);
		}

	}

}
