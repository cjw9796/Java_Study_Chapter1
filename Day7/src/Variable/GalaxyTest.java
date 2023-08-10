package Variable;

public class GalaxyTest {

	public static void main(String[] args) {
		// 스마트폰 일련번호 저장 

		//스마트폰 객체 생성
		Galaxy g0 = new Galaxy("I-1");
		Galaxy g1 = new Galaxy("V-2");
		Galaxy g2 = new Galaxy("U-3");
		Galaxy g3 = new Galaxy("P-4");
		Galaxy g4 = new Galaxy("S-5");
		
		
		//갤럭시판(배열)에 갤럭시 정리 
		Galaxy[] 갤럭시판 = new Galaxy[5];
		갤럭시판[0] = g0; //I-1
		갤럭시판[1] = g1; //V-1
		갤럭시판[2] = g2; //U-1
		갤럭시판[3] = g3; //P-1
		갤럭시판[4] = g4; //S-1
		
		for(Galaxy g : 갤럭시판) {
			g.print();
		}
		System.out.println("---------------");
		System.out.println(Galaxy.count);
	}

}


class Galaxy{
	String serialNum; // 일련번호
	  
	  /* 1. 해당 필드를 클래스 변수화 하세요. */
	  static int count = 0;
	  
	  Galaxy(String c){
		  this.serialNum = c;
		  Galaxy.count += 1;
	  }
	  
	  // 생성자
	  Galaxy() {
	    count++;
	    char c = randomAlphabet(); // A ~ Z 중 택1
	    serialNum = String.format("%c-%d", c, count);
	  }
	  
	  // 메소드
	  char randomAlphabet() {
	    return (char) ('A' + Math.random() * 26); // A to Z
	  }
	  
	  void print() {
	    System.out.printf("Galaxy { serialNum: %s }\n", serialNum);
	  }
	  
	  
	  
}