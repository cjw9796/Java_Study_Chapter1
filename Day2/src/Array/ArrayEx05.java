package Array;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		/*
		 * // 문자열과 문자열 비교는 equals() // 두개의 문자 같으면 true 출력 // 두개의 문자 다르면 false 출력
		 * 
		 * String name = "이서희"; String name2 = "이지희";
		 * 
		 * // 비교 name == name2 ? 정답: false System.out.println(name.equals(name2));
		 * 
		 * 
		 * String name3 = "이서희"; // 비교 name == name3 ? 정답: true
		 * System.out.println(name.equals(name3));
		 * 
		 * 
		 * // name을 변경 -> "강동원" 출력 String name4 = "강동원";
		 * System.out.println(name.replace(name, name4));
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		// 숫자(정수)
		int[] arr = { 10, 20, 0, 0, 0 };
		int count = 2; // 현재 2개
		int totalsize = arr.length; // 총 5개

		while (true) {
			System.out.println("현재 남은 공간: " + (totalsize - count));
			System.out.println("1.추가 2.삭제 0.종료");
			int sel = sc.nextInt();

			if (sel == 1) {
				// 추가
				// 1. 공간이 남아있니? 공간이 있습니다. -> 추가를 하면 된다.
				// 정수를 하나 입력 받는다.
				// 데이터의 개수가 증가
				// 2. 공간이 없다. -> break;
				
				//count > 5 
				if(count > 5) {
					System.out.println("공간이 다 찼다!");
					break;
				}
				//공간이 남아있다
				int num = sc.nextInt();
				
				//배열의 인덱스
				arr[count++] = num;
				
				
				
				
				if((totalsize - count)>0) {
					System.out.println("저장");
				}
				else {
					System.out.println("다 찼다");
				}
				
				
				
			} else if (sel == 2) {
				// 삭제
				// 1.삭제할 값을 입력 
				// 2. 찾는다 삭제할 인덱스
				// 3. 새로운 배열을 생성 5개 
				
				finddelindex = -1; 
				
				
				int[] temp = arr; //기존 배열
				
				int[] arr = new int[5]; //새로운 배열
				
				int index = 0; //처음 방부터 순서대로 접근할 때 
				int j =0; //새로 복사하는 배열의 인덱스를 부여 
				
				while(index < count -1) {
					
					if(count == 0) {break;}
					
					if(index == finddelindex) {
						arr[j] = temp[index];
						j = j+1;
					}
					index +=1; 
					
				}
				temp[count -1] = 0;
				
			} else if (sel == 0) {
				break;
			} else { // 예외적인 메시지!
				System.out.println("0~2번 사이만 입력하세요!");
			}
		}

		
		
		
		
		
	}

}
