package kiosk;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelA extends JPanel{
	// 1. 멤버 변수 선언
	
	JButton aBtn1 = new JButton("후라이드치킨", new ImageIcon("src\\kiosk\\images\\후라이드.PNG"));
	JButton aBtn2 = new JButton("양념치킨", new ImageIcon("src\\kiosk\\images\\양념.PNG"));
	JButton aBtn3 = new JButton("간장치킨", new ImageIcon("src\\kiosk\\images\\간장.PNG"));
	JButton aBtn4 = new JButton("맵슐랭치킨", new ImageIcon("src\\kiosk\\images\\맵슐랭.PNG"));
	JButton aBtn5 = new JButton("크리미양파치킨", new ImageIcon("src\\kiosk\\images\\크리미양파.PNG"));
	JButton aBtn6 = new JButton("치요링치킨", new ImageIcon("src\\kiosk\\images\\치요링.PNG"));
	
	MainTest parent;
	
	public PanelA (MainTest mainTest) {
		parent = mainTest;
		
		addLayout();
		eventProc();
		
	} // end of PanelA()
	
	// 3. 화면 구성 및 화면 출력
	void addLayout() {
		setLayout(new BorderLayout());
		
		// 가운데 Panel 붙이기(메뉴)
		
		JPanel aCenter = new JPanel(); 
		
		aCenter.setLayout(new GridLayout(3, 2)); // 3열 2행의 레이아웃 생성
		aCenter.add(aBtn1); // 그리드 안에 버튼 붙이기 ↓
			aBtn1.setHorizontalTextPosition(JButton.CENTER);
			aBtn1.setVerticalTextPosition(JButton.BOTTOM);
		aCenter.add(aBtn2); 
			aBtn2.setHorizontalTextPosition(JButton.CENTER);
			aBtn2.setVerticalTextPosition(JButton.BOTTOM);
		aCenter.add(aBtn3); 
			aBtn3.setHorizontalTextPosition(JButton.CENTER);
			aBtn3.setVerticalTextPosition(JButton.BOTTOM);
		aCenter.add(aBtn4); 
			aBtn4.setHorizontalTextPosition(JButton.CENTER);
			aBtn4.setVerticalTextPosition(JButton.BOTTOM);
		aCenter.add(aBtn5);
			aBtn5.setHorizontalTextPosition(JButton.CENTER);
			aBtn5.setVerticalTextPosition(JButton.BOTTOM);
		aCenter.add(aBtn6); 
			aBtn6.setHorizontalTextPosition(JButton.CENTER);
			aBtn6.setVerticalTextPosition(JButton.BOTTOM);
		add(aCenter, BorderLayout.CENTER);
		
		// 하단 결제창 붙이기 
			
	} // end of addLayout()
	// 4. 이벤트 처리
	void eventProc() {
		
	}
}
