
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	JFrame startf = new JFrame("starting frame");
    	startf.setSize(1200,800);
    	JPanel headlinef = new JPanel();
    	JLabel headlinep1 = new JLabel("WELCONE TO THE GAME OF STICKS AND LINES");
    	headlinef.add(headlinep1);
    	headlinef.setBackground(Color.red);
    	JPanel mainp1 = new JPanel();
    	JButton start = new JButton("START THE GAME");
    	JButton help = new JButton("HOW TO PLAY");
    	mainp1.add(start);
    	mainp1.add(help);
    	startf.add(headlinef, BorderLayout.NORTH);
    	startf.add(mainp1, BorderLayout.CENTER);
    	startf.setIconImage(new ImageIcon("users/sagis/downloads/project_image.png").getImage());
    	
    	startf.setVisible(true);
    	
    	JFrame controlframe = new JFrame("control frame");
    	controlframe.setSize(1200, 800);
    	JPanel headline = new JPanel();
    	JPanel mainp = new JPanel();
    	JLabel headlinel = new JLabel("THE CONTROL FRAME");
    	JTextField tzag = new JTextField(20);
		JTextField tzag2 = new JTextField(20);
		JLabel tzam = new JLabel("enter number of sticks");
		JLabel tzam2 = new JLabel("enter row");
		JButton bt1 = new JButton("enter");
    	bt1.setBackground(Color.gray);
		JButton bt2 = new JButton("back");
    	bt2.setBackground(Color.gray);
		headline.add(headlinel);
		mainp.add(tzam);
		mainp.add(tzam2);
		mainp.add(tzag);
		mainp.add(tzag2);
		mainp.add(bt1);
		mainp.add(bt2);
		headline.setSize(20, 20);
		mainp.setLayout(new GridLayout(3,2));
		controlframe.add(mainp);
		headline.setBackground(Color.RED);
		controlframe.add(headline, BorderLayout.NORTH);
		controlframe.setVisible(false);
    
		start.addActionListener((new ActionListener() {
			public void actionPerfromed(ActionEvent e){
				startf.setVisible(false);
				controlframe.setVisible(true);
				GameManager gm = new GameManager(4);
		        gm.print();
		        Ai ai = new Ai();
		
		        Scanner sc = new Scanner(System.in);
		
		        while (gm.getWinner().equals("none")) {
		            if (gm.getTurn() == 0) {
		                System.out.println("AI");
		                Move move = ai.playTurn(gm);
		                gm.playTurn(move.row,move.amount);
		            } else {
		                System.out.println("player " + (gm.getTurn() + 1) + " its your turn");
		                System.out.println("choose row");
		                int row = Integer.parseInt(sc.nextLine());
		                row--;
		                System.out.println("choose amount");
		                int amount = Integer.parseInt(sc.nextLine());
		                if (!gm.playTurn(row, amount)){
		                    System.out.println("AGAIN");
		                }
		            }
		            gm.print();
		            System.out.println("\n");
		
		        }
//		        paintComponent();
		      sc.close();
		        System.out.println("Winner " + gm.getWinner());
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				startf.setVisible(false);
				controlframe.setVisible(true);
				 GameManager gm = new GameManager(4);
		        gm.print();
		        Ai ai = new Ai();
		
		        Scanner sc = new Scanner(System.in);
		
		        while (gm.getWinner().equals("none")) {
		            if (gm.getTurn() == 0) {
		                System.out.println("AI");
		                Move move = ai.playTurn(gm);
		                gm.playTurn(move.row,move.amount);
		            } else {
		                System.out.println("player " + (gm.getTurn() + 1) + " its your turn");
		                System.out.println("choose row");
		                int row = Integer.parseInt(sc.nextLine());
		                row--;
		                System.out.println("choose amount");
		                int amount = Integer.parseInt(sc.nextLine());
		                if (!gm.playTurn(row, amount)){
		                    System.out.println("AGAIN");
		                }
		            }
		            gm.print();
		            System.out.println("\n");
		
		        }
//		        paintComponent();
		      sc.close();
		        System.out.println("Winner " + gm.getWinner());
		       
		    
			}
		}));
    }
}
//        GameManager gm = new GameManager(4);
//        gm.print();
//        Ai ai = new Ai();
//
//        Scanner sc = new Scanner(System.in);
//
//        while (gm.getWinner().equals("none")) {
//            if (gm.getTurn() == 0) {
//                System.out.println("AI");
//                Move move = ai.playTurn(gm);
//                gm.playTurn(move.row,move.amount);
//            } else {
//                System.out.println("player " + (gm.getTurn() + 1) + " its your turn");
//                System.out.println("choose row");
//                int row = Integer.parseInt(sc.nextLine());
//                row--;
//                System.out.println("choose amount");
//                int amount = Integer.parseInt(sc.nextLine());
//                if (!gm.playTurn(row, amount)){
//                    System.out.println("AGAIN");
//                }
//            }
//            gm.print();
//            System.out.println("\n");
//
//        }
////        paintComponent();
//      sc.close();
//        System.out.println("Winner " + gm.getWinner());
//       
//    }  
//}
