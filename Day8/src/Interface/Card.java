package Interface;

public abstract class Card {
	
	private String cardNumber; //카드번호
	String cardName; //카드명
	private String cardPw; //비밀번호
	private int cvc; //cvc
	
	abstract void pay(); //결제 
	abstract void save();  //적립 
	
	//setter(값을 수정한다.) . getter(값을 꺼내간다.)
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardPw() {
		return cardPw;
	}
	public void setCardPw(String cardPw) {
		this.cardPw = cardPw;
	}
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
}

//쇼핑,주유,적립,영화할인,놀이동산할인

interface Shopping{
	void shop();  // 쇼핑 5%. 10%할인
}

interface Gas{
	void gas(); 
}

interface Movie{
	void movie();
}

interface Park{
	void park(); 
}
//쇼핑,주유
class Hyundai_Card extends Card implements Shopping,Gas{

	@Override
	void pay() {
		System.out.println("현대카드 결제");
	}
	@Override
	void save() {
		System.out.println("현대카드 적립");
	}
	@Override
	public void gas() {
		System.out.println("현대카드로 주유시 10%할인");
	}
	@Override
	public void shop() {
		System.out.println("현대카드로 쇼핑시 5%추가 할인 및 적립");
		
	}

}

class Samsung_Card extends Card implements Park{

	@Override
	public void park() {
		System.out.println("놀이동산 5회 무료입장가능");
		
	}

	@Override
	void pay() {
		System.out.println("삼성카드 결제");
		
	}

	@Override
	void save() {
		System.out.println("삼성카드 적립");
		
	}
	
}

class Lotte_Card extends Card implements Shopping,Gas,Movie,Park{

	@Override
	public void park() {
		System.out.println("롯데카드 놀이동산 이용");
		
	}

	@Override
	public void movie() {
		System.out.println("롯데카드 영화 이용");
		
	}

	@Override
	public void gas() {
		System.out.println("롯데카드 주유소 이용");
		
	}

	@Override
	public void shop() {
		System.out.println("롯데카드 쇼핑 이용");
		
	}

	@Override
	void pay() {
		System.out.println("롯데카드 결제");
		
	}

	@Override
	void save() {
		System.out.println("롯데카드 적립");
		
	}
	
}

//삼성카드 -놀이동산기능 5회 무료입장가능
//롯데카드 -쇼핑,주유,영화,놀이동산 기능 추가 
