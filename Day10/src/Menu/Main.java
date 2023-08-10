package Menu;

import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main extends JFrame {
	
	public Main() {    
		setTitle("메뉴 만들기");
		setSize(400,200);
		
		init(); //메뉴들에 관한 명령문만 저장하는 메서드 
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	void init() {
		//1. 메뉴바 만들기 
		JMenuBar menubar = new JMenuBar();
		
		//2. 메뉴1 
		JMenu menu01 = new JMenu("file");
		menubar.add(menu01); //메뉴를 메뉴바에 붙이기 
		
		//2. 메뉴2 
		JMenu menu02 = new JMenu("Edit");
		menubar.add(menu02);
		
		//2. 메뉴3 
		JMenu menu03 = new JMenu("Help");
		menubar.add(menu03);
		
		
		//3. 메뉴1의 항목만들기01
		JMenuItem item01 = new JMenuItem("New");
		//file 메뉴에 뭍이기 
		menu01.add(item01);
		
		//3. 메뉴1의 항목만들기02
		JMenuItem item02 = new JMenuItem("Open");
		//file 메뉴에 뭍이기 
		menu01.add(item02);
		
		//4.프레임에 메뉴 설정 setJMenuBar(메뉴바객체);
		setJMenuBar(menubar);
		
	}
	
	public static void main(String[] args) {
		new Main();

	}

}
