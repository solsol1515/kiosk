package kiosk;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelC extends JPanel{
	
	// 음료 버튼
	JButton saida05, saida125, coke05, coke125;

	MainTest parent;
	
	public PanelC (MainTest mainTest) {
		
		parent = mainTest; 
		
		// 음료 버튼 생성
		saida05 = new JButton();
		saida125 = new JButton();
		coke05 = new JButton();
		coke125 = new JButton();
		
		addLayout();
		eventProc();
	}
	
	void addLayout() {
		
		// 음료 버튼의 배치를 Grid로 하기
		setLayout(new GridLayout(2,2));
		
		// 콜라 0.5L를 화면에 추가
		add(coke05);
			// 콜라의 이름과 가격이 텍스트로 입력
		coke05.setText("콜라 0.5L (1,500원)");
//		coke05.setFont(new Font("궁서 보통", Font.PLAIN, 15));
			// 텍스트의 위치를 중앙 아래로 설정
		coke05.setVerticalTextPosition(JButton.BOTTOM);
		coke05.setHorizontalTextPosition(JButton.CENTER);
			// 버튼 안에 이미지 삽입
		ImageIcon icon1 = new ImageIcon("src/kiosk/imgs/coke(0.5L).jpg");
		Image img1 = icon1.getImage();
				// 화면에 맞게 이미지 크기 조절
		Image changeImg1 = img1.getScaledInstance(330, 330, Image.SCALE_SMOOTH);
		coke05.setIcon(new ImageIcon(changeImg1));
			// 화면 바탕에 하얀색을 입힘
		coke05.setBackground(Color.WHITE);
		
		// 콜라 1.25L를 화면에 추가
		add(coke125);
			// 콜라의 이름과 가격이 텍스트로 입력
		coke125.setText("콜라 1.25L (2,500원)");
			// 텍스트의 위치를 중앙 아래로 설정
		coke125.setVerticalTextPosition(JButton.BOTTOM);
		coke125.setHorizontalTextPosition(JButton.CENTER);
			// 버튼 안에 이미지 삽입
		ImageIcon icon2 = new ImageIcon("src/kiosk/imgs/coke(1.25L).jpg");
		Image img2 = icon2.getImage();
				// 화면에 맞게 이미지 크기 조절
		Image changeImg2 = img2.getScaledInstance(330, 330, Image.SCALE_SMOOTH);
		coke125.setIcon(new ImageIcon(changeImg2));
			// 화면 바탕에 하얀색을 입힘
		coke125.setBackground(Color.WHITE);
		
		// 콜라 1.25L를 화면에 추가
		add(saida05);
			// 콜라의 이름과 가격이 텍스트로 입력
		saida05.setText("사이다 0.5L (1,500원)");
			// 텍스트의 위치를 중앙 아래로 설정
		saida05.setVerticalTextPosition(JButton.BOTTOM);
		saida05.setHorizontalTextPosition(JButton.CENTER);
			// 버튼 안에 이미지 삽입
		ImageIcon icon3 = new ImageIcon("src/kiosk/imgs/saida(0.5L).jpg");
		Image img3 = icon3.getImage();
				// 화면에 맞게 이미지 크기 조절
		Image changeImg3 = img3.getScaledInstance(330, 330, Image.SCALE_SMOOTH);
		saida05.setIcon(new ImageIcon(changeImg3));
			// 화면 바탕에 하얀색을 입힘
		saida05.setBackground(Color.WHITE);
		
		// 콜라 1.25L를 화면에 추가
		add(saida125);
			// 콜라의 이름과 가격이 텍스트로 입력
		saida125.setText("사이다 1.25L (2,500원)");
			// 텍스트의 위치를 중앙 아래로 설정
		saida125.setVerticalTextPosition(JButton.BOTTOM);
		saida125.setHorizontalTextPosition(JButton.CENTER);
			// 버튼 안에 이미지 삽입
		ImageIcon icon4 = new ImageIcon("src/kiosk/imgs/saida(1.25L).jpg");
		Image img4 = icon4.getImage();
				// 화면에 맞게 이미지 크기 조절
		Image changeImg4 = img4.getScaledInstance(330, 330, Image.SCALE_SMOOTH);
		saida125.setIcon(new ImageIcon(changeImg4));
			// 화면 바탕에 하얀색을 입힘
		saida125.setBackground(Color.WHITE);
		
	}
	
	void eventProc() {
		
		 coke05.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            parent.taMenu.setText(parent.taMenu.getText() + coke05.getText() + "\n");
	            parent.sum += 1500;
	            parent.taCost.setText(String.valueOf(parent.sum) + "원");
	         }   // end of ActionListener
	      });   // end of addActionListener
	      
	      coke125.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            parent.taMenu.setText(parent.taMenu.getText() + coke125.getText() + "\n");
	            parent.sum += 2500;
	            parent.taCost.setText(String.valueOf(parent.sum) + "원");
	         }   // end of ActionListener
	      });   // end of addActionListener
	      
	      saida05.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            parent.taMenu.setText(parent.taMenu.getText() + saida05.getText() + "\n");
	            parent.sum += 1500;
	            parent.taCost.setText(String.valueOf(parent.sum) + "원");
	         }   // end of ActionListener
	      });   // end of addActionListener
	      
	      saida125.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            parent.taMenu.setText(parent.taMenu.getText() + saida125.getText() + "\n");
	            parent.sum += 2500;
	            parent.taCost.setText(String.valueOf(parent.sum) + "원");
	         }   // end of ActionListener
	      });   // end of addActionListener
		
	}
}