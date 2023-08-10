package GUI;

public class Main {

	public static void main(String[] args) {
		MyFrame my= new MyFrame();
		//MyframeTest my2= new MyframeTest();
		Thread myt = new Thread(my);
		myt.start();
		

	}

}
