package Override;

public class Point {

	
	//좌표를 저장하는 클래스
	int x;
	int y;
	
	
	//기존에 toString()
	//클래스명@주소값 이게 기본값설정
	//단! 안에있는내용은 자식클래스에 맞게 변경하겠다.
	
	@Override
	public String toString() {
		
		return "x:"+ x + "y:"+y;
	}
	public static void main(String[] args) {
		

		

	}

}
