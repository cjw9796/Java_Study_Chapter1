package Array;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		// 공간을 자동으로 추가 삭제하고 조회 
		// 배열을 쓰는데 편하게 여러개의 데이터를 저장하고 싶다 -> ArrayList
		//ArrayList<자료형>
		
		//정수를 저장하는 배열
		ArrayList<Integer> list1 = new ArrayList<>();
		
		
		// 추가 add()
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		//출력
		System.out.println(list1);
		
		//길이
		System.out.println("길이:"+ list1.size());
		
		//ArrayList 조회 indexOf(찾는값을 넣기!)
		int find = list1.indexOf(20);
		list1.indexOf(20);
		System.out.println(list1.indexOf(20));
		
		
		
		//삭제 remove()
		list1.remove(find);
		System.out.println(list1);
	    
		//실수를 저장하는 배열
		ArrayList<Double> list2 = new ArrayList<>();
		list2.add(1.254);
		list2.add(101.2456);
		list2.add(2.254);
		list2.add(200.2);
		
		
		System.out.println(list2);
		
		// 200.2 찾아서 삭제 
		int find2 = list2.indexOf(200.2); //indexOf()
		System.out.println(list2.indexOf(200.2));
		list2.remove(find2);  //remove
		System.out.println(list2);
		
		// 문자열 저장하는 배열
		ArrayList<String> list3 = new ArrayList<>();
		
		// add() 김연아 강동원 진 
		list3.add("김연아");
		list3.add("강동원");
		list3.add("진");
		
		System.out.println(list3);
		
		// 진 삭제
		int find3 = list3.indexOf("진");
		
		list3.remove(find3);
		System.out.println(list3);
		

		//안에 있는 내용을 전부다 삭제 
		
		list3.clear();
		list2.clear();
		list1.clear();
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		// 
		
		
		
	}

}
