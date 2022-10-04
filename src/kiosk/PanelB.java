package kiosk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelB extends JPanel{

   // 사이드 버튼 생성 및 아이콘 생성
   JButton aBtn = new JButton(new ImageIcon("src\\kiosk\\imgs\\떡볶이.jpg"));    // 떡볶이
   JButton bBtn = new JButton(new ImageIcon("src\\kiosk\\imgs\\모짜감자.jpg"));  // 모짜감자
   JButton cBtn = new JButton(new ImageIcon("src\\kiosk\\imgs\\치즈볼.jpg"));   // 치즈볼
   JButton dBtn = new JButton(new ImageIcon("src\\kiosk\\imgs\\파인샤벳.jpg"));  // 파인샤벳

   // 멤버변수 선언
   MainTest parent;   

   public PanelB (MainTest mainTest) {
      parent = mainTest; 

      addLayout();
      eventProc();

   } // end of panelB()


   // 화면 구성 및 출력
   void addLayout() {
      setLayout(new BorderLayout());
      JPanel bCenter = new JPanel();           // 패널 생성
      bCenter.setLayout(new GridLayout(2, 2)); // 2열 2행 생성

      // (메뉴탭) 그리드 안에 버튼 붙이기 
      // 떡볶이
      bCenter.add(aBtn);                        // 패널에 aBtn(떡볶이) 버튼 추가
      aBtn.setText("떡볶이 (4,500원)");                // 메뉴명, 금액 버튼에 표시
      aBtn.setHorizontalTextPosition(JButton.CENTER); // 버튼 센터에 이미지
      aBtn.setVerticalTextPosition(JButton.BOTTOM);   // 버튼 아래에 메뉴명
      aBtn.setBackground(Color.WHITE);            // 배경색을 하얀색으로 설정

      // 모짜감자
      bCenter.add(bBtn);                        // 패널에 bBtn(모짜감자) 버튼 추가
      bBtn.setText("모짜감자 (4,000원)");             // 메뉴명, 금액 버튼에 표시
      bBtn.setHorizontalTextPosition(JButton.CENTER); // 버튼 센터에 이미지
      bBtn.setVerticalTextPosition(JButton.BOTTOM);   // 버튼 아래에 메뉴명
      bBtn.setBackground(Color.WHITE);            // 배경색을 하얀색으로 설정

      // 치즈볼
      bCenter.add(cBtn);                        // 패널에 cBtn(치즈볼) 버튼 추가
      cBtn.setText("치즈볼 (4,000원)");               // 메뉴명, 금액 버튼에 표시
      cBtn.setHorizontalTextPosition(JButton.CENTER);   // 버튼 센터에 이미지
      cBtn.setVerticalTextPosition(JButton.BOTTOM);   // 버튼 아래에 메뉴명
      cBtn.setBackground(Color.WHITE);            // 배경색을 하얀색으로 설정

      // 파인샤벳
      bCenter.add(dBtn);                        // 패널에 dBtn(퍄인샤벳) 버튼 추가
      dBtn.setText("파인샤벳 (4,500원)");             // 메뉴명, 금액 버튼에 표시
      dBtn.setHorizontalTextPosition(JButton.CENTER);   // 버튼 센터에 이미지
      dBtn.setVerticalTextPosition(JButton.BOTTOM);   // 버튼 아래에 메뉴명
      dBtn.setBackground(Color.WHITE);            // 배경색을 하얀색으로 설정

      add(bCenter, BorderLayout.CENTER);

   } // end of addLayout()


   void eventProc() {
      // 메뉴 버튼 눌렀을 때
      // 'aBtn' 버튼을 눌렀을 때
      aBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            parent.taMenu.setText(parent.taMenu.getText() + aBtn.getText() + "\n");
            parent.sum += 4500;
	        parent.tfCost.setText(String.valueOf(parent.sum) + "원");
         }    // end of ActionEvent()
      });    // end of ActionListener()

      // 'bBtn' 버튼을 눌렀을 때
      bBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            parent.taMenu.setText(parent.taMenu.getText() + bBtn.getText() + "\n");
            parent.sum += 4000;
	        parent.tfCost.setText(String.valueOf(parent.sum) + "원");
         }    // end of ActionEvent()
      });      // end of ActionListener()

      // 'cBtn' 버튼을 눌렀을 때
      cBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            parent.taMenu.setText(parent.taMenu.getText() + cBtn.getText() + "\n");
            parent.sum += 4000;
	        parent.tfCost.setText(String.valueOf(parent.sum) + "원");
         }   // end of ActionEvent()
      });      // end of ActionListener()

      // 'dBtn' 버튼을 눌렀을 때
      dBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            parent.taMenu.setText(parent.taMenu.getText() + dBtn.getText() + "\n");
            parent.sum += 4500;
	        parent.tfCost.setText(String.valueOf(parent.sum) + "원");
         }   // end of ActionEvent()
      });    // end of ActionListener()


   } // end of eventProc()


}