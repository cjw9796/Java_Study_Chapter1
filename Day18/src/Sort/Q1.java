package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int[] a = new int[n];
	      for(int i=0;i<5;i++){
	        a[i] = sc.nextInt();
	      }
	      Arrays.sort(a);
	      for(int i=0;i<a.length;i++){
	        System.out.println(a[i]);
	      }
	    }
}
