package Exception_Account;

import java.util.Scanner;

public class Account extends Main{   //계좌클래스 

	String no; // 계좌
	String name; // 예금주
	int money; // 잔액
	int no_money; // 계좌잔액

	public Account() {
	} // 기본생성자

	// 매개변수를 받는 생성자
	public Account(String no, String name, int money) {
		this.no = no;
		this.name = name;
		this.money = money;
		this.no_money = no_money;
	}

	void deposit(int money) { // 매개변수만큼 예금
		this.money(100);
		no_money = no_money + money;
	}

	void withdraw(int money) throws Account_Exception{
		if(this.no_money < this.money) {
			throw new Account_Exception("계좌 잔액이 부족합니다.");
		}else(this.no_money >= this.money); {
					System.out.println("출금성공");
		}
	} // 매개변수만큼 출금
}

class check_card extends Account{  //체크카드 발급&사용 클래스 
	int check_card_num;
	int card_password;
	int paymoney;
	
	void check() throws Account_Exception { //비밀번호 확인하는 함수 
		Scanner.sc = new Scanner(System.in);
		int card_password = sc.nextInt();
		
		if(card_password == card_password) {
			void pay();
			
		}else {
			throw new Account_Exception("비밀번호가 맞지 않습니다. 확인하세요!")
		}
		
		
	}
	    
	void pay() throws Account_Exception{ //결제하는 함수 
		
		if(no_money < paymoney) {
			throw new Account_Exception("한도초과!");
		}else(no_money >= paymoney);{
			this.no_money -= paymoney;
			System.out.println("결제완료!");
		}
	}
	
	
}
