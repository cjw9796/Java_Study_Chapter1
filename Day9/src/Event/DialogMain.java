package Event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DialogMain extends JFrame implements ActionListener {

	JButton btn1 = new JButton("에러");
	JButton btn2 = new JButton("정보");
	JButton btn3 = new JButton("경고");
	JButton btn4 = new JButton("질문");
	
	//배열화
	JButton[] btnlist = new JButton[4];
	String[] str = {"에러","정보","경고","질문"};

	JPanel panel = new JPanel();

	DialogMain() {
		// setSize(500,400);
		setBounds(100, 100, 500, 400); // x,y,넓이,높이

		// 각각의 버튼에 리스너 추가
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);

		panel.setLayout(new java.awt.FlowLayout());
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);

		
		//배열화
		
		
		add(panel);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		//
		new DialogMain();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 어떤 버튼이 눌렸는지 확인
		Object obj = e.getSource();
		JOptionPane.showInputDialog(this,"이름을 입력하세요"); //이름입력하는창 생성 

		if (obj == btn1) { // 객체의 주소값끼리 비교! 발생한 이벤트 객체와 btn1이 같니
			// 팝업창 (JOptionPane)클래스. Static선언이 되어있다.
			JOptionPane.showMessageDialog(this, "팝업창 대화상자", "에러", JOptionPane.ERROR_MESSAGE);
			btn1.setBackground(Color.ORANGE);
		} else if (obj == btn2) {
			JOptionPane.showMessageDialog(this, "팝업창 대화상자", "정보", JOptionPane.INFORMATION_MESSAGE);
			btn2.setBackground(Color.ORANGE);
		} else if (obj == btn3) {
			JOptionPane.showMessageDialog(this, "팝업창 대화상자", "경고", JOptionPane.WARNING_MESSAGE);
			btn3.setBackground(Color.ORANGE);
		} else if (obj == btn4) {
			JOptionPane.showMessageDialog(this, "팝업창 대화상자", "질문", JOptionPane.QUESTION_MESSAGE);
			btn4.setBackground(Color.ORANGE);
		}

	}
}
