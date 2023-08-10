package Thread_synchronized;

import java.util.Scanner;

public class Account extends Thread {
	
	private String name;  //계좌명
	static private int pw = 0000;          //비번은 숫자 
	private int money = 1000000;  //잔액 
	
	
	public Account(String name, int pw, int money) {
		super();
		this.name = name;
		this.pw = pw;
		this.money = money;
	}
	
	void input(int pw) {
		System.out.println("비밀번호를 입력하세요");
		Scanner pw = new Scanner(System.in) ;
		pw.nextInt();
		this.pw = pw; 
	}
	


}


class ATM{
	Account a; //고객정보 받는 참조변수 
	String name; //이용하는 사람의 정보! 
	int pw = 0000;
	
	void withd() {
			
		if(pw.nextInt() == 0000) {
			System.out.println("출금액을 입력하세요");
			if(money >= this.money) {
				money -= this.money; 
				System.out.println("출금성공 남은잔액은:"+ money +"출금인은:"+ name+"입니다.");
			}else(money < this.money){
				System.out.println("한도초과 출금안됨");
			}
		}else pw.nextInt() != 0000{
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
}


/*
 * 출금 함수명: withd() 매개변수는 비밀번호, 접근하는 사람 이름 
		기능: 비밀번호가 맞으면 출금액을 입력을 받고 
	 	출금액이 기존 돈보다 많지 않으면 출금 하고 잔액표시 + 누가 출금했는지 
	 	기존 돈보다 출금액이 많다 그러면 "한도초과 출금 안됨"
 */