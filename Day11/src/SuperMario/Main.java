package SuperMario;

public class Main {

	public static void main(String[] args) {

		Mario mario = new Mario("마리오", "펀치", 1000);
		Marigee marigee = new Marigee("마리지", "폭탄", 500);
		Peach_Princess prin = new Peach_Princess("피치공주", "물건던지기", 1000);
		muchroom much = new muchroom("버섯돌이", "버섯던지기", 300);

		// Thread클래스 도움
		// 다른 상속을 받은 클래스들은 스레드한테 객체 생성시 인터페이스로 구현한 run() 들어있는 객체를 넘겨준다.
		Thread mariot = new Thread(mario); // 다형성
		Thread marigeet = new Thread(marigee); // marigee
		Thread print = new Thread(prin); // peach
		Thread mucht = new Thread(much); // mushroom

		// 데몬스레드 설정
		mariot.setDaemon(true);
		marigeet.setDaemon(true);
		print.setDaemon(true);
		mucht.setDaemon(true);

		// 멀티 실행(배열 Thread, char)
		mariot.start();
		marigeet.start();
		print.start();
		mucht.start();

		for (int i = 0; i < Coopa.hp; i += 30) {
			System.out.println("공격중");
			if (Coopa.hp == 0) {
				System.out.println("쿠파 다이");
				break;

			}

		}

		/*
		 * 마리오 클래스, 마리지 클래스, 피치공주, 버섯돌이 이름, 목숨, 기본레벨 10
		 * 
		 * 마리오는 목숨:300 펀치공격! (35씩 감소) 1초에 한번씩 마리지는 300폭탄공격 (30씩 감수) 0.5초에 한번씩 피치공주는
		 * 300물건 던지기 공격 (30씩 감소) 1초에 한번씩 버섯도리는 300버섯던지기 공격 (35씩 감소) 1.5초에 한번씩 순서는 그때마다
		 * 다르게
		 */

		/*
		 * 쿠파! 쿠파의 목숨은 인스턴스들이 접근을 할 수 있도록 공유 이름,목숨1000, 기본레벨 30 쿠파는 불기둥공격 공격시간 랜덤 30씩
		 */

	}

}
