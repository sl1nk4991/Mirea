package ru.mirea.work6;

import javax.swing.*;
import java.awt.*;

public class program extends JFrame {
    JPanel panel = new JPanel();
    public program() {
        super("program");
        setLayout(new GridLayout(3,4));
        panel.setLayout(new BorderLayout());
        panel.add(new JButton("button"),BorderLayout.WEST);
        setSize(400, 400);
    }
    public static void main(String[] args) {
        new program().setVisible(true);
    }
}
