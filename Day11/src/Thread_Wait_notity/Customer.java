package Thread_Wait_notity;

public class Customer implements Runnable {

	Customer(Dish dish) {
		this.dish = dish;

	}

	private void eat(int i) {

		synchronized (dish) {
			while (dish.isempty()) {
				dish.wait();
			}
			dish.setEmpty(true);
			System.out.println(i + "번째 음식을 먹었습니다.");
			dish.notify();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			try {
				eat(i);
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub

	}

}
