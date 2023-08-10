package Java_Api;

import java.util.Random;

public class ApiRandomQuiz {

	public static void main(String[] args) {

		Random r = new Random();

		int[] d = new int[6];

		System.out.println(d[0]);

		for (int i = 0; i <= 100; i++) {
			int index = r.nextInt(6) + 1;
			d[index - 1]++;

		}
		for(int i=0; i<d.length; i++) {
			System.out.println((i+1)+ "번 개수:"+d[i]);
		}


}

}
