package Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Test extends JFrame implements ItemListener ,ActionListener,KeyListener{
	
	
	//필드 두개 
	JTextField t1,t2;
	JTextArea area;        //여러줄을입력할수있는클래스
	JButton cal, reset;   //버튼계산과 리셋
	JComboBox cb;	      //드롭다운클래스 
	
	Test(){ //생성자 메인프레임 설정 
		setTitle("원 넓이 구하기");
		setLayout(new BorderLayout(10,10));  //JFrame클래스 기본적으로 borderlayout 으로 설정됨
		setSize(400,300);
		
		showNorth();
		showCenter();
		showSouth();
		
		//전역변수 생성자 안에 이벤트리스너 추가 
		//이벤트 추가 
				t1.addKeyListener(this);
				cal.addActionListener(this);
				reset.addActionListener(this);
				cb.addItemListener(this);
				
		
		setVisible(true); //화면보이기는 무조건 이벤트,창크기,컴포넌트들 생성후 맨 마지막에 작성 
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	
	void showNorth() {
		JPanel pan1 = new JPanel(); //반지름 필드 
		JPanel pan2 = new JPanel(); //원 넓이 필드
		JPanel panel = new JPanel(new GridLayout(2, 0));
		
		JLabel l1 = new JLabel("원의 반지름");
		JLabel l2 = new JLabel("원의 넓이");
		
		t1 = new JTextField(10);  //입력칸
		t2 = new JTextField(10);
		
		//보여지긴 하지만 비활성화  t2.setEnabled(false);  활성화: true 
		t2.setEnabled(false);
		
		//추가 
		pan1.add(l1); pan1.add(t1);
		pan2.add(l2); pan2.add(t2);
		
		//두개를 묶어주는 panel 추가
		panel.add(pan1); //그리드의 0번째 
		panel.add(pan2); //그리드의 1번째
		
		//메인 판에 추가(위)
		add(panel,BorderLayout.NORTH);
		
		
	}
	
	void showCenter() {
		//panel.setBackground(Color.black); //색깔로 구별 
		//여러줄을 입력받는 공간 
		
		JPanel panel = new JPanel();
		area = new JTextArea(10,20); //가로 세로 글자수  
		area.setText("이 영역에 원의 넓이를 \n 계산하는 과정");
		//area.setEditable(false); //수정못하게 
		area.setForeground(Color.red);
		
		panel.add(area);
		add(panel,BorderLayout.CENTER);
	}
	
	void showSouth() {
		
		String[] color = {"red","blue"};
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		
		cal = new JButton("계산");
		cb = new JComboBox(color);
		reset = new JButton("리셋");
		
		
		
		panel.add(cal);
		panel.add(cb);
		panel.add(reset);
		
		add(panel,BorderLayout.SOUTH);
		
		
	}
	
	
	

	
	public static void main(String[] args) {
		new Test();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource(); //이벤트 정보를 가지고 오겠다. 근데 어떤 객체인지 몰라요! 따라서 최상위 클래스인 object 타입으로 참조(다형성)
		
		if (obj == cal) {
			if(t1.getText().isEmpty())
				area.setText("반지름을 입력하세요!!");
			else {
				String s = t1.getText(); //1.텍스트필드에 값을 가지고 와야된다.
				double radius = Double.parseDouble(s);  //2.실수값으로 변환 (문자 -> 실수로 변경) 
				double result = radius * radius * 3.14;
				t2.setText(""+result); //3.계산된 결과를 결과로 수정 
				area.setText(radius+ "*"+radius+"*3.14="+result);
			}
			
			//t1 값이 있는지 없는지 확인을 해서 
			//1. getText() 
			//2. isEmpty() 비어있으면 true, 값있다 false 
			// 비어있다면 "반지름을 입력하세요"
			//area에 수정해서 위에 내용을 출력하세요! 
			
	
			
			
		}else if(obj == reset) {
			
			t1.setText(null);
			t2.setText(null);
			area.setText(null);
			
		}
		
		
		
		
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		//아이템을 배열로 저장을 했다. 따라서 꺼내올때도 인덱스(방번호)로 
		//getSelectedIndex(); : 선택된 인덱스 번호를 가져온다. 
		int index = cb.getSelectedIndex();
		
		if(index ==0) {
			area.setForeground(Color.RED);
		}else {
			area.setForeground(Color.BLUE);
		}
		
		
		
	}


	@Override
	public void keyTyped(KeyEvent e) {}


	@Override
	public void keyPressed(KeyEvent e) {
		//엔터 눌렀을때 실행되게 
		
		
	}


	@Override
	public void keyReleased(KeyEvent e) {}

	
}














/*
	public Test() {
		setTitle("원 넓이 구하기");
		setSize(400, 200);
		
		init(); //메뉴들에 관한 명령문만 저장하는 메서드 
		
	 JPanel pan = new JPanel();
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}

	void init() {
		//1. 원의 반지름 텍스트박스 
		JTextField obj1 = new JTextField("원의 반지름");
		//2. 원의 넓이 텍스트박스 
		JTextField obj2 = new JTextField("원의 넓이");
		//3. 텍스트박스
		JTextArea objt1 = new JTextArea();
	
		//4. 계산버튼
		JButton btn1 = new JButton("계산");
		//5. 콤보박스
		String[] color = {"red","blue"};  
		JComboBox combo1 = new JComboBox(color);
 		//6. 리셋버튼 
		JButton btn2 = new JButton("리셋");
		
		pan.add(obj1);
		pan.add(obj2);
		pan.add(objt1);
		pan.add(btn1);
		pan.add(combo1);
		pan.add(btn2);
		add(pan);
 */