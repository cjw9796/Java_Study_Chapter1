package Sort;


public class SortEx {

	public static void main(String[] args) {
		// 정렬
		// 버블정렬
		//  - 배열을 순차탐색해서 i, i +1 값을 비교해서 
		//    큰 것을 뒤로 이동 
//		
//		// 값 교체 
//		int a = 10;
//		int b = 20;
//		int temp = 0;   //임시 저장공간 
//		
//		temp = a;
//		a = b;
//		b = a;
		
		// 배열 선언
		int[] arr = {3,6,1,5,2};
		
		
		for(int i = 0; i < arr.length; i++) {
			
			// 내부 for문 비교해서 큰 값을 뒤로 교체 
			for(int j = 0; j < arr.length -i -1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp1 = arr[j + 1];
					arr[j+1] = arr[j];
					arr[j] = temp1;					
				}				
			}			
		}
		
		// 순서가 있는 자료형 
		// 방번호 즉 인덱스번호가 있는 자료형 
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);			
		}
		
		// 순서가 없는 자료형 (여러개를 저장하는 자료형)
		// 인덱스 번호가 없다!
		/*
		 * for(자료형 변수: 여러개를 저장하는 자료형변수명) {
		 * 
		 * }
		 * 조건 줄 필요가 없다.
		 * 사이즈를 알아서 계산을 해서 반복 한다. 
		 * 개수만큼 반복 
		 * 
		 */
		
		String[] list = {"python","java","html"};
		
		for(String str :list) {
			System.out.println(str);
		}
						
		for(int value : arr) {
			System.out.println(value);
		}
		
		// *
		// **
		// ***
		// ****
		// *****
		
//		*         *
//		**       ** 
//		***     ***
//		****   ****
//		***** *****
//		***********
		
/*       1
 *      111
 *     11111
 *    1111111
 *     11111
 *      111
 *       1
 */

//		123A
//		45BC
//		6DEF
		
				
		// 중복 for문 이용!
		for(int i = 1; i <=5; i++) {  //
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}			
			System.out.println();
		}	
		
	}
}
