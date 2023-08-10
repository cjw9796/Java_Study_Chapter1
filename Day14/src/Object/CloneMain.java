package Object;

public class CloneMain {

	public static void main(String[] args) {
		
		// clone() 
		// 객체를 복사해서 새로운 인스턴스(객체 생성)
		// 얇은 복사 깊은 복사 
		
		// 일반변수 값 그대로 복사 가능하다.
		// 참조변수 직접 값을 복사 하는게 아니라(주소를)
		// 주소를 복사한다 같은 객체를 참조하고 있다.
		User user1 = new User("love","love");
		
		// 오버라이딩해서 접근제어자 변경하니 
		// 누구나 접근 할 수 있는 권한이 생겼다.
		// 반환 타입이 Object로 준다 User 접근 권한이 
		// 생기지 않는다. 그렇기 때문에 형변환을 해야된다.
		
		// clone() 
		// 접근제어자 변경하기 
		// 인터페이스 cloneable 구현하기 
		// 예외가 발생한다. 
		
		// 깊은 복사!
		
		try {
			User copy = (User)user1.clone();
			
			System.out.println(copy.hashCode());
			System.out.println(user1.hashCode());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}