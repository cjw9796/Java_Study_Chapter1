package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class Quiz2 {

	public static void main(String[] args) {
		//1.file 읽기 
		FileReader fr = null;
		BufferedReader br = null; 
		
		try {
			fr= new FileReader("D:\\io_test\\quiz01.txt");
			br = new BufferedReader(fr); //연결 
			
			int i =1;
			for(i=1; i<=100; i++) {
				String str = br.readLine(); //한 줄씩 읽어와라 
				System.out.println(str);
			}
			
			
			fr.close();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
