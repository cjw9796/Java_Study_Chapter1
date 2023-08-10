package Interface_Printer;

public class Printer_Main {

	public static void main(String[] args) {
		
		SamsungPrinter seohee = new SamsungPrinter();
				LGPrinter jihee = new LGPrinter();
				Sam3D_printer hee = new Sam3D_printer();
				/*hee 참조할 수 있는 타입은?
				Sam3D_printer,Print3D,PrintColor,Three_dimensional,Objext
				 */
				
				Print3D p1 = hee;
				
				boolean res = p1 instanceof Sam3D_printer;
				System.out.println(res);
				
				res = jihee instanceof Print;
				System.out.println(res);

	}
	
}
