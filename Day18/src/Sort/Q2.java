package Sort; 
//0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.(백준27433)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.function.Function;

public class Q2 {
	public static int factorial(int n) {
		if (n <= 1) return 1;
		return n* factorial(n-1);
	}
	
	Scanner in = new Scanner(System.in);
	
	int n = in.nextInt();
	
	try {
		Function(5);
		int res = Function(5);
		System.out.println(res);
		
		int sum = factorial(n);
		System.out.println(sum);
		

		// 1 + N까지의 합을 구하기!
		// 피보나치수열 구하기 
		
		
	} catch (StackOverflowError e) {
		System.out.println("재귀함수 예외발생 조건작성하기");
	}
	
	public class Main {
		 
		public static void main(String[] args) throws IOException {
	 sort
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int N = Integer.parseInt(br.readLine());
			
			int sum = factorial(N);
			System.out.println(sum);
			
		}
		
		public static int factorial(int N) {
			if(N <= 1) return 1;	// 재귀 종료조건
			return N * factorial(N - 1);		
		}
	 
	}


	
}
}

	