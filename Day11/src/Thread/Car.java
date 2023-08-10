package Thread;

public class Car extends Thread {
	String name;
	int time;

	Car(String name, int time) {
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
			System.out.println(name + "돌격합니다.!");
		}
	}

}
