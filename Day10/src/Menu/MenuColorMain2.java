package Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuColorMain2 extends JFrame implements MouseListener {
	
	JPanel mainPanel;
	
	JMenuItem m2_i1;
	JMenuItem m2_i2;
	JMenuItem m2_i3;
	JMenuItem m2_i4;

	MenuColorMain2() {
		setTitle("메뉴 만들기");
		setBounds(30, 50, 500, 400);
		setLayout(new BorderLayout());
		
		mainPanel = new JPanel();
		add(mainPanel, BorderLayout.CENTER);
		
		initMenubar();// 메뉴들에 관한 명령문 저장하는 메소드
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void initMenubar() {
		
		//===================================	
		JMenuBar mb = new JMenuBar();

		JMenu m2 = new JMenu("Color");

		JMenuItem m2_i1 = new JMenuItem("파랑");
		JMenuItem m2_i2 = new JMenuItem("분홍");
		JMenuItem m2_i3 = new JMenuItem("주황");
		JMenuItem m2_i4 = new JMenuItem("검정");

		//리스너
		m2_i1.addMouseListener(this);
		m2_i2.addMouseListener(this);
		m2_i3.addMouseListener(this);
		m2_i4.addMouseListener(this);

		m2.add(m2_i1); m2.add(m2_i2); m2.add(m2_i3); m2.add(m2_i4);

		// 메뉴바에 메뉴
mb.add(m2);
		
		//프레임에 메뉴바 설정
		setJMenuBar(mb);		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		JMenuItem obj = (JMenuItem) e.getSource();
		
		if (obj == m2_i1) {
			mainPanel.setBackground(Color.blue);
		} else if (obj == m2_i2) {
			mainPanel.setBackground(Color.pink);
		} else if (obj == m2_i3) {
			mainPanel.setBackground(Color.orange);
		} else {
			mainPanel.setBackground(Color.black);
		}
	}

	public static void main(String[] args) {
		new MenuColorMain2();
	}
}