package SuperMario;

public class Peach_Princess extends Character implements Runnable{

	public Peach_Princess(String name, String 공격명,int time) {
		super(name, 공격명,time);
		
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
