package Network_tcp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class ServerSocketMain {

	public static void main(String[] args) {
		// 클라이언트가 접속해서 정보를 가져갈 서버를 생성
		// ->tcp통신에서 소켓으로부터 연결 요청을 수락하는 서버 역할의 클래스

		// Binding : 수신 호스트에서 연결 요청이 들어온 경우 해당 데이터를 전달 할 연결 포트 지정
		ServerSocket serversocket1 = null;
		ServerSocket serversocket2 = null;

		try {
			serversocket1 = new ServerSocket();
			serversocket2 = new ServerSocket(20000);
		} catch (IOException e) {
		}

		// #2. ServerSocket 메서드
		// @bind
		System.out.println(serversocket1.isBound());// false
		System.out.println(serversocket2.isBound());// true
		try {
			serversocket1.bind(new InetSocketAddress("127.0.0.1", 10000));
		} catch (IOException e) {
		}

		/*
		 * 바인딩 -프로그램에서 사용된 구성 요소의 실제값을 저장하는 의미 
		 * -함수를 호출하는 부분에서 실제 함수가 위치한 메모리를 연결하는 것 
		 * -서버 소켓과 클라이언트 소켓이 연결이 되어서 실제 서버에 접근하거나 클라이언트에게 접근이 성공되었다.
		 * 
		 * isBound() -ServerSocket이 바인딩 되어 있는지 여부를 확인
		 * 
		 * 
		 */

		/*
		 * accept() -연결 요청을 수락 -서버 소켓 실행 -연결 수락까지 설정된 시간만큼 blocking 
		 * -하나의 서버에 두개의 클라이언트가 오게 되면 먼저 들어온 클라이언트 소켓 만들어서 통신할 동안 기다린다. 기다리는 포트 9999
		 */

		/*-시간 설정 
		 * -setSoTimeout(int timeout)
		 * getSoTimeout() 시간 설정 안하면 무한대기 0값이 온다.
		 */

		System.out.println(serversocket1.isBound());// true
		System.out.println(serversocket2.isBound());// true
		System.out.println();

		// tcp : 1:1 통신
		// 사용중인 tcp포트를 확인 : cmd -> netstat -a

		for (int i = 0; i < 65536; i++) {
			try {
				ServerSocket serverSocket = new ServerSocket(i);
			} catch (IOException e) {
				System.err.println(i + "번째 포트 사용중!");
			}
		}
		System.out.println();
		
		try {
			serversocket1.setSoTimeout(2000);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		try {
			Socket socket = serversocket1.accept(); //무한대기 
		} catch (IOException e) {
			try {
				System.out.println(serversocket1.getSoTimeout()+ "ms 시간이 지나 listening을 종료합니다.");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} 
		
		

	}

}
