package kiosk;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelD extends JPanel{
   
   JButton[] aBtn;
      String[] menu;
      String[] image;
      int[] price;

   MainTest parent;
   
   public PanelD (MainTest mainTest) {
      
      parent = mainTest; 
      
      aBtn = new JButton[6];
         menu = new String[] {"참이슬", "처음처럼", "테라", "카스", "생맥주", "칭따오"};
         price = new int[] {3000, 3000, 4000, 4000, 4000, 4000};
         image = new String[] {"src/kiosk/imgs/참이슬.png", "src/kiosk/imgs/처음처럼.jpg", "src/kiosk/imgs/테라.jpg", "src/kiosk/imgs/카스.jpg", "src/kiosk/imgs/생맥주.png", "src/kiosk/imgs/칭따오.jpg"};

      // 메뉴 버튼에 이미지 삽입
         for (int i=0 ; i<aBtn.length ; i++) {
            aBtn[i] = new JButton(menu[i]+ " (" + price[i] + "원)");
         }
      
      addLayout();
      eventProc();
   }
   
   void addLayout() {
      
      setLayout(new GridLayout(3,2));
      
      for (int i=0 ; i<aBtn.length ; i++) {
            add(aBtn[i]);

            aBtn[i].setVerticalTextPosition(JButton.BOTTOM);            // 텍스트의 위치를 중앙 아래로 설정
            aBtn[i].setHorizontalTextPosition(JButton.CENTER);

            ImageIcon icon = new ImageIcon(image[i]);
            Image img1 = icon.getImage();
            Image changeImg1 = img1.getScaledInstance(100, 150, Image.SCALE_SMOOTH);   // 화면에 맞게 이미지 크기 조절
            aBtn[i].setIcon(new ImageIcon(changeImg1));                           // 버튼 안에 이미지 삽입

            aBtn[i].setBackground(Color.WHITE);               // 화면 바탕에 하얀색을 입힘
         }
      
   }
   
   void eventProc() {
      
      aBtn[0].addActionListener(new ActionListener() {   
            public void actionPerformed(ActionEvent e) {
               JButton evt = (JButton) e.getSource();                                 // Btn[i]의 i가 작동이 불가능해서 e.getSource를 활용
               parent.taMenu.setText(parent.taMenu.getText() + evt.getText() + "\n");          // 주문 내역이 누적되도록 설정
               parent.sum += 3000;                                             // 해당 음식의 가격을 Sum에 추가
               parent.tfCost.setText(String.valueOf(parent.sum) + "원");                  // "몇 원"이라고 결제액 창에 표시
            } // end of actionPerformed   
         } ); // end of addActionListener()
         
         aBtn[1].addActionListener(new ActionListener() {   
             public void actionPerformed(ActionEvent e) {
                JButton evt = (JButton) e.getSource();                                 // Btn[i]의 i가 작동이 불가능해서 e.getSource를 활용
                parent.taMenu.setText(parent.taMenu.getText() + evt.getText() + "\n");          // 주문 내역이 누적되도록 설정
                parent.sum += 3000;                                             // 해당 음식의 가격을 Sum에 추가
                parent.tfCost.setText(String.valueOf(parent.sum) + "원");                  // "몇 원"이라고 결제액 창에 표시
             } // end of actionPerformed   
          } ); // end of addActionListener()
         
         aBtn[2].addActionListener(new ActionListener() {   
             public void actionPerformed(ActionEvent e) {
                JButton evt = (JButton) e.getSource();                                 // Btn[i]의 i가 작동이 불가능해서 e.getSource를 활용
                parent.taMenu.setText(parent.taMenu.getText() + evt.getText() + "\n");          // 주문 내역이 누적되도록 설정
                parent.sum += 4000;                                             // 해당 음식의 가격을 Sum에 추가
                parent.tfCost.setText(String.valueOf(parent.sum) + "원");                  // "몇 원"이라고 결제액 창에 표시
             } // end of actionPerformed   
          } ); // end of addActionListener()
         
         aBtn[3].addActionListener(new ActionListener() {   
             public void actionPerformed(ActionEvent e) {
                JButton evt = (JButton) e.getSource();                                 // Btn[i]의 i가 작동이 불가능해서 e.getSource를 활용
                parent.taMenu.setText(parent.taMenu.getText() + evt.getText() + "\n");          // 주문 내역이 누적되도록 설정
                parent.sum += 4000;                                             // 해당 음식의 가격을 Sum에 추가
                parent.tfCost.setText(String.valueOf(parent.sum) + "원");                  // "몇 원"이라고 결제액 창에 표시
             } // end of actionPerformed   
          } ); // end of addActionListener()
         
         aBtn[4].addActionListener(new ActionListener() {   
             public void actionPerformed(ActionEvent e) {
                JButton evt = (JButton) e.getSource();                                 // Btn[i]의 i가 작동이 불가능해서 e.getSource를 활용
                parent.taMenu.setText(parent.taMenu.getText() + evt.getText() + "\n");          // 주문 내역이 누적되도록 설정
                parent.sum += 4000;                                             // 해당 음식의 가격을 Sum에 추가
                parent.tfCost.setText(String.valueOf(parent.sum) + "원");                  // "몇 원"이라고 결제액 창에 표시
             } // end of actionPerformed   
          } ); // end of addActionListener()
         
         aBtn[5].addActionListener(new ActionListener() {   
             public void actionPerformed(ActionEvent e) {
                JButton evt = (JButton) e.getSource();                                 // Btn[i]의 i가 작동이 불가능해서 e.getSource를 활용
                parent.taMenu.setText(parent.taMenu.getText() + evt.getText() + "\n");          // 주문 내역이 누적되도록 설정
                parent.sum += 4000;                                             // 해당 음식의 가격을 Sum에 추가
                parent.tfCost.setText(String.valueOf(parent.sum) + "원");                  // "몇 원"이라고 결제액 창에 표시
             } // end of actionPerformed   
          } ); // end of addActionListener()
      
   }   // end of eventProc ()
}