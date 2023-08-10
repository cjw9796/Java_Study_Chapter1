package Starcraft;

//빈 인터페이스 
//marker interface 
//상속관계가 아닌 클래스들을 그룹화 시켜줄 수있다.
interface Repairable{} //기계들만 표시 
interface Medical{} //사람만 표시 




public class Starcraft {}

class 테란 extends Starcraft{}
class 저그 extends Starcraft{}
class 프로토스 extends Starcraft{}

abstract class Unit{
	// 공격성을 가진 아이들을 모두 유닛!
	final int maxhp;
	public int hp;
	int x,y;
	
	Unit(int maxhp){
		this.maxhp = maxhp;
		this.hp = maxhp;		
	}	
	
	abstract void attack();	 // 공격
	abstract void move();   // 이동
}
class Dropship extends Unit implements Repairable{

	Dropship(int maxhp) {super(maxhp);}

	@Override
	void attack() {}

	@Override
	void move() {} // 군인,기계 옮겨주고 싸움
	
}
class Tank extends Unit implements Repairable{

	Tank(int maxhp) {super(maxhp);}
	@Override
	void attack() {}
	@Override
	void move() {} 
}

class Marine extends Unit implements Medical{ 	
	
	Marine(int maxhp) { super(maxhp);}
	
	@Override
	void attack(){}

	@Override
	void move() {}	
}

class Doctor extends Unit implements Medical{ //사람만 고치는 유닛 
	Doctor(int maxhp) {
		super(maxhp);
		// TODO Auto-generated constructor stub
	}

	void heal(Unit u) {
		
		boolean res = u instanceof Medical;
		System.out.println(res);
		
		if(!res) { //기계가 들어왔다. 
			System.out.println("나는 사람만 고친다");
			return;
		}
		
		System.out.println("사람만 고친다.");
	}

	@Override
	void attack() {}

	@Override
	void move() {}
	
}

class SCV extends Unit implements Repairable{ //기계만 고치는 유닛

	SCV(int maxhp) {
		super(maxhp);
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack() {}

	@Override
	void move() {}
	
	//기계만 고쳐야된다.
	//자식클래스가 탱크 안에는 유닛과 repairable 들어있다.
	//자식입장에서는 타입을 변환 
	void repair(Repairable r) {
		Unit u = (Unit)r;
		while(u.hp <= u.maxhp) {
			System.out.println(u.hp++);
//			try {Thread.sleep(1000);} 
//			catch (InterruptedException e) {}                     
			//프로그램을 지연시키는 함수 
	 // sleep(ms) 1초:1000 0.5초:500
		}
		System.out.println("수리 완료!");
	}
}






/*
 * 추상클래스 설명 
 * 
 * public class Starcraft {

	//3개의 그룹
	//테란, 저그, 프로토스 
	
	//탱크 수송선 군인
	public Tank t = new Tank(1000);
	public Marine m = new Marine(1000);
	public Dropship g = new Dropship(2000);
	
	public void show() {
		System.out.println("탱크:"+ t.hp);
		System.out.println("군인:"+ m.hp);
		System.out.println("수송선:"+ g.hp);
	}
}


class 테란 extends Starcraft{}
class 저그 extends Starcraft{}
class 프로토스 extends Starcraft{}

abstract class Unit{
	//공격성을 가진 아이들을 모두 유닛!
	final int maxhp;
	public int hp; 
	int x,y;
	
	Unit(int maxhp){
		this.maxhp = maxhp;
		this.hp = maxhp;
	}
	
	abstract void attack();
	abstract void move();
	
}


class Dropship extends Unit{

	Dropship(int maxhp) {
		super(maxhp);
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}
	
}

class Tank extends Unit{

	Tank(int maxhp) {
		super(maxhp);
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}
	
}

class Marine extends Unit{

	Marine(int maxhp) {
		super(maxhp);
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}

}
*/