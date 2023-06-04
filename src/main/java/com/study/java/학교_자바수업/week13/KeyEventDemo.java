package com.study.java.학교_자바수업.week13;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventDemo extends JFrame {
    
    private String message = "";
    
    public KeyEventDemo() {
        setSize(300, 200);
        setTitle("KeyEvent 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JTextField field = new JTextField(10);
        JTextArea area = new JTextArea(5, 20);
        area.setEditable(false);
        JButton button = new JButton("Reset");
        
        field.addKeyListener(new KeyListener() {
            
            @Override
            public void keyTyped(KeyEvent e) {
                message += "KeyTyped: code=" + e.getKeyCode() + "\n";
                area.setText(message);
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
            	message += "KeyReleased: code=" + e.getKeyCode() + "\n";
                area.setText(message);
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
            	message += "KeyPressed: code=" + e.getKeyCode() + "\n";
                area.setText(message);
            }
        });
        
        add(field, "North");
        add(area, "Center");
        add(button, "South");
    }
    
    public static void main(String[] args) {
        KeyEventDemo demo = new KeyEventDemo();
        demo.setVisible(true);
    }
} 
