package Abstract;

import Starcraft.Starcraft;

public class Main {

	public static void main(String[] args) {
		
		Starcraft st = new Starcraft();
		
		st.show();
		
		Shape ab = new Shape();
		
		ab.show();
	

	}

}

/*
 *  추상화
 *  -부모클래스에서 상속받은 자식클래스에 
 *  특정 메서드를 강제적으로 만들도록 하는 것! 
 *  
 *  -몸체가 구현되지 않는 메서드 
 *  
 *  리턴값, 함수명(매개변수타입); -> 선언부 
 *  {} ->구현부 가 없음 
 *  
 */

