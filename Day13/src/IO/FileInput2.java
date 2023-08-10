package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput2 {

	public static void main(String[] args) {
		String str = "Hello Java Programming";
		
		//바이트 출력 스트림 문자, 동영상, 이미지 1byte
		File file = new File("ex02.txt");
		
		try {
			File file1 = new File("gugudan.txt");
			
		if(!file.exists()) {
			file.createNewFile(); //새로운 파일은 있니?
		}
		
		FileInputStream fos = new FileInputStream(file);
		
		int i=0;   
		//read() 데이터가 읽을게 없다. -1 
		//null나오기 전까지 읽어오기
		while((i= fos.read()) != -1) {
			System.out.println((char)i);
		}   
		
//		for(int i = 1; i < 101; i++) {
//			String str = i+"번 출력했습니다.";
//			fos.write(str);
//		}
							
									
//		for(int i =2; i<10; i++) {
//			for(int j = 1; j<10; j++) {
//				for(int i = 1; i < 101; i++) {
//					
//					String str1 = i+"번 출력했습니다.";
//					fos.write(str);
//				}
//				//저장
//				fos.write(b);
//				
//			}
//		}
		//문자열로 저장
		
		
		
		fos.close();
		
		System.out.println("정상적!");
		}catch(IOException e) {
			System.out.println("파일에 대한 예외 발생");
		}
		
		//문자기반 2byte 
		
	}

}
