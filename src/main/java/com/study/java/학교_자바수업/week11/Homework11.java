package com.study.java.학교_자바수업.week11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Homework11 extends JFrame{
	private JButton btnGo;
	private JTextField inputName;
	private JRadioButton checkBox1;
	private JRadioButton checkBox2;
	
	// 생성자
	public Homework11() {
		setTitle("전공선택");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(320, 200);
		
		// 패널 생성
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT)); // 왼쪽 정렬
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT)); // 왼쪽 정렬
		JPanel panel4 = new JPanel();
		
		// 안내 글자 
		Font font = new Font("Serif", Font.PLAIN, 25);
		JLabel labelMainJLabel = new JLabel("이름과 전공을 선택하시오");
		labelMainJLabel.setForeground(Color.pink);
		labelMainJLabel.setFont(font);
		panel1.add(labelMainJLabel);
		
		// 이름 입력칸
		JLabel labelName = new JLabel("이름", JLabel.RIGHT);
		inputName = new JTextField(8);
		panel2.add(labelName);
		panel2.add(inputName);
		
		// 전공선택
		JLabel labelMajor = new JLabel("전공:", JLabel.RIGHT);
		
		// 그룹 버튼
		checkBox1 = new JRadioButton("소프트웨어", true);
		checkBox2 = new JRadioButton("가상현실");
		panel3.add(labelMajor);
		panel3.add(checkBox1);
		panel3.add(checkBox2);
		
		// 실행 버튼
		btnGo = new JButton("Go");
		panel4.add(btnGo);
		btnGo.addActionListener(new NextListener());
		
		
		Container cPane = getContentPane();
		cPane.setLayout(new GridLayout(4,1,1,1));	
		cPane.add(panel1);
		cPane.add(panel2);
		cPane.add(panel3);
		cPane.add(panel4);
	}
	
	
	// 이벤트 리스너  
	public class NextListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnGo) {
				
				String msgString =  inputName.getText() + " 님은 " +
				(checkBox1.isSelected() ? "소프트웨어 전공" : "가상현실 전공") + " 입니다.";
				(new NextResult(msgString)).setVisible(true);
			}
		}
		
	}
	
	
	// 이후 
	public class NextResult extends JFrame {
		public NextResult(String msg) {
			setSize(320, 100);
			setTitle("전공 선택 결과");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			JLabel label = new JLabel(msg);
			label.setFont(new Font("SansSerif", Font.PLAIN, 20));
			label.setForeground(Color.BLUE);
			
			Container container = getContentPane();
			container.setLayout(new FlowLayout());
			container.add(label);
		}
	}
	
	public static void main(String[] args) {
		(new Homework11()).setVisible(true);
	}
}