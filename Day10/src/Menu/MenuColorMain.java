package Menu;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuColorMain extends JFrame {
	public MenuColorMain() {    
		setTitle("메뉴 만들기");
		setSize(400,200);
		
		init(); //메뉴들에 관한 명령문만 저장하는 메서드 
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	

	void init() {
		//니모닉키 - 마우스를 사용하지 않고 단축키 메뉴에 접근할 수 있도록 설정해주는것
	//setMnemonic("니모닉 키에 설정하는 문자")
		
		
		//1. 메뉴바 만들기 
		JMenuBar menubar = new JMenuBar();
		
		//2. 메뉴1 
		JMenu menu01 = new JMenu("file");
		menu01.setMnemonic(KeyEvent.VK_DOWN);
		menubar.add(menu01); //메뉴를 메뉴바에 붙이기 
		
		//2. 메뉴2 
		JMenu menu02 = new JMenu("Color");
		menu01.setMnemonic(KeyEvent.VK_UP);
		menubar.add(menu02);
		
		//2. 메뉴3 
		JMenu menu03 = new JMenu("Help");
		menubar.add(menu03);
		
		
		//3. 메뉴1의 항목만들기01
		JMenuItem item01 = new JMenuItem("파란색");
		//file 메뉴에 뭍이기 
		menu02.add(item01);
		
		//3. 메뉴1의 항목만들기02
		JMenuItem item02 = new JMenuItem("빨간색");
		//file 메뉴에 뭍이기 
		menu02.add(item02);
		
		//3. 메뉴1의 항목만들기03
		JMenuItem item03 = new JMenuItem("노란색");
		//file 메뉴에 뭍이기 
		menu02.add(item03);
		
		//4.프레임에 메뉴 설정 setJMenuBar(메뉴바객체);
		setJMenuBar(menubar);
		
	}
	public static void main(String[] args) {
		new MenuColorMain();

	}

}
