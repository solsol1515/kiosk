package kiosk;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainTest {

	JFrame f;		  			 // 프레임
	JButton bPay, bCancel;		 // 결제, 취소 버튼
	JLabel lab;		  			 // 라벨
	JTextArea taMenu; 			 // 결제창(메뉴) 
	JTextField taCost; 			 // 결제창(금액)
	JLabel total, order; 		 //
	
	// 결제액
	int sum;
	
	PanelA panelA;
	PanelB panelB;
	PanelC panelC;
	PanelD panelD;
	
	MainTest(){
		// * 프레임
		f = new JFrame("Kiosk 주문창");
		
		// 결제와 취소 버튼을 생성
		bPay = new JButton("결제");
		bCancel = new JButton("취소");
		
		taMenu = new JTextArea("담은 메뉴\n"); // 메뉴 담는 창 생성
		taCost = new JTextField("결제 금액"); // 담은 메뉴 금액 표시 창 생성
		
		// 결제 총액 라벨을 생성
		total = new JLabel("결제액");
		
		// * (상단) 패널
		panelA = new PanelA(this);
		panelB = new PanelB(this);
		panelC = new PanelC(this);
		panelD = new PanelD(this);
	
		
	} // end of MainTest
	
	void addLayout(){
		
		f.setLayout(new BorderLayout());
		
		// 메뉴탭 만들기
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("메인 메뉴", panelA);
		tab.addTab("사이드 메뉴", panelB);
		tab.addTab("음료", panelC);
		tab.addTab("주류", panelD);
		
		// 메뉴탭 붙이기
		f.add(tab, BorderLayout.CENTER);
		
		// 주문 메뉴 및 결제 금액 창
		JPanel order = new JPanel();
		order.add(taMenu, BorderLayout.EAST);
		order.add(taCost, BorderLayout.SOUTH);
		f.add(order, BorderLayout.SOUTH);
		
		// 오른쪽 패널 (목적: 주문, 결제)
		JPanel pSouth = new JPanel(new BorderLayout());
			pSouth.setPreferredSize(new Dimension(0, 200));
			
		JPanel payZone = new JPanel(new GridLayout(2,1));
			payZone.add(bCancel);
			payZone.add(bPay);
			payZone.setPreferredSize(new Dimension(120, 0));
			pSouth.add(payZone, BorderLayout.EAST);

		pSouth.add(taMenu, BorderLayout.CENTER);

		JPanel payView = new JPanel(new BorderLayout());
			payView.add(total, BorderLayout.WEST);
			payView.add(taCost, BorderLayout.CENTER);

		pSouth.add(payView, BorderLayout.SOUTH);

		f.add(pSouth, BorderLayout.SOUTH);
		
		// 결제창에 결제액이 들어감
	    taCost.setText(String.valueOf(sum) + "원");


		f.setBounds(300, 100, 500, 1000);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	} // end of addLayout()
	
	void eventProc() {
		// 결제 버튼 눌렀을 때 최종 결제금액이 뜨게 팝업 만들기?
		bPay.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				

			} // end of actionPerformed		

		} ); // end of add.ActionListener()
		
		bCancel.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            taMenu.setText("");
	            taCost.setText("");
	            sum = 0;
	         }   // end of ActionListener
	      });   // end of addActionListener

		bPay.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            int reply = JOptionPane.showConfirmDialog(null, "결제하시겠습니까?","결제창", JOptionPane.YES_NO_OPTION);
	            if (reply == JOptionPane.YES_OPTION) {
	               sum = 0;
	               taMenu.setText("");
	               taCost.setText("");
	               JOptionPane.showMessageDialog(null, "결제되었습니다.");
	            } else {
	               JOptionPane.showMessageDialog(null, "취소되었습니다.");
	               sum = 0;
	               taMenu.setText("");
	               taCost.setText("");
	            }// 결제창 구문 Y/N
	         }   // end of ActionListener
	      });   // end of addActionListener
		
	} // end of eventProc()
	
	public static void main(String[] args) {

		MainTest test = new MainTest();
		test.addLayout();
		test.eventProc();
		
	} // end of main
	
}
