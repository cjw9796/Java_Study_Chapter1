package Swing;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class Mytext extends JFrame{
//	JTextField obj1 = new JTextField(10); //글자10만큼의 크기로 생성 
//	JTextField obj2 = new JTextField("고양이"); //글자로 초기화
//	JTextField obj3 = new JTextField("강아지",10); //강아지로 초기화, 10크기

	
//	JCheckBox obj1 = new JCheckBox();        //체크박스생성
//	JCheckBox obj2 = new JCheckBox("고양이");
//	JCheckBox obj3 = new JCheckBox("강아지",true);
	
//	JRadioButton obj1 = new JRadioButton();  //라디오버튼 생성 
//	JRadioButton obj2 = new JRadioButton("강아지");
//	JRadioButton obj3 = new JRadioButton("고양이",true);
	
//	String[] name = {"고양이","강아지","돼지"};  //콤보박스 생성
//	JComboBox obj1 = new JComboBox(name);    
//	
//	JLabel obj2 = new JLabel("고양이");         //이미지 넣기 
//	JLabel obj3 = new JLabel(new ImageIcon("Image_2023-04-06 10_59_04.png"));
//	JLabel obj4 = new JLabel("고양이", new ImageIcon("Image_2023-04-06 10_59_04.png"),JLabel.RIGHT);
	
	
	JPasswordField obj1 = new JPasswordField(10); //패스워드 입력창 생성 
	JPasswordField obj2 = new JPasswordField("댕댕이");
	JPasswordField obj3 = new JPasswordField("댕댕이",10);
	
	JPanel pan = new JPanel();
	
	Mytext(){
		setSize(500,300);
	
	
		//보조프레임
		pan.add(obj1);
	    pan.add(obj2);
		pan.add(obj3);
	
		
		add(pan);  //보조프레임 메인프레임 추가
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
}
public class TextFieldMain {

	public static void main(String[] args) {
		new Mytext();

		
		/*
		 * passwordField
		 * -비밀번호 입력에 특화된 텍스트
		 * -암호 기능을 처리하고 한 줄의 텍스트로 편집을 할 수 있다. 
		 */
		
		
		/*
		 * Label
		 * -고정된 텍스트 값을 표현
		 * - 읽기 전용 한 줄 표시
		 */
		
		
		
		/*TextField
		 * -텍스트 입력 한줄 입력하거나 수정하거나 등
		 * -편집을 할 수 있는 텍스트 구성 요소!
		 * -검색창, 아이디, 댓글창 
		 */
		

		//CheckBox(선택창,한번에 여러개 체크)
		//라디오버튼 -여러개의 옵션 중에 하나만 선택할 수 있는 라디오버튼,한번에 하나 체크
		
		
	}

}
