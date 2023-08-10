package Swing_layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFlow extends JFrame{
	
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JButton btn3 = new JButton("버튼3");
	JButton btn4 = new JButton("버튼4");
	
//화면 클래스 정의 	FlowLayout
	//FlowLayout flow = new FlowLayout();
	
	JPanel panel = new JPanel();
	
	MyFlow(){ //기본생성자 
		setSize(400,200);
		
		//화면 배치를 설정
		panel.setLayout(new java.awt.FlowLayout());
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		add(panel);
		
		setVisible(true);
	}
}

public class FlowLayout {

	public static void main(String[] args) {
		
		new MyFlow();
		// 왼쪽에서 오른쪽으로 한줄에 차례대로 정렬 레이아웃
		//왼쪽에서 실행할건지 오른쪽에서 실행할건지 결정해라 
		
		//Jframe
		//하나의 버튼만 올라갈 수 있고 여러가지를 표현
		//여러가지의 버튼, 게시물, 스크롤 
		
		//보조프레임(패널)
		//Jpanel

	}

}
