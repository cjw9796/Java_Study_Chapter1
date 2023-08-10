package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader { //파일 읽기 

	public static void main(String[] args) {
		// file 읽기
		FileReader fr = null; 
		BufferedReader br = null;
		
		try {
			fr = new FileReader("D:\\io_test\\ex01.txt");
			br = new BufferedReader(fr); //FileReader 랑 버퍼랑 연결
			//자식 클래스들이 구현해야 할 read 추상 메서드 
			//바이트 하나를 읽어서 int로 반환하되, 더 이상 읽을 값이 없으면 -1을 리턴
			String str = br.readLine(); //한 줄씩 읽어와라 
			System.out.println(str);
			
			str = br.readLine();
			System.out.println(str);
			str = br.readLine();
			System.out.println(str);
			
			fr.close();
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
