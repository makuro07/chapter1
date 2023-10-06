package com.hspedu.event01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 張　暁竜
 * @version SE 11
 */
public class BallMove extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
           new BallMove();
    }
    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(700,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(mp);
        this.setVisible(true);

    }
}

class MyPanel extends Panel implements KeyListener {
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_DOWN){
                y++;
            }
            if(e.getKeyCode()==KeyEvent.VK_LEFT) {
                x--;
            }
            if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
                x++;
            }
            if(e.getKeyCode()==KeyEvent.VK_UP){
                y--;
            }
            this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}