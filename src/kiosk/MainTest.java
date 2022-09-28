package kiosk;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class MainTest {

	JFrame f;		   // 프레임
	JButton btn;	   // 버튼
	JLabel lab;		   // 라벨
	JTextField tfMenu; // 결제창(메뉴) 
	JTextField tfCost; // 결제창(금액) 
	
	PanelA panelA;
	PanelB panelB;
	PanelC panelC;
	PanelD panelD;
	
	MainTest(){
		// * 프레임
		f = new JFrame("Kiosk 주문창");
		
		// * (상단) 패널
		panelA = new PanelA(this);
		panelB = new PanelB(this);
		panelC = new PanelC(this);
		panelD = new PanelD(this);
		
		// * 메뉴
		//tfMenu = new JTextField("결제창");
		//tfCost = new JTextField("결제창");
		// * 주문 메뉴 입력창
		
	} // end of MainTest
	
	void addLayout(){
		
		f.setLayout(new BorderLayout());
		
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("메인 메뉴", panelA);
		tab.addTab("사이드 메뉴", panelB);
		tab.addTab("음료", panelC);
		tab.addTab("주류", panelD);
		
		f.setBounds(300, 100, 500, 800);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	} // end of addLayout()
	
	void eventProc() {
		
	} // end of eventProc()
	
	public static void main(String[] args) {

		MainTest test = new MainTest();
		test.addLayout();
		test.eventProc();
		
	} // end of main
	

}


