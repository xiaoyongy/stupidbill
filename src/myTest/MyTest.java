package myTest;

import util.GUIUtil;

import javax.swing.*;

public class MyTest {
    public static void main(String[] args) {
        GUIUtil.useLNF();
        JPanel p = new JPanel();
        JButton b = new JButton("picture");
        GUIUtil.setImageIcon(b, "home.png", "123");
        p.add(b);
        p.add(new JButton("°´Å¥1"));
        p.add(new JButton("°´Å¥2"));
        GUIUtil.showPanel(p, 0.99);
    }
}
