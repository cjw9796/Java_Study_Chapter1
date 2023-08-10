package ObjectOrientedProgramming;

import java.util.Scanner;

public class SnackMenu extends SnackController {
	Scanner sc = new Scanner(System.in);
	
	
	
	
	
	public void menu() {
		System.out.println("스낵류를 입력하세요");
		kind = scanner.nextLine();
		
		System.out.println(getKind()+"종류");
		System.out.println(getName()+"이름");
		System.out.println(getFlavor()+"맛");
		System.out.println(getNumOf()+"개수");
		System.out.println(getPrice()+"가격");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("스낵류를 입력하세요");
		
		
		
		
		SnackController scr = new SnackController();

	}

}
