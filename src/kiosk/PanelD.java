package kiosk;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelD extends JPanel{

	JButton btnfresh= new JButton("참이슬 (3,000원)");
	JButton btnlotte= new JButton("처음처럼 (3,000원)");
	JButton btnterra= new JButton("테라 (4,000원)");
	JButton btncass= new JButton("카스 (4,000원)");
	JButton btncoldbeer= new JButton("저온숙성맥주 (4,000원)");
	JButton chingthaao= new JButton("칭따오 (4,000원)");
	
	MainTest parent;
	
	public PanelD (MainTest mainTest) {
		
		parent = mainTest; 
		
		addLayout();
		eventProc();
		
	}
	
	void addLayout() {
		
		setLayout(new GridLayout(3,2));
		
//		setorder.addTab("저장된 주문" , panelE);
		
		// 참이슬 버튼 설정
		add(btnfresh);
			// 텍스트 위치 조정
		btnfresh.setVerticalTextPosition(JButton.BOTTOM);
		btnfresh.setHorizontalTextPosition(JButton.CENTER);
			// 이미지 삽입
		ImageIcon icon1 = new ImageIcon("src/kiosk/imgs/참이슬.png");
		Image img1 = icon1.getImage();
			// 이미지 크기 지정
		Image changeImg1 = img1.getScaledInstance(55, 180, Image.SCALE_SMOOTH);
		btnfresh.setIcon(new ImageIcon(changeImg1));
			// 배경색을 하얀색으로 설정
		btnfresh.setBackground(Color.WHITE);
		
		// 처음처럼 버튼 설정
		add(btnlotte);
			// 텍스트 위치 조정
		btnlotte.setVerticalTextPosition(JButton.BOTTOM);
		btnlotte.setHorizontalTextPosition(JButton.CENTER);
			// 이미지 삽입
		ImageIcon icon2 = new ImageIcon("src/kiosk/imgs/처음처럼.jpg");
		Image img2 = icon2.getImage();
			// 이미지 크기 지정
		Image changeImg2 = img2.getScaledInstance(55, 180, Image.SCALE_SMOOTH);
		btnlotte.setIcon(new ImageIcon(changeImg2));
			// 배경색을 하얀색으로 설정
		btnlotte.setBackground(Color.WHITE);
		
		// 테라 버튼 설정
		add(btnterra);
			// 텍스트 위치 조정
		btnterra.setVerticalTextPosition(JButton.BOTTOM);
		btnterra.setHorizontalTextPosition(JButton.CENTER);
			// 이미지 삽입
		ImageIcon icon3 = new ImageIcon("src/kiosk/imgs/테라.jpg");
		Image img3 = icon3.getImage();
			// 이미지 크기 지정
		Image changeImg3 = img3.getScaledInstance(100, 180, Image.SCALE_SMOOTH);
		btnterra.setIcon(new ImageIcon(changeImg3));
			// 배경색을 하얀색으로 설정
		btnterra.setBackground(Color.WHITE);
		
		// 카스 버튼 설정
		add(btncass);
			// 텍스트 위치 조정
		btncass.setVerticalTextPosition(JButton.BOTTOM);
		btncass.setHorizontalTextPosition(JButton.CENTER);
			// 이미지 삽입
		ImageIcon icon4 = new ImageIcon("src/kiosk/imgs/카스.jpg");
		Image img4 = icon4.getImage();
			// 이미지 크기 지정
		Image changeImg4 = img4.getScaledInstance(55, 180, Image.SCALE_SMOOTH);
		btncass.setIcon(new ImageIcon(changeImg4));
			// 배경색을 하얀색으로 설정
		btncass.setBackground(Color.WHITE);
		
		// 생맥주 버튼 설정
		add(btncoldbeer);
			// 텍스트 위치 조정
		btncoldbeer.setVerticalTextPosition(JButton.BOTTOM);
		btncoldbeer.setHorizontalTextPosition(JButton.CENTER);
			// 이미지 삽입
		ImageIcon icon5 = new ImageIcon("src/kiosk/imgs/생맥주.png");
		Image img5 = icon5.getImage();
			// 이미지 크기 지정
		Image changeImg5 = img5.getScaledInstance(100, 180, Image.SCALE_SMOOTH);
		btncoldbeer.setIcon(new ImageIcon(changeImg5));
			// 배경색을 하얀색으로 설정
		btncoldbeer.setBackground(Color.WHITE);
		
		// 칭따오 버튼 설정
		add(chingthaao);
			// 텍스트 위치 조정
		chingthaao.setVerticalTextPosition(JButton.BOTTOM);
		chingthaao.setHorizontalTextPosition(JButton.CENTER);
			// 이미지 삽입
		ImageIcon icon6 = new ImageIcon("src/kiosk/imgs/칭따오.jpg");
		Image img6 = icon6.getImage();
			// 이미지 크기 지정
		Image changeImg6 = img6.getScaledInstance(55, 180, Image.SCALE_SMOOTH);
		chingthaao.setIcon(new ImageIcon(changeImg6));
			// 배경색을 하얀색으로 설정
		chingthaao.setBackground(Color.WHITE);
		
	}
	
	void eventProc() {
		
		btnfresh.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            parent.taMenu.setText(parent.taMenu.getText() + btnfresh.getText() + "\n");
	            parent.sum += 3000;
	            parent.taCost.setText(String.valueOf(parent.sum) + "원");
	         }   // end of ActionListener
	      });   // end of addActionListener
	      
	      btnlotte.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            parent.taMenu.setText(parent.taMenu.getText() + btnlotte.getText() + "\n");
	            parent.sum += 3000;
	            parent.taCost.setText(String.valueOf(parent.sum) + "원");
	         }   // end of ActionListener
	      });   // end of addActionListener
	      
	      btnterra.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            parent.taMenu.setText(parent.taMenu.getText() + btnterra.getText() + "\n");
	            parent.sum += 4000;
	            parent.taCost.setText(String.valueOf(parent.sum) + "원");
	         }   // end of ActionListener
	      });   // end of addActionListener
	      
	      btncass.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            parent.taMenu.setText(parent.taMenu.getText() + btncass.getText() + "\n");
	            parent.sum += 4000;
	            parent.taCost.setText(String.valueOf(parent.sum) + "원");
	         }   // end of ActionListener
	      });   // end of addActionListener
	      
	      btncoldbeer.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            parent.taMenu.setText(parent.taMenu.getText() + btncoldbeer.getText() + "\n");
	            parent.sum += 4000;
	            parent.taCost.setText(String.valueOf(parent.sum) + "원");
	         }   // end of ActionListener
	      });   // end of addActionListener
	      
	      chingthaao.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            parent.taMenu.setText(parent.taMenu.getText() + chingthaao.getText() + "\n");
	            parent.sum += 4000;
	            parent.taCost.setText(String.valueOf(parent.sum) + "원");
	         }   // end of ActionListener
	      });   // end of addActionListener

		
	}
}