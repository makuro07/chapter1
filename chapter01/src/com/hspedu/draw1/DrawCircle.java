package com.hspedu.draw1;

import javax.swing.*;
import java.awt.*;

/**
 * @author 張　暁竜
 * @version SE 11
 */
public class DrawCircle extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle() {
       mp = new MyPanel();
       this.add(mp);
       this.setSize(400,400);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
    }
}

class MyPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //g.drawLine(10,10,50,50);
        //g.drawRect(10,10,100,100);
        g.setColor(Color.red);
        //g.fillRect(10,10,50,50);
        g.drawOval(10,10,70,50);
        g.fillOval(10,10,70,50);
        //g.fillRect(10,10,70,70);
//        g.setFont(new Font("楷书",Font.BOLD,60));
//        g.drawString("ようこそ、横浜",50,50);

    }
}