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
		title.setSize(300, 70);
		enterT.setSize(300, 70);
		Draw draw = new Draw(number,board);
//		frame.add(title);
//		title.setLocation(120, 20);
//		frame.add(enterT);
//		enterT.setLocation(860,100);
		frame.add(draw);
		frame.setVisible(true);
	}

}
