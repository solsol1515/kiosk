package kiosk;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainTest {

   JFrame f;                  // 프레임
   JButton bPay, bCancel;         // 결제, 취소 버튼
   JTextArea taMenu;            // 결제창(메뉴) 
   JTextField tfCost;            // 결제창(금액)
   JLabel jbTotal, jbOrder;         // 결제창의 라벨(금액의 합계, 주문 내역)
   
   int sum;               // 결제액
   
   // 패널
   PanelA panelA;            // 메인 메뉴 패널
   PanelB panelB;            // 사이드 메뉴 패널
   PanelC panelC;            // 음료 패널
   PanelD panelD;            // 주류 패널

   
   MainTest(){
      
      // * 프레임 생성
      f = new JFrame("Kiosk 주문창");
      
      // 결제와 취소 버튼을 생성
      bPay = new JButton("결제");
      bCancel = new JButton("취소");
      
      // 주문 내역과 결제액을 표시할 텍스트 객체 생성
      taMenu = new JTextArea("담은 메뉴\n");         // 메뉴를 담는 창 생성
      tfCost = new JTextField("결제 금액");         // 담은 메뉴의 금액의 합계를 표시할 창 생성

      // 결제액과 주문 내역의 라벨을 생성
      jbTotal = new JLabel("결제액");
      jbOrder = new JLabel("주문 내역");


      // 패널 생성 (패널 클래스와 연동하기 위해 여기에 배치)
      panelA = new PanelA(this);
      panelB = new PanelB(this);
      panelC = new PanelC(this);
      panelD = new PanelD(this);
      
   } // end of MainTest()
   
   // 필드의 객체를 배치하고 꾸미는 메소드
   void addLayout(){
      
      // 화면의 레이아웃 생성
      f.setLayout(new BorderLayout());
      
      // 메뉴탭 생성
      JTabbedPane tab = new JTabbedPane();
      tab.addTab("메인 메뉴", panelA);
      tab.addTab("사이드 메뉴", panelB);
      tab.addTab("음료", panelC);
      tab.addTab("주류", panelD);
      
      // 메뉴탭을 화면 중앙에 배치 (BorderLayout)
      f.add(tab, BorderLayout.CENTER);
      
      // 주문과 결제를 위한 공간을 하단에 배치
      JPanel pSouth = new JPanel(new BorderLayout());                     // BorderLayout 사용
      pSouth.setPreferredSize(new Dimension(0, 200));                     // 사이즈 확장
      f.add(pSouth, BorderLayout.SOUTH);                              // pSouth 패널을 하단에 배치
      
      // 결제액을 표시할 패널 (최하단)
      JPanel payView = new JPanel(new BorderLayout());
      payView.add(jbTotal, BorderLayout.WEST);                     // "결제액" 라벨         (최하단 오른쪽에 배치)
      payView.add(tfCost, BorderLayout.CENTER);                     // 금액의 합계가 입력될 창   (최하단 중앙에 배치)
      
      // 주문 내역을 표시할 패널 (하단 중앙)
      JPanel order = new JPanel(new BorderLayout());
      order.add(jbOrder, BorderLayout.NORTH);                        // "주문 내역" 라벨         (하단 위에 배치)
      order.add(taMenu, BorderLayout.CENTER);                        // 주문 내역이 입력될 창      (하단 중앙에 배치)
      order.add(payView, BorderLayout.SOUTH);                           // payView 패널을 최하단에 배치
      pSouth.add(order, BorderLayout.CENTER);                           // order 패널을 하단 중앙에 배치

      // 결제와 취소 버튼 패널 (하단 오른쪽)
      JPanel payZone = new JPanel(new GridLayout(2,1));
      payZone.add(bCancel);                                    // [취소] 버튼 추가
      payZone.add(bPay);                                       // [결제] 버튼 추가
      pSouth.add(payZone, BorderLayout.EAST);                           // payzone 패널을 하단 오른쪽에 배치

      // 객체의 크기 변화
      payZone.setPreferredSize(new Dimension(120, 0));               // [결제]와 [취소] 버튼의 크기 확장
      jbTotal.setPreferredSize(new Dimension(80, 0));                  // "결제액" 라벨을 조금 더 옆으로 늘림
      jbTotal.setHorizontalAlignment(JLabel.CENTER);                  // "결제액" 라벨 텍스트를 중앙으로 옮김
      jbOrder.setHorizontalAlignment(JLabel.CENTER);                  // "주문 내역" "결제액" 라벨 텍스트를 중앙으로 옮김

      // 결제액이 입력되도록 설정
      tfCost.setText(String.valueOf(sum) + "원");

      
      // 프레임의 기본 세팅
      f.setBounds(300, 100, 500, 1000);                     // 화면 크기 설정
      f.setVisible(true);                                 // 화면 가시화
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         // 오른쪽 상단의 X를 누르면 프로그램이 꺼지도록 설정
      
   } // addLayout()
   
   void eventProc() {
         
      // [취소] 버튼을 눌렀을 때 주문 내역과 결제액을 삭제
      bCancel.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            taMenu.setText("");
            tfCost.setText("");
            sum = 0;
         }   // end of ActionListener
      });   // end of addActionListener
      
      // [결제] 버튼 눌렀을 때 결제를 확인하는 창을 띄움
      bPay.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            int reply = JOptionPane.showConfirmDialog(null, "결제하시겠습니까?","결제창", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
               sum = 0;
               taMenu.setText("");
               tfCost.setText("");
               JOptionPane.showMessageDialog(null, "결제되었습니다.");
            } else {
               JOptionPane.showMessageDialog(null, "취소되었습니다.");
               sum = 0;
               taMenu.setText("");
               tfCost.setText("");
            }// end of 결제창 구문 Y/N
         }   // end of ActionListener
      });   // end of addActionListener

   } // end of eventProc()
   
   public static void main(String[] args) {

      MainTest test = new MainTest();
      test.addLayout();
      test.eventProc();
      
   } // end of main
   
}

