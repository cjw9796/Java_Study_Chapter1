package Array;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };// 1006
		int[] scores = { 87, 11, 45, 98, 23 };

		// hashset -> put()
		// 검색 이진탐색 (정렬해야된다.)
		// 순차탐색

		Scanner sc = new Scanner(System.in);

		System.out.println("학번: ");
		int hakbun = sc.nextInt();

		int index = 0;
		int findIdx = -1; // 찾은 배열에 접근할 때 공간에 번호로 사용

		while (index < hakbuns.length) {

			if (hakbun == hakbuns[index]) {

				findIdx = index;
				// 점수
				//System.out.println(scores[index]);
				break;
			}
			// 위에 반복하는 내용을 실행했으면 다음 공간으로 넘어 갈 수 있도록
			index += 1; // index++ 			
		}
		// findIdx 번호가 -1 찾는 학번이 없다. 
		// findIdx 번호 0~5번 사이로 값이 저장 
		if (findIdx != -1) {
			System.out.println(scores[findIdx]);
		}else {
			System.out.println("찾는 학번이 없습니다.");
		
		}
		

		//System.out.println(hakbuns[findIdx]);

	}
}
		
		
		
		
		
		
		
		
		