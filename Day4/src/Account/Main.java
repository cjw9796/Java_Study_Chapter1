package Account;


//접근제어자 
// private : bank 객체 이외에 다른 클래스들은 접근금지! 

class Bank {
	private String accName;
	private String accNum;
	private String accPw;
	private int balance;
	
	//기본생성자
	Bank() { }
	
	//생성자 
	Bank(String accName, String accNum, String accPw, int balance) {
		this.accName = accName;
		this.accNum = accNum;
		this.accPw = accPw;
		this.balance = balance;
	}
	
	//외부에서 입금 기능
	void 입금(int money) {
		this.balance += money;
		System.out.println("현재 잔액: " + this.balance);
	}
	
	
	
	//외부에서 출금기능 
	
	int 출금(int money){
		// 내 통장에 50만원 있음 , 20만원 출금해줄래 
		
		if(this.balance < money) {
			System.out.println("한도초과");
			return 0;
		}
		else {
			this.balance -= money;
			return money;
			
		}
		
	}
	
	void info() {
		System.out.println("계좌명     : " + accName);
		System.out.println("계좌번호    : " + accNum);
		System.out.println("계좌비밀번호 : " + accPw);
		System.out.println("잔액      : " + balance + "원");
	}
}



public class Main {

	public static void main(String[] args) {
		
		Bank seohee = new Bank();
		//객체에 변수에 직접 저장한게 아니라
		// 함수를 이용해서 간접적으로 저장한다. 
		seohee.입금(500000);
		
		int money = seohee.출금(200000);
		System.out.println(money);
	
	
	
	
	
	}
}

/*
		seohee.balance = 100000000;
		
		//main클래스 seohee잔액에 직접 접근 가능 
		System.out.println(seohee.balance);
		//-> main클래스가 내 돈을 출금할 수 있다. 따라서 캡슐화 필요 
		
		seohee.balance -=500000;
 */