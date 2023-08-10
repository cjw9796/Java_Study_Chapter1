package Swing_layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyGrid extends JFrame{
	
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JButton btn3 = new JButton("버튼3");
	JButton btn4 = new JButton("버튼4");
	JButton btn5 = new JButton("버튼5");
	
	JPanel panel = new JPanel();
	public MyGrid() {
		setSize(400, 200);
		
		
		// 화면 배치 설정
		panel.setLayout(new GridLayout(3, 2));	//3행2열 	
		
		// 보조 프레임에 여러개의 버튼 먼저 추가한다.
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		
		
		//보조프레임 메인프레임 추가!
		add(panel);
				
		
		setVisible(true);
	}
}

public class GridLayoutMain {

	public static void main(String[] args) {

		new MyGrid();
		
		/*GridLayout
		 * -행과 열을 만들어 격자 형태로 정렬하는 레이아웃 
		 * -모든 컴포넌트들이 동일한 크기를 가지고 프레임에 배치된다.  
		 * -엑셀, 바둑판
		 */
				
		// 배열,반복문 이용해서 
		
	}
}