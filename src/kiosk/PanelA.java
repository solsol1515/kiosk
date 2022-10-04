package kiosk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelA extends JPanel{
	
	// 1. 메인메뉴 버튼
	JButton aBtn1 = new JButton(new ImageIcon("src\\kiosk\\imgs\\후라이드.jpg"));
	JButton aBtn2 = new JButton(new ImageIcon("src\\kiosk\\imgs\\양념.jpg"));
	JButton aBtn3 = new JButton(new ImageIcon("src\\kiosk\\imgs\\간장.png"));
	JButton aBtn4 = new JButton(new ImageIcon("src\\kiosk\\imgs\\맵슐랭.jpg"));
	JButton aBtn5 = new JButton(new ImageIcon("src\\kiosk\\imgs\\양파.jpg"));
	JButton aBtn6 = new JButton(new ImageIcon("src\\kiosk\\imgs\\치요링.jpg"));
	
	MainTest parent;
	
	public PanelA (MainTest mainTest) {
		parent = mainTest;
		
		setBackground(new Color(250, 240, 120));
		
		addLayout();
		eventProc();
		
	} // end of PanelA()
	
	// 3. 화면 구성 및 화면 출력
	void addLayout() {
		setLayout(new BorderLayout());
		
		JPanel aCenter = new JPanel(); // 패널 생성
		
		aCenter.setLayout(new GridLayout(3, 2)); // 3열 2행의 그리드레이아웃으로 배치
		
		// (메뉴탭)그리드 안에 버튼 붙이기 ↓
		aCenter.add(aBtn1); // 패널에 버튼 추가하기(후라이드치킨)
			aBtn1.setHorizontalTextPosition(JButton.CENTER); // 버튼 중앙에 사진 붙이기
			aBtn1.setVerticalTextPosition(JButton.BOTTOM);	// 버튼 아래에 메뉴명 붙이기
			aBtn1.setText("후라이드치킨 (18,000원)"); // 메뉴명과 가격 출력 버튼 붙이기
			aBtn1.setBackground(Color.WHITE); // 배경색 흰색으로 변경하기
			
		aCenter.add(aBtn2); // 패널에 버튼 추가하기(양념치킨)
			aBtn2.setHorizontalTextPosition(JButton.CENTER); // 버튼 중앙에 사진 붙이기
			aBtn2.setVerticalTextPosition(JButton.BOTTOM); // 버튼 아래에 메뉴명 붙이기
			aBtn2.setText("양념치킨 (19,000원)"); // 메뉴명과 가격 출력 버튼 붙이기
			aBtn2.setBackground(Color.WHITE); // 배경색 흰색으로 변경하기
			
		aCenter.add(aBtn3); // 패널에 버튼 추가하기(간장치킨)
			aBtn3.setHorizontalTextPosition(JButton.CENTER); // 버튼 중앙에 사진 붙이기
			aBtn3.setVerticalTextPosition(JButton.BOTTOM); // 버튼 아래에 메뉴명 붙이기 
			aBtn3.setText("간장치킨 (19,000원)"); // 메뉴명과 가격 출력 버튼 붙이기
			aBtn3.setBackground(Color.WHITE); // 배경색 흰색으로 변경하기
			
		aCenter.add(aBtn4); // 패널에 버튼 추가하기(맵슐랭)
			aBtn4.setHorizontalTextPosition(JButton.CENTER); // 버튼 중앙에 사진 붙이기
			aBtn4.setVerticalTextPosition(JButton.BOTTOM); // 버튼 아래에 메뉴명 붙이기
			aBtn4.setText("맵슐랭치킨 (20,000원)"); // 메뉴명과 가격 출력 버튼 붙이기
			aBtn4.setBackground(Color.WHITE); // 배경색 흰색으로 변경하기
			
		aCenter.add(aBtn5); // 패널에 버튼 추가하기(크리미양파치킨)
			aBtn5.setHorizontalTextPosition(JButton.CENTER); // 버튼 중앙에 사진 붙이기
			aBtn5.setVerticalTextPosition(JButton.BOTTOM); // 버튼 아래에 메뉴명 붙이기
			aBtn5.setText("크리미양파치킨 (21,000원)"); // 메뉴명과 가격 출력 버튼 붙이기
			aBtn5.setBackground(Color.WHITE); // 배경색 흰색으로 변경하기
			
		aCenter.add(aBtn6); // 패널에 버튼 추가하기(치요링치킨)
			aBtn6.setHorizontalTextPosition(JButton.CENTER); // 버튼 중앙에 사진 붙이기
			aBtn6.setVerticalTextPosition(JButton.BOTTOM); // 버튼 아래에 메뉴명 붙이기
			aBtn6.setText("치요링치킨 (21,000원)"); // 메뉴명과 가격 출력 버튼 붙이기
			aBtn6.setBackground(Color.WHITE); // 배경색 흰색으로 변경하기
			
		add(aCenter, BorderLayout.CENTER); // 프레임에 패널 붙이기
		setBackground(Color.WHITE);
		// 하단 결제창 붙이기 
			
	} // end of addLayout()
	
	// 4. 이벤트 처리(주문내역 Area에 담기게)
	void eventProc() {
		// 원하는 메뉴 담고 장바구니 담을 때)
		aBtn1.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				parent.taMenu.setText(parent.taMenu.getText() + aBtn1.getText() + "\n"); 
				parent.sum += 18000;
		        parent.tfCost.setText(String.valueOf(parent.sum) + "원");
			} // end of actionPerformed	
		} ); // end of addActionListener()
		
		aBtn2.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				parent.taMenu.setText(parent.taMenu.getText() + aBtn2.getText() + "\n"); 
				parent.sum += 19000;
		        parent.tfCost.setText(String.valueOf(parent.sum) + "원");
			} // end of actionPerformed	
		} ); // end of addActionListener()
		
		aBtn3.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				parent.taMenu.setText(parent.taMenu.getText() + aBtn3.getText() + "\n");
				parent.sum += 19000;
		        parent.tfCost.setText(String.valueOf(parent.sum) + "원");
			} // end of actionPerformed	
		} ); // end of addActionListener()
		
		aBtn4.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				parent.taMenu.setText(parent.taMenu.getText() + aBtn4.getText() + "\n");
				parent.sum += 20000;
		        parent.tfCost.setText(String.valueOf(parent.sum) + "원");
			} // end of actionPerformed	
		} ); // end of addActionListener()
		
		aBtn5.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				parent.taMenu.setText(parent.taMenu.getText() + aBtn5.getText() + "\n");
				parent.sum += 21000;
		        parent.tfCost.setText(String.valueOf(parent.sum) + "원");
			} // end of actionPerformed	
		} ); // end of addActionListener()
		
		aBtn6.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				parent.taMenu.setText(parent.taMenu.getText() + aBtn6.getText() + "\n");
				parent.sum += 21000;
		        parent.tfCost.setText(String.valueOf(parent.sum) + "원");
			} // end of actionPerformed	
		} ); // end of addActionListener()
		
	} // end of eventProc()
}	
	