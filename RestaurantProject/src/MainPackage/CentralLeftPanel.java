package MainPackage;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.IllegalComponentStateException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class CentralLeftPanel extends JPanel {

	public CentralLeftPanel() {
		
		//-----setting basic parameters for -CentralLeftPanel- panel 
		setFont(new Font("Tahoma", Font.PLAIN, 18));
		setToolTipText("");
		setSize(new Dimension(900, 600));
		Font f = new Font("Tahoma", Font.ITALIC, 20);
		TitledBorder border = new TitledBorder(null, " TABLE LAYOUT ", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK);
		border.setTitleFont(f);
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		
		setBackground(new Color(0,0,0,0));
		setLayout(null);
		
		/*
		 * Buttons are used for tables and chairs, table buttons have ability to respond 
		 * to ActionListener and chairs don't. Tables are in front of transparent background
		 * and chairs are not.
		 */
		JButton table6Btn = new JButton("6");
		table6Btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table6Btn.setBorderPainted(false);
		table6Btn.setBackground(Color.GREEN);
		table6Btn.setBounds(35, 311, 80, 80);
		add(table6Btn);
		
		JButton table5Btn = new JButton("5");
		table5Btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table5Btn.setBorderPainted(false);
		table5Btn.setBackground(Color.GREEN);
		table5Btn.setBounds(35, 91, 80, 80);
		add(table5Btn);
		
		JButton table4Btn = new JButton("4");
		table4Btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table4Btn.setBorderPainted(false);
		table4Btn.setBackground(Color.GREEN);
		table4Btn.setBounds(310, 91, 120, 120);
		add(table4Btn);
		
		JButton table3Btn = new JButton("3");
		table3Btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table3Btn.setBorderPainted(false);
		table3Btn.setBackground(Color.GREEN);
		table3Btn.setBounds(570, 91, 240, 120);
		add(table3Btn);
		
		JButton table2Btn = new JButton("2");
		table2Btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table2Btn.setBorderPainted(false);
		table2Btn.setBackground(Color.GREEN);
		table2Btn.setBounds(630, 457, 120, 120);
		add(table2Btn);
		
		
		JButton table1Btn = new JButton("1");
		table1Btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table1Btn.setBorderPainted(false);
		table1Btn.setBackground(Color.GREEN);
		table1Btn.setBounds(380, 457, 120, 120);
		add(table1Btn);
		
		
		//-----> For info about -ThisBackground check class -ThisBackground-
		ThisBackground  thisBackground = new ThisBackground();
		thisBackground.setLocation(5, 15);
		thisBackground.setSize(890, 580);
		add(thisBackground);
		
		
		//----->chairs<-----
		JButton c11 = new JButton("");
		c11.setEnabled(false);
		c11.setBorderPainted(false);
		c11.setBackground(Color.GREEN);
		c11.setBounds(320, 462, 50, 50);
		add(c11);
		
		JButton c12 = new JButton("");
		c12.setEnabled(false);
		c12.setBorderPainted(false);
		c12.setBackground(Color.GREEN);
		c12.setBounds(320, 522, 50, 50);
		add(c12);
		
		JButton c13 = new JButton("");
		c13.setEnabled(false);
		c13.setBorderPainted(false);
		c13.setBackground(Color.GREEN);
		c13.setBounds(415, 397, 50, 50);
		add(c13);
		
		JButton c14 = new JButton("");
		c14.setEnabled(false);
		c14.setBorderPainted(false);
		c14.setBackground(Color.GREEN);
		c14.setBounds(510, 462, 50, 50);
		add(c14);
		
		JButton c15 = new JButton("");
		c15.setEnabled(false);
		c15.setBorderPainted(false);
		c15.setBackground(Color.GREEN);
		c15.setBounds(510, 522, 50, 50);
		add(c15);
		
		JButton c21 = new JButton("");
		c21.setEnabled(false);
		c21.setBorderPainted(false);
		c21.setBackground(Color.GREEN);
		c21.setBounds(570, 522, 50, 50);
		add(c21);
		
		JButton c22 = new JButton("");
		c22.setEnabled(false);
		c22.setBorderPainted(false);
		c22.setBackground(Color.GREEN);
		c22.setBounds(570, 462, 50, 50);
		add(c22);
		
		JButton c23 = new JButton("");
		c23.setEnabled(false);
		c23.setBorderPainted(false);
		c23.setBackground(Color.GREEN);
		c23.setBounds(665, 397, 50, 50);
		add(c23);
		
		JButton c24 = new JButton("");
		c24.setEnabled(false);
		c24.setBorderPainted(false);
		c24.setBackground(Color.GREEN);
		c24.setBounds(760, 462, 50, 50);
		add(c24);
		
		JButton c25 = new JButton("");
		c25.setEnabled(false);
		c25.setBorderPainted(false);
		c25.setBackground(Color.GREEN);
		c25.setBounds(760, 522, 50, 50);
		add(c25);
		
		JButton c31 = new JButton("");
		c31.setEnabled(false);
		c31.setBorderPainted(false);
		c31.setBackground(Color.GREEN);
		c31.setBounds(510, 126, 50, 50);
		add(c31);
		
		JButton c32 = new JButton("");
		c32.setEnabled(false);
		c32.setBorderPainted(false);
		c32.setBackground(Color.GREEN);
		c32.setBounds(575, 221, 50, 50);
		add(c32);
		
		JButton c33 = new JButton("");
		c33.setEnabled(false);
		c33.setBorderPainted(false);
		c33.setBackground(Color.GREEN);
		c33.setBounds(665, 221, 50, 50);
		add(c33);
		
		JButton c34 = new JButton("");
		c34.setEnabled(false);
		c34.setBorderPainted(false);
		c34.setBackground(Color.GREEN);
		c34.setBounds(755, 221, 50, 50);
		add(c34);
		
		JButton c35 = new JButton("");
		c35.setEnabled(false);
		c35.setBorderPainted(false);
		c35.setBackground(Color.GREEN);
		c35.setBounds(820, 126, 50, 50);
		add(c35);
		
		JButton c36 = new JButton("");
		c36.setEnabled(false);
		c36.setBorderPainted(false);
		c36.setBackground(Color.GREEN);
		c36.setBounds(755, 31, 50, 50);
		add(c36);
		
		JButton c37 = new JButton("");
		c37.setEnabled(false);
		c37.setBorderPainted(false);
		c37.setBackground(Color.GREEN);
		c37.setBounds(665, 31, 50, 50);
		add(c37);
		
		JButton c38 = new JButton("");
		c38.setEnabled(false);
		c38.setBorderPainted(false);
		c38.setBackground(Color.GREEN);
		c38.setBounds(575, 31, 50, 50);
		add(c38);
		
		JButton c41 = new JButton("");
		c41.setEnabled(false);
		c41.setBorderPainted(false);
		c41.setBackground(Color.GREEN);
		c41.setBounds(315, 31, 50, 50);
		add(c41);
		
		JButton c42 = new JButton("");
		c42.setEnabled(false);
		c42.setBorderPainted(false);
		c42.setBackground(Color.GREEN);
		c42.setBounds(375, 31, 50, 50);
		add(c42);
		
		JButton c43 = new JButton("");
		c43.setEnabled(false);
		c43.setBorderPainted(false);
		c43.setBackground(Color.GREEN);
		c43.setBounds(375, 221, 50, 50);
		add(c43);
		
		JButton c44 = new JButton("");
		c44.setEnabled(false);
		c44.setBorderPainted(false);
		c44.setBackground(Color.GREEN);
		c44.setBounds(315, 221, 50, 50);
		add(c44);
		
		JButton c45 = new JButton("");
		c45.setEnabled(false);
		c45.setBorderPainted(false);
		c45.setBackground(Color.GREEN);
		c45.setBounds(250, 126, 50, 50);
		add(c45);
		
		JButton c51 = new JButton("");
		c51.setEnabled(false);
		c51.setBorderPainted(false);
		c51.setBackground(Color.GREEN);
		c51.setBounds(50, 181, 50, 50);
		add(c51);
		
		JButton c52 = new JButton("");
		c52.setEnabled(false);
		c52.setBorderPainted(false);
		c52.setBackground(Color.GREEN);
		c52.setBounds(50, 30, 50, 50);
		add(c52);
		
		JButton c61 = new JButton("");
		c61.setEnabled(false);
		c61.setBorderPainted(false);
		c61.setBackground(Color.GREEN);
		c61.setBounds(50, 401, 50, 50);
		add(c61);
		
		JButton c62 = new JButton("");
		c62.setEnabled(false);
		c62.setBorderPainted(false);
		c62.setBackground(Color.GREEN);
		c62.setBounds(50, 251, 50, 50);
		add(c62);
	}
}

