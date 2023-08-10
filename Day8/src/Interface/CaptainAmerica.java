package Interface;

public class CaptainAmerica implements Hero{

	private int hp = Hero.MAX_HP;
	
	@Override
	public void attack() {
		System.out.println("방패를 던진다");
	}

	@Override
	public void heal(int portion) {
		hp += portion;
		if(hp > Hero.MAX_HP) { //고정한 체력보다 많이 차면! 고정값으로 다시 저장
			hp = Hero.MAX_HP;
		}
		System.out.println("캡아가 체력을:"+portion+"만큼 회복");
		
	}

	void muster() {
		System.out.println("어벤져스 멤버들을 소집합니다.");
	}
	
}
