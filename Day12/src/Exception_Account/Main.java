package Exception_Account;

public class Main {

	public static void main(String[] args) {
		
		try {
			Account ac = new Account();
			ac.deposit(0);
			ac.withdraw(0);
			
			check_card cc = new check_card();
			cc.check();
			cc.pay();
		}catch (Account_Exception e) {
			System.out.println("에러 발생");
			System.out.println(e);
		}


		

	}

}
