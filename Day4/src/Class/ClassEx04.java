/*
		 * 회원가입 member클래스 
		 * 
		 * 꼭 받아야되는 데이터
		 * id,name,email,pw,pw_check
		 * 
		 * 선택사항 (입력하면 입력한 값으로 저장, 입력x)
		 * 성별 
		 * 취미
		 * 직업
		 * 결혼여부 true 기혼 false 미혼
		 * 
		 * 클래스 생성자 이용해서 객체를 생성하세요
		 * 
		 */
package Class;

class member{
	//회원정보
	String id,name,email,pw,pw_check; 
	
	String gen;
	String me;
	String jo;
	String age;
	
	
	//생성자 
	public member(String id, String name, String email, String pw, String pw_check, String gen) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pw = pw;
		this.pw_check = pw_check;
		this.gen = gen;
	}

	
	//기본생성자
	member(){
		
	}
	
	//생성자
	
	
	
	void show() {
		System.out.println( name + "의 정보!");
	}
	
}

public class ClassEx04 {

	public static void main(String[] args) {
		
	
		member p1 = new member();
		p1.id = "abc1";
		p1.name = "choi";
		p1.email = "abc@gmail.com";
		p1.pw = "1111";
		p1.pw_check = "1111";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
