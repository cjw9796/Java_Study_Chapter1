package IO;

import java.io.File;
import java.io.IOException;

public class FileEx01 {

	public static void main(String[] args) {
		/*
		 *  file 클래스
		 *  -파일 또는 디렉터리(폴더) 생성, 삭제 및 이름 변경, 디렉터리 내용 나열 등 
		 */
		
		File file = new File("test.txt");
		//만약 지정 위치에 파일이 존재하면 false
		//               파일이 없으면 true 
		
		try {
			boolean res = file.createNewFile();
			System.out.println(res);
			
			if(res) {
				System.out.println("파일 생성 완료");
			}else {
				System.out.println("파일 생성 안한다! 기존파일 있음");
			}
			
			if(file.exists()) {
				//파일의 존재 유무 
				System.out.println("파일의 이름:"+ file.getName());
				System.out.println("파일의 경로:"+ file.getAbsolutePath());
				System.out.println("파일의 쓰기가 가능?:"+ file.canWrite());
				System.out.println("파일의 읽기 가능?:"+ file.canRead());
				System.out.println("파일의 크기:"+ file.length());
			}else {
				System.out.println("파일이 없습니다.");
			}
			//file.mkdir();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//디렉터리 mkdir()
	//새 폴더를 생성 
	
	

}
