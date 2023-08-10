package Class;

import java.util.ArrayList;

class Account{
	
	//필드
	String id;
	String pw;

	//기본생성자
	Account(){} //객체를 생성()할 때 빈 객체로 저장된다. 
	
	//생성자 // 객체를 생성()할 때 원하는 값으로 저장된다.
	// 단! 기본생성자가 생기지 않는다. 비어있는 객체로 객체생성시 오류
	Account(String _id, String _pw){
		id = _id;
		pw = _pw;
	}
}


class Naver{
	//필드(정보)
	//고객들의 정보를 저장하는 타입 <내가 원하는 타입>
	ArrayList<Account> acclist = new ArrayList<>();
	
}




public class ClassEx04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//네이버 회사 생성
		 Naver com = new Naver();

		
		//네이버에 회원가입
		//id:qwer pw:love 
		
		//두번째 객체 생성 
		Account acc2 = new Account("bbbb", "bbbb2");
		
		//첫번째 객체 생성
		Account acc1 = new Account("qwer", "love");
		
		
		//acc1 -> 네이버 회사의 고객정보 변수에 저장
		com.acclist.add(acc1);
		com.acclist.add(acc2);
		
		
		System.out.println(com.acclist.get(0).id); //첫번째 객체 회원정보 조회 
		System.out.println(com.acclist.get(0).pw); //첫번째 객체 회원정보 조회 
		
		System.out.println(com.acclist.get(1).id); //두번째 객체 회원정보 조회 
		System.out.println(com.acclist.get(1).pw); //두번째 객체 회원정보 조회 
		
	}

}
