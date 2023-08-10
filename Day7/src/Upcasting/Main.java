package Upcasting;

class Parent{
	
	int money; //상속금액
	private int amount; //비상금 
	
	Parent(){
		money = 1000000000;
		amount = 10000000;
	}
	
	int getMoney(String s) {
		if(s.equals("허락")) {
			this.amount = 1000000;
			return 10000000;
		}else {
			System.out.println("미안하다 내 여생을 즐겨야된다!");
			return 0;
		}
	}
	
	void setMoney(int amount) {
		this.amount += amount;
	}
	
}

class Children extends Parent{
	
	
}


public class Main {

	public static void main(String[] args) {
		/*
		//private(비공개) - 상속을 한 자식클래스라도 접근 불가능 , 
		 * 접근제어자가 private으로 설정되었다면 private 이 붙은 변수, 메서드는 해당 클래스에서만 접근이 가능하다.
		//public(공개)
		 * 접근제어자가 public으로 설정되었다면 public 접근제어자가 붙은 변수, 메서드는 어떤 클래스에서라도 접근이 가능하다.
		*/
		Parent p1 = new Parent();
		System.out.println(p1.money);
		
		
		Children c1 = new Children();
		System.out.println(c1.money);
		
		Parent p2 = c1;
		
		c1.getMoney("허락");
		
		
	}

}
