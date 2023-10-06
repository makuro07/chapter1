package com.hspedu.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author 張　暁竜
 * @version SE 11
 */
public class MyPanel extends JPanel {
    //定义自己的坦克
    Hero hero = null;

    public MyPanel() {

        hero = new Hero(100, 100);//初始化自己的坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形
        drawTank(hero.getX(), hero.getY(), g, 0, 0);
//        drawTank(hero.getX()+60, hero.getY(), g, 0, 1);
//        drawTank(hero.getX()+120, hero.getY(), g, 0, 0);

    }

    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x+20,y+30,x+20,y);
                break;
            default:
                System.out.println("throw");
        }
    }
}
