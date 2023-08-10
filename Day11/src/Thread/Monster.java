package Thread;

//몬스터의 이름, 몇 초마다 한번씩 출몰한다 .
//오크 2초마다 한번씩 출몰한다 , 오크전사 5초마다 한번씩 출몰한다. 

public class Monster extends Thread {

	String name;
	int time;
	
	Monster(String name, int time) {
		this.name = name;
		this.time = time;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			// 프로그램을 지연시키는 함수 ms단위 1000 = 1초 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + time +"초 마다 한번씩 출몰합니다.");
		}
	
	}
	
}
