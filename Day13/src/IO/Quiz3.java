package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InputStream input = null; 
		
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = null; 
		try {
			String lo = "D:\\io_test\\";
			String fileName = "student.txt";
			
			//1. 파일 생성 
			
			fw = new FileWriter(lo+fileName); 
			
			//2. 파일 내용 저장 
			
			fw.write(names); ???????????????????????????????????????
			String[] names = { "김철수","이만수","이영희" }; 
			int[] ages = { 20, 30, 40 };
			
			
		
			
			//3. 파일 닫기 
			fw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(fw);

	}

}
