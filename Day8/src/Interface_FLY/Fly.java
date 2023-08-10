package Interface_FLY;

public class Fly {

}

interface Flyable{
	void flying();
}

class Bird extends Fly implements Flyable{

	@Override
	public void flying() {
		System.out.println("<새>가 날개를 퍼덕이며 날아갑니다!");
		
	}
	
}

class Helicopter extends Fly implements Flyable{

	@Override
	public void flying() {
		System.out.println("<헬기>가 프로펠러를 힘차게 돌리며 날아갑니다!");
	}
	
	
}

class Rocket extends Fly implements Flyable{

	@Override
	public void flying() {
		System.out.println("<로켓>이 제트엔진을 분출하며 날아갑니다!");
		
	}
	
}