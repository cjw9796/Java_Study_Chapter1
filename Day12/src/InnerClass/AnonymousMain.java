package InnerClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousMain extends JFrame {

	public AnonymousMain() {
		setBounds(0, 0, 400, 300);

		JButton btn = new JButton("눌렀?");
        
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {}
				// TODO Auto-generated method stub
				
			
		} );
		
		add(btn);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new AnonymousMain();

		/*
		 * 내부클래스 익명클래스 -클래스를 정의와 동시에 객체를 생성할 때 만들어지는 클래스 -1회용 클래스
		 */

	}

}
