package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Buttons extends JFrame {
    private Toolkit toolkit;
    public Buttons() {
        setTitle("Buttons");
    setSize(300, 200);
    toolkit = getToolkit();
    Dimension size = toolkit.getScreenSize();
    setLocation((size.width - getWidth())/2, (size.height -getHeight())/2);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JPanel panel = new JPanel();
    getContentPane().add(panel);
    panel.setLayout(null); JLabel lbl1 = new JLabel("First Number");
    lbl1.setBounds(30,20,80,30);
    JLabel lbl2 = new JLabel("Second Number");
    lbl2.setBounds(30,55,110,30);
    JLabel lbl3 = new JLabel("Sum");
    lbl3.setBounds(30,90,80,30);
    final
    JTextField txt1 = new JTextField(5);
    txt1.setBounds(145,20,50,30);
    txt1.setText("0");
    final JTextField txt2 = new JTextField(5);
    txt2.setBounds(145,55,50,30);
    txt2.setText("0");
    final JTextField txt3 = new JTextField(5);
    txt3.setBounds(145,90,50,30);
    JButton B1= new JButton("Compute");
    B1.setBounds(30, 125, 110, 30);
    B1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event)
    {
        int a1 = Integer.parseInt(txt1.getText());
        int a2 = Integer.parseInt(txt2.getText());
        int a3 = a1 + a2;
        txt3.setText(String.valueOf(a3));
    }
    });
    JButton B2=new JButton("divide");
    B2.setBounds(30,125,110,30);
    B2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event){
            int a1=Integer.parseInt(txt1.getText());
            int a2=Integer.parseInt(txt2.getText());
            int a3= a1/a2;
            txt3.setText(String.valueOf(a3));
        }
    });
    panel.add(lbl1);
    panel.add(lbl2);
    panel.add(lbl3);
    panel.add(txt1);
    panel.add(txt2);
    panel.add(txt3);
    panel.add(B1);
    panel.add(B2);
}
public static void main(String[] args) {
        Buttons buttons = new Buttons(); buttons.setVisible(true); }
}


