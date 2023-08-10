package Starcraft;

public class Main {

	public static void main(String[] args) {
		Tank t = new Tank(1);
		Marine m = new Marine(1);
		Dropship g = new Dropship(1);
		
		//전쟁을 하다 보니 체력이 많이 감소 
		t.hp = 10;
		g.hp = 100;
		m.hp = 5;
		
		Doctor d = new Doctor(100); //사람만 고친다. 
		
		d.heal(t); //
		d.heal(m);
		
		SCV s = new SCV(500); //기계만 고친다 
		
		s.repair(t); //탱크 기계
		s.repair(g); //수송선 기계
		
		
		

	}

}
