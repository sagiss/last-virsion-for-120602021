package com;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame {
	static JFrame frame;
	public static void main(String[]args) { 
		if(frame ==null) {
			frame = new JFrame("Draw a line");
			frame.setSize(1200,800);
//			JPanel enterT = new JPanel();
//			JTextField tzag = new JTextField(10);
//			JTextField tzag2 = new JTextField(10);
//			enterT.setSize(3, 5);
//			enterT.add(tzag);
//			enterT.add(tzag2);
//			enterT.setLayout(new GridLayout(1,1));
//			frame.add(enterT);
			frame.setVisible(true);
		}

	}
	public static void printLines(int[] number) {
		JLabel title  = new JLabel("THE GAME OF STICKS AND LINES!");
		JPanel enterT = new JPanel();
		JLabel tzam = new JLabel("enter number of sticks");
		JLabel tzam2 = new JLabel("enter row");
		JTextField tzag = new JTextField(20);
		JTextField tzag2 = new JTextField(20);
		enterT.add(tzam);
		enterT.add(tzam2);
		enterT.add(tzag);
		enterT.add(tzag2);
		enterT.setLayout(new GridLayout(2,1));
		int[] board= new int[4];
		board[0]=1;
		board[1]=3;
		board[2]=5;
		board[3]=7;
		Draw draw = new Draw(number,board);
		frame.add(enterT);
		frame.add(draw,BorderLayout.CENTER);
		enterT.setBounds(860,200, 300, 100);
		frame.setVisible(true);
	}

}