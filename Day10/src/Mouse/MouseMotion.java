package Mouse;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseMotion extends JFrame implements MouseMotionListener {

	JPanel pan;
	JLabel label;
	
	public MouseMotion() {
		
		setTitle("마우스 이벤트");
		setSize(400,200);
		
		
		pan = new JPanel();
		label = new JLabel("움직이는 레이블");
		label.setForeground(Color.red);
		
		pan.addMouseMotionListener(this);
		
		pan.add(label);
		add(pan);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		new MouseMotion();

	}



	@Override
	public void mouseDragged(MouseEvent e) { // 마우스 눌러진 상태로 드래그 될 때 
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {// 마우스가 움직일 때 
		// e변수가 가지고 있는 정보를 사용 
	
		label.setLocation(e.getX()-20,e.getY()-20);
		
		
	}

}
