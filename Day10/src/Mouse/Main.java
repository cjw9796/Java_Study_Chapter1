package Mouse;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame implements MouseListener{

	JPanel pan;
	
	public Main() {
		
		setTitle("마우스 이벤트");
		setSize(400,200);
		
		
		pan = new JPanel();
		add(pan);
		
		addMouseListener(this); //실제 메인프레임에 이벤트가 설정 
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new Main();
		

	}


	@Override
	public void mouseClicked(MouseEvent e) {
		pan.setBackground(Color.cyan);
		
	}


	@Override
	public void mousePressed(MouseEvent e) { //마우스 누를때
		pan.setBackground(Color.GREEN);
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {		//마우스 땔때
		pan.setBackground(Color.pink);
		
	}


	@Override
	public void mouseEntered(MouseEvent e) { //마우스가 프레임으로 들어왔을때 
		pan.setBackground(Color.magenta);
		
	}


	@Override
	public void mouseExited(MouseEvent e) { //마우스가 프레임에서 나갔을때 
		pan.setBackground(Color.orange);
		
	}

}
