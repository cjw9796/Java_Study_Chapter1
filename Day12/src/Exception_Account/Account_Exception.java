package Exception_Account;

public class Account_Exception extends Main {

	String msg;

	public Account_Exception(String msg) {
		// super(msg); //Exception 부모클래스가 객체를 생성할 때
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "예외발생:ㅣ" + this.msg;
	}

}
