package Swing_layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyBorder extends JFrame{
	
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JButton btn3 = new JButton("버튼3");
	JButton btn4 = new JButton("버튼4");
	JButton btn5 = new JButton("버튼5");
	
//화면 클래스 정의 	FlowLayout
	//FlowLayout flow = new FlowLayout();
	
	JPanel panel = new JPanel();
	
	public MyBorder(){ //기본생성자 
		setSize(400,200);
		
		panel.setLayout(new BorderLayout());
		
		panel.add(btn1,BorderLayout.NORTH);
		panel.add(btn2,BorderLayout.WEST);
		panel.add(btn3, BorderLayout.EAST);
		panel.add(btn4, BorderLayout.SOUTH);
		panel.add(btn5, BorderLayout.CENTER);
		
		//보조프레임 메인프레임 추가!
		add(panel);
		
		
		setVisible(true);
	}
}


public class BorderLayoutMain {

	public static void main(String[] args) {
		
		new MyBorder();
		
		// BorderLayout
		// 동,서,남,북 중앙
		// 상,하,좌,우 가운데
		
		//기본적으로 JFrame 화면 배치 BorderLayout
		//가운데로 설정
		//각 영역당 하나의 컴포넌트(버튼,스크롤,체크박스,라디오박스)

	}

}
