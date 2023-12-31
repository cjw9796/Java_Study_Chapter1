package Network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketMain {

	public static void main(String[] args) {
		// 소켓 통신
		// 소켓 : tcp/ip 네트워크를 이용해서 통신을 쉽게 할 수 있도록 도와주는 기술

		// 두 프로그램 간의 양방향 통신 링크의 끝
		// 소켓끼리 데이터를 주고 받는다.
		// 소켓은 특정 ip포트 번화와 결합

		// 소켓 종류 : 서버 소캣과 클라이언트 소켓있다.

		// Socket TCP 통신에서 두 호스트 간 입출력 스트림 제공
		// (실제 통신 객체)하는 클래스
		// Socket() 객체 생성과 동시에 연결까지 요청!
		// 위에 처럼 소캣 클래스가 기본클래스 생성이라면 소캣만 생성
		// 연결은 안한다.

		// InputStream, OutputStream
		// 원격지와의 통신을 위한 입출력 스트림을 리턴하는
		// getInputStream, OutputStream 메서드 이용

		Socket socket1 = new Socket();
		Socket socket2 = null;
		Socket socket3 = null;
		Socket socket4 = null;
		Socket socket5 = null;

		try {
			socket2 = new Socket("www.naver.com", 80);
			
			//원격지 ip,port(문자열)에 연결하는 소켓을 생성 
			//송신지 주소와 포트정보도 같이 포함하여 연결 
			socket3 = new Socket("www.naver.com", 80, InetAddress.getLocalHost(),20000); //내 포트번호도 주는 방법  
			socket4 = new Socket(InetAddress.getByName("www.naver.com"),80);
			socket5 = new Socket("www.naver.com", 80);
			
			System.out.println(socket1.getInetAddress()+":"+socket1.getPort());
			
			
			//로컬 주소 정보 지정 안하는 경우, 지정하는경우 
			System.out.println();
			
			System.out.println(socket2.getLocalAddress()+":"+socket2.getLocalPort());
			System.out.println(socket3.getLocalAddress()+":"+socket3.getLocalPort());
			
			//send / receive 버퍼 사이즈 
			System.out.println(socket2.getSendBufferSize());
			System.out.println(socket3.getReceiveBufferSize());
			
			//
			
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		}

	}

}
