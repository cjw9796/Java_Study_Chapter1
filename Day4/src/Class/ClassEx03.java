package Class;

class pokemon{
	//포켓몬 정보
	String name; //이름
	double weight; // 몸무게 
	String charact; // 특징 
	
	//생성자 특징
	// 1. 리턴 타입이 없는 메서드 
	// 2. 이름이 클래스명과 같다. 
	
	//기본생성자 
	pokemon(){
		
	}
	
	//생성자(전설의 포켓몬)
	pokemon(String _name){
		name = _name;
		
	}
	
	//생성자
	pokemon(String _name, double _weight, String _charact){
		name = _name;
		weight = _weight;
		charact = _charact;
		}
	
	// 싸우는 기능
	void attack() {
		System.out.println( name + "의펀치!");
	}
	
}


public class ClassEx03 {

	public static void main(String[] args) {
		
		//푸린
		pokemon p1 = new pokemon(); //객체를 생성해서 p1에 연결 ->{name:null, weight:0.0, charact: null로 초기화}
		p1.charact = "헤롱헤롱"; // p1 -> charact:"헤롱헤롱"으로 채워짐
		p1.name = "푸린"; // p1 -> name:"푸린"으로 채워짐
		p1.weight = 5.5; // p1 -> weight:"5.5"으로 채워짐
		
		p1.attack();   // p1이 연결되어 있는 객체 안으로 들어가서 attack 기능을 실행한다. 
		
		//객체를 생성 동시에 초기화 생성자를 통해 초기화 
		pokemon p2 = new pokemon("피카츄",3.5,"백만볼트");
		
		p2.attack();
		
		//new
		//1. 메모리 공간 heap(힙영역)
		//2. 생성자를 호출(실행)
		//3. ()안에 값이 있으면 원하는 값으로 초기화 ,()안에 값이 없으면 기본값으로 초기화 
		//4. 만들어진 객체 어디있는지 주소값 부여하고
		//5. 그 주소값을 변수에 저장한다. 
		
		
		
		// 생성자  
		// -객체를 만드는 특별한 메서드 
		
		
		// 역할
		// -객체 생성(객체를 만드는 것)
		// - 객체의 필드(변수) 값을 설정하는 것
		
		

		

	}

}
