package org.example;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
    JFrame frame;
    JPanel panel;
    JTextField output;

    JButton b0;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton bAdd;
    JButton bSubtract;
    JButton bDivide;
    JButton bMultiply;
    JButton bClear;
    JButton bDigit;
    JButton bEquals;

    static Font DEFAULT_FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
    static Dimension DEFAULT_BUTTON_SIZE = new Dimension(100, 100);

    // default constructor
    Calculator() {
        // create frame
        frame = new JFrame("Calculator");
        frame.setFont(DEFAULT_FONT);

        // create panel
        panel = new JPanel();
        panel.setFont(DEFAULT_FONT);

        // create a textfield
        output = new JTextField(10);

        // set the textfield to non editable
        output.setEditable(false);

        // set the textfield size
        output.setPreferredSize(new Dimension(600, 50));

        // set the textfield font
        output.setFont(DEFAULT_FONT);

        // add buttons
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        bAdd = new JButton("+");
        bSubtract = new JButton("-");
        bDivide = new JButton("/");
        bMultiply = new JButton("*");
        bClear = new JButton("C");
        bDigit = new JButton(".");
        bEquals = new JButton("=");

        // set number buttons size and font
        b0.setPreferredSize(DEFAULT_BUTTON_SIZE);
        b1.setPreferredSize(DEFAULT_BUTTON_SIZE);
        b2.setPreferredSize(DEFAULT_BUTTON_SIZE);
        b3.setPreferredSize(DEFAULT_BUTTON_SIZE);
        b4.setPreferredSize(DEFAULT_BUTTON_SIZE);
        b5.setPreferredSize(DEFAULT_BUTTON_SIZE);
        b6.setPreferredSize(DEFAULT_BUTTON_SIZE);
        b7.setPreferredSize(DEFAULT_BUTTON_SIZE);
        b8.setPreferredSize(DEFAULT_BUTTON_SIZE);
        b9.setPreferredSize(DEFAULT_BUTTON_SIZE);
        b0.setFont(DEFAULT_FONT);
        b1.setFont(DEFAULT_FONT);
        b2.setFont(DEFAULT_FONT);
        b3.setFont(DEFAULT_FONT);
        b4.setFont(DEFAULT_FONT);
        b5.setFont(DEFAULT_FONT);
        b6.setFont(DEFAULT_FONT);
        b7.setFont(DEFAULT_FONT);
        b8.setFont(DEFAULT_FONT);
        b9.setFont(DEFAULT_FONT);

        // set other buttons size and font
        bAdd.setPreferredSize(new Dimension(70, 70));
        bSubtract.setPreferredSize(new Dimension(70, 70));
        bDivide.setPreferredSize(new Dimension(70, 70));
        bMultiply.setPreferredSize(new Dimension(70, 70));
        bClear.setPreferredSize(DEFAULT_BUTTON_SIZE);
        bDigit.setPreferredSize(DEFAULT_BUTTON_SIZE);
        bEquals.setPreferredSize(new Dimension(600, 100));
        bAdd.setFont(DEFAULT_FONT);
        bSubtract.setFont(DEFAULT_FONT);
        bDivide.setFont(DEFAULT_FONT);
        bMultiply.setFont(DEFAULT_FONT);
        bClear.setFont(DEFAULT_FONT);
        bDigit.setFont(DEFAULT_FONT);
        bEquals.setFont(DEFAULT_FONT);

        // add button action listeners
        b9.addActionListener(this);
        b8.addActionListener(this);
        b7.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        b0.addActionListener(this);

        bMultiply.addActionListener(this);
        bDivide.addActionListener(this);
        bSubtract.addActionListener(this);
        bAdd.addActionListener(this);
        bDigit.addActionListener(this);
        bClear.addActionListener(this);
        bEquals.addActionListener(this);

        // add elements to panel
        panel.add(output);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);

        panel.add(bClear);
        panel.add(b0);
        panel.add(bDigit);
        panel.add(bAdd);
        panel.add(bSubtract);
        panel.add(bMultiply);
        panel.add(bDivide);
        panel.add(bEquals);

        // set Background of panel
        panel.setBackground(Color.blue);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380, 700);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String inputKey = e.getActionCommand();
        output.setText(inputKey);
    }
}
