package SuperMario;

public class Mario extends Character implements Runnable{

	public Mario(String name, String 공격명,int time) {
		super(name, 공격명,time); //super() 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출하기 위해서 사용
				
	}
	

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(this.time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			attack();
			System.out.println(this.공격명+"공격!");
			Coopa.hp -= 30;
		}
		
	}
}
