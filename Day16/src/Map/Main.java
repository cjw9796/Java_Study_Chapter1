package Map;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		/*
		 *  Map
		 *  -키(key) 값(value) 쌍으로 구성된 객체를 저장하는 자료구조 (연락처, 국어사전 등)
		 *  연락처, 국어사전 등  
		 *  기본 타입 -> 래퍼클래스 같이 사용해야 된다.
		 *  배열 공간의 번호가 자동으로 부여 0부터 
		 *  map공간의 이름을 내가 마음대로 작성할 수 있다. 
		 */
		
		/*
		 * 배열, 리스트 가장 큰 장점: 나란하게 메모리 공간이 선언 (인덱스 순서가 있는 자료형)
		 * Map은 인덱스 번호가 부여되지 않는다. , 반복문을 쓸 수가 없다. 
		 */
		
		//hashmap
		//-기준이 되는 key 중복 되면 안된다. 
		// value는 중복 가능하다 
		//저장되는 순서는 순서가 없다. 
		
		//treemap
		
		HashMap<String, Integer> map = new HashMap<>();
		//put() 저장 
		map.put("오십", 50);
		map.put("십ㅇ", 10);
		map.put("삼십", 30);
		map.put("사십", 40);
		map.put("십", 10); 
		
		HashMap<String, String> map2 = new HashMap<>();
		
		map2.put("이서희", "010-1234-1234");
		map2.put("김다다", "010-1234-1233");
		map2.put("하하", "010-1234-1232");
		map2.put("유재석", "010-1234-1231");
		
		
		System.out.println(map);
		System.out.println();
		System.out.println(map2);
		
		//부분적으로 출력, 원하는 값만 가져오기 
		//get(key) 출력하기
		
		System.out.println(map.get("오십"));
		System.out.println(map2.get("하하"));
		
		//map에서 key만 출력(keySet() set계열로 데이터를 뽑아온다.)
		System.out.println(map.keySet());
		
		for(String key : map.keySet()) {
			System.out.println(key+ " " + map.get(key));
		}
		
		
		//키 안에 삼십이 있니>
		String q = "삼십";
		boolean res = false;
		String r = "";
		
		for(String key : map.keySet()) {
			if(q.equals(key)) {
				r="있다.";
				res=true; break; 
				
				//System.out.println("찾는 key 있습니다.");
			}else {
				r="없다.";
				//System.out.println("찾는 key 없습니다.");
			}
		}
		if(res) {
			System.out.println("키있음");
		}else {
			System.out.println("key없음");
		}
		System.out.println(res);
		
		TreeMap<String, String> list2 = new TreeMap<>();
		list2.put("이서희", "010-1234-1234");
		list2.put("김다다", "010-1234-1233");
		list2.put("하하", "010-1234-1232");
		list2.put("유재석", "010-1234-1231");
		
		System.out.println(list2);
	}

}
