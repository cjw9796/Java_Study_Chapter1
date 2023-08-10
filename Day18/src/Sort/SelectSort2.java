package Sort;

import java.util.Arrays;
import java.util.Random;

//선택정렬2; 큰 값을 기준으로 반대로 정렬 
public class SelectSort2 {
	static int[] nums;
	static Random ran = new Random();
	
	public static void main(String[] args) {
		nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = ran.nextInt(20);

		}
		System.out.println("정렬 전");
		
		System.out.println(Arrays.toString(nums));
		
		for(int i = 0; i<nums.length; i++) {
			
			int maxIndex = i;
					
					for(int j= i+1; j<nums.length; j++) {
						if(nums[maxIndex] < nums[j]) {
							maxIndex = j;
						}
					}
			
			int temp = nums[maxIndex];
			nums[maxIndex] = nums[i];
			nums[i] = temp;
			
		}
		
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(nums));
	}

}
