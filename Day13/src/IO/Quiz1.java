package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		InputStream input = null; 
		
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = null; 
		try {
			String lo = "D:\\io_test\\";
			String fileName = "quiz01.txt";
			
			//1. 파일 생성 
			
			fw = new FileWriter(lo+fileName); 
			
			//2. 파일 내용 저장 
			int i = 1;
			for(i=1; i<=100; i++) {
				fw.write( i +"번줄 출력\n" );
			}
			
			//3. 파일 닫기 
			fw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(fw);
		

	}

}
