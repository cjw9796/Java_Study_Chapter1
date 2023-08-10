package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		
		// 2차원 배열 
		
		//int[][] arr new int[3][3];  // 앞: 행 뒤: 열
		
		/* 
		 * 아파트 5층 1호 2호 
		 * 
		 * 2차원 배열로 선언
		 */
		
		//int[][] a = new int [5][2];
		
		/*
		 * 
		 * 신체검사를 한다. 키를 저장(실수)
		 * 1학년 3반이 있다. 
		 * 각각의 반에 5명의 키를 저장하는 2차원 배열 
		 */
		
		//double[][] hei = new double[3][5];
		/*
		int[][] arr2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		
		//전체출력 
		// 2차원 배열에서 length -> (행을 기준으로 출력)
		System.out.println(arr2.length);
		
		//전체출력
		for(int i=0; i< arr2.length; i++) {
			
			for(int j=0; j < 3; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
		
		
		// for
		for(int[] num: arr2) { //행 전체 꺼내온다. {1,2,3}
			for(int num2 : num) { //열에 하나씩 꺼내온다.
				System.out.print(num2); 
			}
			System.out.println();
		    
		}
		
		//부분 출력(원하는 값만 하나 출력)
		// 배열명[행][열]
		// 배열명[행][열] = 값 
		
		System.out.println(arr2[1][1]);
		
		*/
Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("인덱스1 입력 : ");
		int idx1 = scan.nextInt();
		System.out.print("인덱스2 입력 : ");
		int idx2 = scan.nextInt();
		
		System.out.println(arr[idx1][idx2]);
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.print("값 입력 : ");
		int data = scan.nextInt();
		
		idx1 = 0;
		idx2 = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == data) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("인덱스1 : " + idx1);
		System.out.println("인덱스2 : " + idx2);
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int maxNum = arr[0][0];
		idx1 = 0;
		idx2 = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(maxNum < arr[i][j]) {
					maxNum = arr[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("인덱스1 : " + idx1);
		System.out.println("인덱스2 : " + idx2);
		
		// 문제 4) 값 2개를 입력받아 값 교체
		System.out.print("값1 입력 : ");
		int data1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int data2 = scan.nextInt();
		
		int idx1_i = 0, idx1_j = 0;
		int idx2_i = 0, idx2_j = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == data1) {
					idx1_i = i;
					idx1_j = j;
				}
				if(arr[i][j] == data2) {
					idx2_i = i;
					idx2_j = j;
				}
			}
		}
		
		int temp = arr[idx1_i][idx1_j];
		arr[idx1_i][idx1_j] = arr[idx2_i][idx2_j];
		arr[idx2_i][idx2_j] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int[]list = {1,26,17,4,20,44,3};
		
		//sort(배열명);
		
		Arrays.sort(list); //오름차순으로 정렬 
		
		//toString() : 배열을 출력할 수 있게 밑에 for문처럼 쓸 수 있게 
		// 안에 값들을 문자타입으로 정리 해 놨다. 
		String res = Arrays.toString(list);
		System.out.println(res);
		
		for(int n : list) {
			System.out.println(n);
		}
		
		//내림차순으로 정렬 reverseOrder()
		// 함수가 기본타입은 정렬하고 내림차순 하지 않는다.
		// 그래서 객체화 시키는 레퍼클래스를 이용한다. 
		//Arraylist 타입을 정할때 기본타입이 들어가지 않는다.
		Integer[]list2 = {1,26,17,4,20,44,3};
		Arrays.sort(list2,Collections.reverseOrder());
		
		
		
		
	} //end

}
