package Method;

import java.util.ArrayList;

//public static void arrival() {
//	
//}


public class Reservation {

	public static void main(String[] args) {
		
		ArrayList<String> arrival = new ArrayList<>();
		arrival.add("춘천");
		arrival.add("수원");
		arrival.add("대전");
		arrival.add("광주");
		arrival.add("부산");
		arrival.add("대구");
		
		System.out.println(arrival);

		ArrayList<Integer> pay = new ArrayList<>();
		pay.add(5000);
		pay.add(3000);
		pay.add(25000);
		pay.add(35000);
		pay.add(40000);
		pay.add(35000);
		
		System.out.println(arrival.get(1));
		System.out.println(pay.get(1));
		
		System.out.println(arrival.get(1)+ "의 운임비는" +pay.get(1)+"원입니다.");
		
		
		/*
		 * 열차예매
		 * 1. 목적지를 매개변수로 받으면 운임비를 main에 있는 pay변수에 저장
		 * 
		 * 목적지   운임비
		 * 춘천     5000
		 * 수원     3000
		 * 대전     25000
		 * 광주     35000
		 * 부산     40000
		 * 대구     35000
		 * 
		 * 목적지를 입력하세요 : 수원
		 * 수원의 운임비는 3000원입니다. 
		 * 
		 * 
		 * 2. 함수명 train
		 * 매개변수 : 열차의 종류 
		 * 
		 * 종류 
		 * ktx 10000원 추가
		 * srt 5000
		 * 새마을호 1000
		 * 무궁화호 2000 
		 * 
		 * 열차운임비를 받아서 main pay에 저장 
		 * 열차의 종류를 입력 : ex srt 
		 * 수원까지 가는 총 운인비는 8000원 입니다. 
		 * 
		 * 
		 */
		

	}

}
