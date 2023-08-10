package com.market.main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Menu;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame{
	
	JPanel mMenuJPanel = null;

	public MainWindow(String title, int x, int y, int width, int height) {
		
		initContainer(title,x,y,width,height);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void initContainer(String title, int x, int y, int width, int height) {
		setTitle(title);
		setBounds(x, y, width, height);
		setLayout(null);

		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD, 15);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - 1000) / 2, (screenSize.height - 750) / 2);

		//메뉴 버튼 표시를 위한 보조프레임 설정 및 출력
		mMenuJPanel = new JPanel();
		//한번에 x, y, width, height설정
		//setSize(x,y) : 컴포넌트들의 위치 변경
		//setLocation(width, height) : 창의 너비 높이만 변경 
		
		mMenuJPanel.setBounds(x, y, width, height);
		
		
		mMenuJPanel.setLayout(new java.awt.FlowLayout());
	
		
		// 첫번째  아이콘 1 고객 정보 확인하기 버튼 
				// 두번째  아이콘 2 장바구니 상품 목록 보기 버튼
				// 세번째  아이콘 3 장바구니 비우기 버튼
				// 네번째        4  장바구니 항목 추가하기
				//			   5 장바구니 항목 수량 줄이기
				//             6 장바구니 항목 삭제 
				//             7 주문하기
				//             8 종료
				//             9 관리자 
		
	
		
		
	}
	
}
