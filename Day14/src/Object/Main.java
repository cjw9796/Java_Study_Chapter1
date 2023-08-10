package Object;

public class Main {
public static void main(String[] args) {
	User a = new User("qwer","qwer");
	
	//getClass()
	//자신이 속한 클래스의 객체를 반환하는 메서드 
	//모든 정보를 담고 있는 클래스 
	//클래스 당 1개만 존재 
	//자바 파일에서 -> .class -> 객체를 생성할 때 
	
	System.out.println(a.getClass());
	
	//자바에서 Reflection API
	//자바에서 타입을 모르더라도 getClass().다양한 기능 
}
}
