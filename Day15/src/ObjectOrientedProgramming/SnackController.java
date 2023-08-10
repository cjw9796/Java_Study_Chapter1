package ObjectOrientedProgramming;

public class SnackController extends Snack{

	public SnackController() {} //기본 생성자 
	
	public void saveData(String kind, String name, String flavor, int numOf, int price) {
		setKind(kind);
		setName(name);
		setFlavor(flavor);
		setNumOf(numOf);
		setPrice(price);
		System.out.println("저장 완료되었습니다.");
	}
	
	public void confirmData() { //저장된 데이터를 반환하는 메소드
		System.out.println(getKind()+"종류");
		System.out.println(getName()+"이름");
		System.out.println(getFlavor()+"맛");
		System.out.println(getNumOf()+"개수");
		System.out.println(getPrice()+"가격");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
