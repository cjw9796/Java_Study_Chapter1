package Interface;

public class Main2 {  //카드 인터페이스 출력 

	public static void main(String[] args) {
		Samsung_Card c = new Samsung_Card();
		c.park();
		c.pay();
		c.save();
		
		Hyundai_Card h = new Hyundai_Card();
		h.pay();
		h.save();
		h.gas();
		h.shop();
		
		Lotte_Card l = new Lotte_Card();
		l.park();
		l.movie();
		l.gas();
		l.shop();
		l.pay();
		l.save();
		
		
		
		
	}

}
