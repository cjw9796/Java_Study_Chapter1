package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyBuffer {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		//문자 기반 파일 클래스 
		try {
					FileReader fr = new FileReader("ex01.txt"); 
					FileWriter fw = new FileWriter("ex01.txt");
					BufferedReader bin = new BufferedReader(fr);
					
					BufferedWriter bout = new BufferedWriter(fw);

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("실행 시간:"+ (end - start)/100);
	}

}
