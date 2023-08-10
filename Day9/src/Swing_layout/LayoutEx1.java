package Swing_layout;

import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class NumberPuzzle extends JFrame{
	
	
//	JButton btn1 = new JButton("1");
//	JButton btn2 = new JButton("2");
//	JButton btn3 = new JButton("3");
//	JButton btn4 = new JButton("4");
//	JButton btn5 = new JButton("5");
//	JButton btn6 = new JButton("6");
//	JButton btn7 = new JButton("7");
//	JButton btn8 = new JButton("8");
//	JButton btn9 = new JButton("9");
//	JButton btn10 = new JButton("10");
//	JButton btn11 = new JButton("11");
//	JButton btn12 = new JButton("12");
//	JButton btn13 = new JButton("13");
//	JButton btn14 = new JButton("14");
//	JButton btn15 = new JButton("15");
//	JButton btn16 = new JButton("16");
	
	Panel panel = new Panel();

	public NumberPuzzle(){
		setSize(500,500);
		
		JButton[] btnlist = new JButton[16];
		
//		MyFrame(){
//			//행열좌우위아래여백
//			setLayout(new GridLayout(4,4,10,10));
//			for(int i=0; i<b.length; i++) {
//				btnlist[i] = new JButton((i+1) + "");
//				btnlist[i] = ActionListener(this);
//				panel.add(btnlist[i]);
//			}
//			add(panel);
//		}
		
		
//		panel.setLayout(new GridLayout(4,4)); //4행 4열
//		JButton[] b = new JButton[16];
//		for(int i=0; i<b.length; i++) {
//			
//			b[i] = new JButton("버튼");
//			add(b[i]);
//		}
//		
	
		//보조프레임에 버튼 추가 
//		panel.add(btn1); 
//		panel.add(btn2); 
//		panel.add(btn3); 
//		panel.add(btn4); 
//		panel.add(btn5); 
//		panel.add(btn6); 
//		panel.add(btn7); 
//		panel.add(btn8); 
//		panel.add(btn9); 
//		panel.add(btn10); 
//		panel.add(btn11); 
//		panel.add(btn12); 
//		panel.add(btn13); 
//		panel.add(btn14); 
//		panel.add(btn15); 
//		panel.add(btn16); 
		
		add(panel);
		setVisible(true);
		
		//x눌렀을 때 메인프레임과 자바프로그램 자체 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


}

public class LayoutEx1 {

	public static void main(String[] args) {
		new NumberPuzzle();
		

	}

}
