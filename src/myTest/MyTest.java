package myTest;

import util.GUIUtil;

import javax.swing.*;

public class MyTest {
    public static void main(String[] args) {
        GUIUtil.useLNF();
        JPanel p = new JPanel();
        JButton b = new JButton("picture");
        GUIUtil.setImageIcon(b, "home.png", "��û��");
        p.add(b);
        p.add(new JButton("��ť1"));
        p.add(new JButton("��ť2"));
        GUIUtil.showPanel(p, 0.99);
    }
}
