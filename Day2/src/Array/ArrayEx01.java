package Array;

import java.util.Random;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		// 배열: 동일한 타입의 변수를 여러개 묶었다.
		// 학생들의 점수를 저장하는 배열 25명 
		// 단점: 삭제x추가x 
		
		// 순서(인덱스) 0부터 
		/*
		int[] scorelist = new int[25];
		
		int[] a = {1,2,3};
		int[] b = null;
		*/
		// 배열의 길이 
		//System.out.println(scorelist.length);
		
		// 배열을 복사
		//b = a;
		
		/*
		// 1:1 하나씩 복사하기
		b[0] = a[0];
		b[1] = a[1];
		b[2] = a[2];
		*/
		
		//함수를 이용해서 복사 
		// 깊은복사, 얇은복사 
		
		//a.clone();
				
		
		//System.out.println(b[0]);
		//System.out.println(a[0]);
		/*
		// 값을 변경
		b[0] = 3;
		
		System.out.println("값 변경");
		
		System.out.println(b[0]);
		System.out.println(a[0]);
		*/
		
		/*
		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		
		int[] arr = {10,20,30,40,50};
		System.out.println(arr[3]);
		
		//각각 공간에 접근
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		*/
		
		/*
		// 문제2) 전체 합 출력
		// 정답2) 150
		
		int[]arr = {10,20,30,40,50};
		
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		
		System.out.println(sum);
		
		*/
		
		/*
		// 문제3) 4의 배수의 개수 출력
		// 정답3) 2개 
		
		int[]arr = {10,20,30,40,50};
		
		int index = 0;
		int count = 0;
		
		while(index < arr.length) { //조건
			if(arr[index] % 4 == 0) {
				count +=1; count++;
			}
			index++;
		}
		*/
		/*
		// 점심메뉴 정하는 프로그램 작성 
		Random r = new Random();
		
		String[] m = {"마라탕","쌀국수","돈까스","엽떡","해장국","매운갈비찜","김치찌개","냉면"};
		
		//메뉴 개수 
		int size = m.length;
		
		//랜덤값을 뽑는다.
		int ra = r.nextInt(size);
		
		System.out.println(m[ra]);
		
		*/
		
		
		//로또 프로그램을 작성
		// 1~45개 중 하나를 뽑는다. 
		int[] lotto = new int[6];
		Random r= new Random();
		
		// 중복 상관없음 하나씩 뽑아서 각각의 배열에 저장, 출력 
		
		int index = 0;
		while(index < lotto.length) {
			lotto[index] = r.nextInt(45+1);
			index += 1;
			
		}
		
		System.out.println(index);
		index = 0; //6까지 증가한 방번호 초기화 
		
	    while(index < lotto.length) {
	    	System.out.println(lotto[index++]);
	    	//System.out.println("while범위안");
	    }
				
		System.out.println(lotto[0]);
		//중복을 제거하는 명령문을 추가 
		//set 
		
		
		
		
		
		
		
		
		
		
		
	}

}
