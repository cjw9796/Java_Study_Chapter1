package InnerClass;

class PocketBall{
	
	int size = 100;
	static int price = 5000;
	
	class User{
		String name;
		
		public User(String name) {
			this.name 
		}
	}
	
	static class PocketMonster{
		static String name = "이상해씨";
		int level = 10;
		
		public static void getPoketMenber() {
			//외부 클래스 인스턴스 멤버 접근 불가능하다. 
			//System.out.println(size);
			
			System.out.println(price);
			
			System.out.println(name);
			System.out.println(level);
		}
	}
}

public class Total {

	public static void main(String[] args) {
		// static이랑 member클래스랑 같이 사용을 할 수 있다. 
		
		new PocketBall.PocketMonster();
		
		//멤버클래스 선언
		Pocketball.User u1 = new Pocketball().new User("이서희");

	}

}
