package kiosk;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelB extends JPanel{


   MainTest parent;   //멤버변수 선언
   JButton aBtn, bBtn, cBtn, dBtn ;

   public PanelB (MainTest mainTest) {

      parent = mainTest;  //주소값 받아줌   

      aBtn = new JButton("떡볶이");
      bBtn = new JButton("모짜감자");
      cBtn = new JButton("치즈볼");
      dBtn = new JButton("파인샤벳");



      setBackground(new Color(255, 255, 255));
      addLayout();
   }//end of panelB

   void addLayout() {
      
      //떡볶이
      aBtn.setIcon(new ImageIcon("src\\kiosk\\imgs\\aBtn.PNG"));
      aBtn.setHorizontalTextPosition(JButton.CENTER);
      aBtn.setVerticalTextPosition(JButton.BOTTOM);
      
      //모짜감자
      bBtn.setIcon(new ImageIcon("src\\kiosk\\imgs\\bBtn.PNG"));
      bBtn.setHorizontalTextPosition(JButton.CENTER);
      bBtn.setVerticalTextPosition(JButton.BOTTOM);
      
      //치즈볼
      cBtn.setIcon(new ImageIcon("src\\kiosk\\imgs\\cBtn.PNG"));
      cBtn.setHorizontalTextPosition(JButton.CENTER);
      cBtn.setVerticalTextPosition(JButton.BOTTOM);
      
      //파인샤벳
      dBtn.setIcon(new ImageIcon("src\\kiosk\\imgs\\dBtn.PNG"));
      dBtn.setHorizontalTextPosition(JButton.CENTER);
      dBtn.setVerticalTextPosition(JButton.BOTTOM);

      JPanel pEast = new JPanel(new GridLayout(2,2));
      pEast.add(aBtn);
      pEast.add(bBtn);
      pEast.add(cBtn);
      pEast.add(dBtn);

      add(pEast);
   }//end of addLayout()

   void eventProc() {
      aBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });

   }
}