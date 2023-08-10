package Interface_Printer;

public class SamsungPrinter implements Print{

	@Override
	public void print(String p) {
		System.out.println("삼성 흑백 프린터");
		
	}

	

}

class SamsungColorPrinter implements PrintColor{

	@Override
	public void print(String p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colorPrint(String p) {
		// TODO Auto-generated method stub
		
	}
	
}

//3d프린터
class Sam3D_printer implements Print3D{

	@Override
	public void colorPrint(String p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(String p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void D3() {
		// TODO Auto-generated method stub
		
	}
	
}