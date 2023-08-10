package SuperMario;

import java.util.Random;

//슈퍼마리오, 쿠파

class Character1{
	
	//마리오의 정보
	String name; //이름 
	int hp;      //목숨
	
	//기본생성자
	public Character1() {
		
	}
	
	//생성자
	public Character1(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

	
	//마리오의 기능(싸우는 기능)
	void attack(Character1 ch) { //공격한대상 말고 맞는 대상을 attack()
		System.out.println(name + "불주먹공격!");
		ch.hp -= 50;
		System.out.println(ch.name+" 목숨:" + ch.hp);
		System.out.println();

	}
	
}

public class Main {

	public static void main(String[] args) {
		// 마리오 객체 생성 
		
		Character1 mario = new Character1("마리오",150);
		Character1 coopa = new Character1("쿠파",300);
		Character1 luigi = new Character1("루이지",150);
		Character1 peach = new Character1("피치공주",150);
		
		// 우리는 한팀! 
		Character1[] team = new Character1[3];
		//마리오, 피치공주, 루이지 각각 저장 
		team[0] = mario;
		team[1] = luigi;
		team[2] = peach;
		
		//공격순서 마리오->루이지->피치공주 공격 
		team[0].attack(coopa); 
		team[1].attack(coopa); 
		team[2].attack(coopa); 
		
		//랜덤값을 이용해서
		
		Random r = new Random();
		
		// 쿠파가 주먹 공격을 한다.
		int idx = r.nextInt(3)+0;
		
		coopa.attack(team[idx]);

	
	}

}

/*
 * 변수
 * 레퍼런스 변수 (reference types)(참조) - 객체를 가리키는 변수, 특정 객체를 간접적으로 가리키는 변수  
 * 기본형(primitive types) : 특정 값을 직접 저장 
 * 
 */



//마리오가 쿠파 공격 
//mario.attack(coopa);
// 쿠파가 마리오 공격
//coopa.attack(mario);