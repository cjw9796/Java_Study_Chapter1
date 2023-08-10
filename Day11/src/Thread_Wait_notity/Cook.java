package Thread_Wait_notity;

public class Cook implements Runnable{

	private final Dish dish; // 객체 생성할 때 생성과 동시에 저장 
	// 기본생성자가 생기지 않는다! 
	// public Cook() {}  final 기본생성자가 작성하면 에러가 난다.
		
	// 매개변수 있는 생성자 
	public Cook(Dish dish){
		this.dish  = dish;
	}
	// 주방장의 고유 권한
	private void cook(int i) throws InterruptedException {
		
		synchronized (dish) {
			while(!dish.isEmpty()) {
						dish.wait();  // 음식을 먹을때까지 기다린다.
			}
			dish.setEmpty(false);
			System.out.println(i + "번째 음식이 준비 되었습니다.");
			dish.notify(); 
		}		
		
	}
		
	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			
			try {
				cook(i);
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}


