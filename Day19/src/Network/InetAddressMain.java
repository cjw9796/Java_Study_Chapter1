package Network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressMain {

	public static void main(String[] args) {
		/*포트: 호스트 내에서 실행되고 있는 프로세스를 구분하기 위한 16비트의 논리적 할당
		 * -호스트의 IP가 집주소에 해당하는 개념이라면 Port는 방번호에 해당 
		 * -포트(port)란 컴퓨터끼리 정보를 교환하기 위해 사용하는 가상의 논리적 접속 위치이다.
		 * 
		 * 네트워크의 기본 개념 
		 * -통신 일 대 일, 일대 다, 일대 다 특정 그룹
		 * 
		 * 
		 * 유니캐스트
		 * -두 장치간 1:1로 통신한다. 
		 * -(카카오톡 1:1 대화)
		 * -특정 대상이랑만 통신, 같은 네트워크 대역에서 사용을 할 수 있다.  
		 * 
		 * 브로드캐스트
		 * -네트워크에 있는 모든 대상과 통신하는 것 
		 * -하나의 송신자가 같은 서브 네트워크상의 모든 수신자에게 전송
		 * -(유튜브)
		 * 
		 * 멀티캐스트
		 * -여러명이 같은 네트워크에 있지만 특정 지정한 몇명과 통신하는 것 
		 * -인터넷에서 같은 내용의 데이터를 여러 명의 특정한 그룹의 수신지로 동시에 전송
		 * 
		 * 
		 * 네트워크의 분류
		 * LAN(Local Area Network)
		 * -근거리 통신망
		 * -가까운 지역을 하나로 묶는 데트워크
		 * -(같은 PC방 통신, 같은 강의장 등)
		 * 
		 * WAN(Wide Area Network)
		 * -광대역 통신망 
		 * -멀리 있는 지역을 한데 묶은 네트워크 
		 * -Lan과 Lan을 묶인 것을 하나로 묶는 것 
		 * 
		 * 네트워크에 따른 연결 형태 
		 * -
		 * 
		 * 노드: 인터넷에 연결된 시스템의 가장 기본적인 용어 데이터를 구별하는 것 
		 * -중앙 장비에게 만든 노드 
		 * 
		 * 네트워크 토폴로지 
		 * 버스형(Bus),트리명(Tree),링형(Ring),성형(Star),메시형(Mesh)
		 * 
		 * 성형(Star)
		 * - 중앙에 위치한 허브가 모든 노드를 연결
		 * 장점:중앙 집중적 구조이므로 유지, 보수, 확장이 용이
		 * 단점:중앙 허브에 장애가 발생하면 네트워크 전체가 다운됨
		 * 
		 * 메시형(Mesh)
		 * -여러 노드들이 서로 그물처럼 연결된 것 
		 * -star형의 단점을 없애준다. 
		 * 
		 * ip주소(호스트) 저장 및 관리를 하는 클래스 
		 * 
		 * 
		 */
		
		/*ip주소(호스트) 저장 및 관리를 하는 클래스 
		 * InetAddress 클래스
			- 자바에서 IP 주소를 표현할때 사용하는 클래스이다. 
			
			- InetAddress의 주요 메서드
  		
  			
  			->getByName("도메인")
  			-Host 이름과 해당 ip주소를 저장(객체로 리턴)
  			-인터넷 통신하려면 ip꼭 필요하다. 
  			-도메인을 변경하는 것 -> DNS 서버 대표적으로 KT 
  			
  			->getByAddress(byte[])
  			-입력한 주소 저장 객체 리턴(128이상 일 경우 byte형변환)
  			
  			->getByAddress(String,byte[])
  			-입력한 문자열과(호스트) , ip주소를 저장 객체 리턴 
  			
  			
  			
		 */
		
		try {
			InetAddress ia1 = InetAddress.getByName("www.google.com");
			InetAddress ia6 = InetAddress.getByName("www.naver.com");
			InetAddress ia2 = InetAddress.getByAddress(new byte[] {(byte)172,(byte)217,(byte)161,(byte)132});
			InetAddress ia3 = InetAddress.getByAddress("www.google.com",new byte[] {(byte)172,(byte)217,(byte)161,(byte)132});
			
			System.out.println(ia1);
			System.out.println(ia2);
			System.out.println(ia3);
			
			//로컬/ 루프백 IP
			//-자기 자신을 나타내는 가상적인 주소 
			//-LocalHost / 127.0.0.1 
			InetAddress ia4 = InetAddress.getLocalHost();
			InetAddress ia5 = InetAddress.getLoopbackAddress();
			
			System.out.println(ia4);
			System.out.println(ia5);
			//InetAddress ip만 관리 
			//접속하고 싶은 사이트 ip확인하기 
			
			//하나의 호스트가 여러개 ip를 가지고 있을 경우 
			//getAllByName() 여러개의 ip를 사용하는 경우 모든 호스트 ip 리턴한다. 
			InetAddress[] ia6 = InetAddress.getAllByName("www.naver.com");
			System.out.println(Arrays.toString(ia6));
			
			
			//호스트와 ip알아내기
			byte[] address = ia1.getAddress();
			System.out.println(Arrays.toString(address));
			
			System.out.println(ia1.getHostName());
			System.out.println(ia1.getLoopbackAddress()); 
			
			//멀티캐스트 영역 , cmd에서 ping 네트워크 접속확인 
			System.out.println(ia1.isMulticastAddress());
			System.out.println(ia1.isReachable(1000));
			
		} catch (UnknownHostException e) {
			System.out.println("없는 주소 입니다.");
			
		}catch(IOException e) {}
		
		
		
		

	}

}
