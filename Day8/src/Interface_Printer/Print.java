package Interface_Printer;

/*인터페이스 상속 
 * 인터페이스 계속 만들다보면 중복적인 메서드 생김
 * 인터페이스는 다중 상속이 된다. 
 */

public interface Print {

	//프린터
	void print(String p); //흑백프린터
	
}

interface PrintColor extends Print{
	
	void colorPrint(String p); //컬러기능
}

interface Three_dimensional{
	void D3();
}

interface Print3D extends PrintColor,Three_dimensional{
	
}