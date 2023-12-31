package Thread;

import javax.swing.JOptionPane;

class MyThread extends Thread{
	// 스레드를 상속받아서 실행하는 실행문을 작성하는 곳 
	@Override
	public void run() {
		
		for(int i = 0; i<10; i++) {
			//프로그램을 지연시키는 함수 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+"초");
		}
		//super.run();
	}
	}



public class ThreadMulti {

	public static void main(String[] args) {
		Thread m1 = new MyThread();
//		Car c1 = new Car("소나타", 1000);
//		Car c2 = new Car("그랜저", 3000);

		Monster mo1 = new Monster("오크", 2000);
		Monster mo2 = new Monster("오크전사", 5000);
		
//		//스레드 시작점 
		m1.start(); 
		mo1.start(); 
		mo2.start(); 
//		c1.start();
//		c2.start();
	    
		System.out.println("main스레드 끝!");

	}

}

//실제 스레드를 정의해서 객체를 생성하면 
//start() 함수를 실행해야 된다. 자동적으로 run()메서드가 호출되며 그 안에 있는 내용을 실행하게 된다.
//String msg = JOptionPane.showInputDialog("입력: ");
//System.out.println(msg);