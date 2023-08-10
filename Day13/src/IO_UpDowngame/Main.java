package IO_UpDowngame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void save(int score) {
		try {
			FileWriter fw = new FileWriter("score.txt", true);

			fw.write(score + "\n");

			fw.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score =100; 
		

		int com = ran.nextInt(100) + 1;


		// 100점에서 정답을 맞출 때까지 5점 차감 
		// scorelist.txt 파일을 만들어서  점수가 저장시키기
		// FileWriter("파일명",추가모드설정 true)


		while (true) {

			System.out.println("숫자 입력[1~100] : ");
			int me = scan.nextInt();

			if (com > me) {
				System.out.println("Up!");
				score -= 5;

			} else if (com < me) {
				System.out.println("Down!");
				score -= 5;

			} else if (com == me) {
				System.out.println("Bingo!");
				break;
			}
		}

		System.out.println("정답 = " + com);
		System.out.println("점수:"+ score);
		save(score);
		try {
			FileWriter fw = new FileWriter("scorelist.txt");

			// fw.write();

			fw.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try {

			FileReader fr = new FileReader("scorelist.txt");
			BufferedReader br = new BufferedReader(fr);

			String str = "";
			while ((str = br.readLine()) != null) {

				System.out.println(str);

			}
			fr.close();
			br.close();
		} catch (IOException e) {}
	

	}

}
