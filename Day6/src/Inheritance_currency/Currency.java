package Inheritance_currency;

public class Currency {

	// 수량 amount
	// 표기법(원,유로,엔)

	double amount;
	String notation;

	Currency(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}

}

class KRW extends Currency {
	KRW(double amount, String notation) {
		super(amount, notation);
	}

	@Override
	public String toString() {
		// 객체의 정보를 문자열로 반환 
		// String 클래스 안에 format()함수를 이용해서 
		return String.format("EUR: %.2F%S",amount, notation){
			
		return "KRW:" + amount + notation;
	}

}

	class USD extends Currency {
	USD(double amount, String notation) {
		super(amount, notation);
	}return"USD:"+amount+notation;
	}

	class EUR extends Currency {
	EUR(double amount, String notation) {
		super(amount, notation);
	}return"EUR:"+amount+notation;
	}

	class JPY extends Currency {
	JPY(double amount, String notation) {
		super(amount, notation);
	}return"JPY:"+amount+notation;
	}

	public static void main(String[] args) {
		KRW krw = new KRW(1500.00, "원");
		System.out.println(krw);

	}

}