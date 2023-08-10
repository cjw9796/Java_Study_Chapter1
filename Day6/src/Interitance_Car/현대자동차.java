package Interitance_Car;

class hyundai{
	String 차량명;
	String 색상; 
	String 등급;
	String brandName ="현대자동차";		
	int 최대속력;
	
	void 주행한다() {}
	void 브레이크() {}
	void 후진한다() {}
	
}

class 아반떼 extends hyundai{
	
}
class 그랜저 extends hyundai{
	
}
class 제네시스 extends hyundai{
	String 차량명 = "제네시스";
	String 색상 = "검정"; 
	String 등급 = "대형";
	String brandName ="현대자동차";		
	int 최대속력 = 300;
	
	void 안마기능 () {}
}


public class 현대자동차 {

	public static void main(String[] args) {
		//아반떼 아반떼1 = new 아반떼();

	}

}
