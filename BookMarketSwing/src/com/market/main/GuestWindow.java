package com.market.main;

import javax.swing.*;
import java.awt.*;

public class GuestWindow extends JFrame {

	//그래픽 프레임창의 기본설정은 생성자 안에다가 설정
	public GuestWindow(String title, int x, int y, int width, int height) {

		initContainer(title, x, y, width, height);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(new ImageIcon("./images/shop.png").getImage());
	}

	private void initContainer(String title, int x, int y, int width, int height) {
		//컴포넌트(버튼,텍스트필드,라벨,이미지
		setTitle(title);
		setBounds(x, y, width, height); //프레임의 위치와 크기 설정 
		setLayout(null); //프레임 레이아웃 설정(미설정 상태)

		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD, 15); //글꼴설정 

		//Dimension : 너비와 높이를 필드로 가지고 있는 클래스 
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//창 위치 (화면의 넓이, 높이)
		setLocation((screenSize.width - 1000) / 2, (screenSize.height - 750) / 2);

		//여러 컴포넌트 올리는 보조프레임 생성 
		JPanel userPanel = new JPanel();
		userPanel.setBounds(0, 100, 1000, 256);
		
		//아이콘 (고양이 가져와서 아이콘 객체 생성)
				//상대경로 . 점으로 현재 폴더(기준: src로 잡고있음)
				//절대경로 : 드라이브 폴더주소 전체 
		ImageIcon imageIcon = new ImageIcon("./images/user.png");
		imageIcon.setImage(imageIcon.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH)); //가져온 이미지를 패널에 크기가 맞도록 이미지 수정 
		JLabel userLabel = new JLabel(imageIcon);
		userPanel.add(userLabel); 	//라벨 
		add(userPanel); //보조프레임 -> 메인프레임
//-----------------------------------------
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 350, 1000, 50);
		add(titlePanel);

		JLabel titleLabel = new JLabel("-- 고객 정보를 입력하세요 --");
		titleLabel.setFont(ft);
		titleLabel.setForeground(Color.BLUE); //글꼴 색상 
		titlePanel.add(titleLabel);
//-----------------------------------------
		JPanel namePanel = new JPanel();  //이름: 입력받는 text필드 //이름이랑 text 객체 각각 생성해서 namePanel 추가 
		namePanel.setBounds(0, 400, 1000, 50);
		add(namePanel);

		JLabel nameLabel = new JLabel("이   름 : ");
		nameLabel.setFont(ft);
		namePanel.add(nameLabel);

		JTextField nameField = new JTextField(10);
		nameField.setFont(ft);
		namePanel.add(nameField);
//-----------------------------------------
		JPanel phonePanel = new JPanel(); //연락처 //연락처 라벨 연락처 텍스트필드 생성해서 phonePanel 추가
		phonePanel.setBounds(0, 450, 1000, 50);
		add(phonePanel);

		JLabel phoneLabel = new JLabel("연락처 : ");
		phoneLabel.setFont(ft);
		phonePanel.add(phoneLabel);

		JTextField phoneField = new JTextField(10);
		phoneField.setFont(ft);
		phonePanel.add(phoneField);
//-----------------------------------------
		JPanel buttonPanel = new JPanel(); //버튼
		buttonPanel.setBounds(0, 500, 1000, 100);
		add(buttonPanel);

		JLabel buttonLabel = new JLabel("쇼핑하기", new ImageIcon("images/shop.png"), JLabel.LEFT);
		buttonLabel.setFont(ft);
		JButton enterButton = new JButton();
		enterButton.add(buttonLabel);
		buttonPanel.add(enterButton);

	}

	public static void main(String[] args) {
		new GuestWindow("고객 정보 입력", 0, 0, 1000, 750);
	}
}
