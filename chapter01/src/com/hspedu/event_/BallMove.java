package com.hspedu.event_;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 張　暁竜
 * @version SE 11
 */
public class BallMove extends JFrame  {

   MyPanel mp = null;
    public static void main(String[] args) {

        BallMove ballMove = new BallMove();
    }

    public BallMove (){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);   // addKeyListener在JFrame中可以使用该方法 他们底层关联
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}

class MyPanel extends JPanel implements KeyListener{//实现监听器

    int x =10;
    int y =10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.fillOval(x,y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) {  // KeyEvent 事件对象

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char)e.getKeyCode()+"押された");
        if(e.getKeyCode()==KeyEvent.VK_DOWN) {
            y++;
        }else if(e.getKeyCode()==KeyEvent.VK_UP){
            y--;
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
            x--;
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
            x++;
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}