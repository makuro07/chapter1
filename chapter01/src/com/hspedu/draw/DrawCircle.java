package com.hspedu.draw;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Collection;

/**
 * @author 張　暁竜
 * @version SE 11
 */
@SuppressWarnings({"all"})

public class DrawCircle extends JFrame {//窗口 画框

    //定义一个面板
    private MyPanel mp = null;

    public static void main(String[] args) {
        
              new DrawCircle();
    }

    public DrawCircle(){
        //初始化面板
        mp = new MyPanel();
        //把面板放入画框
        this.add(mp);
        //设置画框的大小
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点×退出程序。。
        this.setVisible(true);//可以显示。
    }
}


class MyPanel extends JPanel{
    //MyPanel 面板 画板
    //Graphics g 是画笔
    //Graphics 提供了许多绘图的方法。
    @Override
    public void paint(Graphics g) {
        super.paint(g);//不能去掉 调用父类的方法完成初始化
       // g.drawOval(5,10,100,100);
        //各种方法 直线 边框 椭圆
        //g.drawLine(10,10,100,100);

//        g.drawRect(10,10,100,100);
//        g.setColor(Color.red);//设置颜色
//        g.fillRect(10,10,100,100);
//        //画图片 加载图片资源
        //无法加载图片 不知道原因
//       Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bg.png.JPG"));
//       //Image img = ImageIO.read(new File("bg.png"));
//        g.drawImage(image,10,10,640,413,this);

        g.setColor(Color.red);
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("ようこそ、横浜へ",100,100);

    }
}