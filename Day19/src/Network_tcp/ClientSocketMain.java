package Network_tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketMain {

	public static void main(String[] args) {
		// 클라이언트 소켓 생성
		try {
			Socket clientsocket = new Socket("128.12.1.1", 9999);

			// 소켓으로 데이터를 전송할 입출력 스트림 생성
			// 1. 버퍼, 입출력
			BufferedReader in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));

			//2. 저장,내보내기 
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientsocket.getOutputStream()));
			out.write("hello\n");
			out.flush(); //스트림 속에 데이터 모두를 전송 
			
			clientsocket.close();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
