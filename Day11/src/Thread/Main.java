package Thread;

/*
 * 데몬스레드
 * -main 스레드가 끝나면 나머지 스레드들도 모두 종료하게 만드는 
 * -setDaemon(값) true : main스레드가 종료하면 종료 
 *             	 false : main 상관없이 실행된다. 
 *            ex) 게임속 배경음악 
 *            
 */

class Music extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("음악이 연주중");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		//뮤직클래스 생성
		Music m = new Music();
		
		m.setDaemon(true); //데몬스레드 설정은 무조건 start() 전! 
		m.start();
		
		for(int i = 0; i<10; i++) {
			System.out.println("신나게 게임중!");
			
			
			if(i==9) {
				System.out.println("앗");
				System.out.println("겜종료");
				break;
			
			}
		
		}
			
	}

}
