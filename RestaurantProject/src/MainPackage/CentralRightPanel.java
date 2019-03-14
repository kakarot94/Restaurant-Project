package MainPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CentralRightPanel extends JPanel {
	
	public CentralRightPanel() {
		//-----setting basic parameters for -CentralRightPanel- panel 
		setSize(400,600);
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setLayout(null);
		setBackground(new Color(0,0,0,0));
		Color color = new Color(0,255,255);
		
		//-----setting components for -CentralRightPanel-
		JLabel lblMenuChoise = new JLabel("MENU CHOISE");
		lblMenuChoise.setPreferredSize(new Dimension(70, 15));
		lblMenuChoise.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMenuChoise.setBounds(30, 10, 150, 30);
		add(lblMenuChoise);
		
		JButton drinksBtn = new JButton("DRINKS MENU");
		drinksBtn.setBackground(color);
		drinksBtn.setBorderPainted(false);
		drinksBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		drinksBtn.setBounds(90, 55, 210, 35);
		add(drinksBtn);
		
		JButton foodBtn = new JButton("FOOD MENU");
		foodBtn.setBackground(color);
		foodBtn.setBorderPainted(false);
		foodBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		foodBtn.setBounds(90, 115, 210, 35);
		add(foodBtn);
		
		JButton dessertBtn = new JButton("DESSERT MENU");
		dessertBtn.setBackground(color);
		dessertBtn.setBorderPainted(false);
		dessertBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dessertBtn.setBounds(90, 175, 210, 35);
		add(dessertBtn);
		
		JButton availableStockBtn = new JButton("AVAILABLE STOCK");
		availableStockBtn.setBackground(color);
		availableStockBtn.setBorderPainted(false);
		availableStockBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		availableStockBtn.setBounds(30, 245, 210, 35);
		add(availableStockBtn);
		
		JButton orderBtn = new JButton("NEW ORDER");
		orderBtn.setBackground(color);
		orderBtn.setBorderPainted(false);
		orderBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		orderBtn.setBounds(30, 305, 210, 35);
		add(orderBtn);
		
		JButton billsBtn = new JButton("ALL BILLS");
		billsBtn.setBackground(color);
		billsBtn.setBorderPainted(false);
		billsBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		billsBtn.setBounds(30, 365, 210, 35);
		add(billsBtn);
		
		JButton chargeBillBtn = new JButton("CHARGE THE BILL");
		chargeBillBtn.setBackground(color);
		chargeBillBtn.setBorderPainted(false);
		chargeBillBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chargeBillBtn.setBounds(210, 500, 170, 30);
		add(chargeBillBtn);
		
		JButton checkBillBtn = new JButton("CHECK THE BILL");
		checkBillBtn.setBackground(color);
		checkBillBtn.setBorderPainted(false);
		checkBillBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBillBtn.setBounds(20, 500, 170, 30);
		add(checkBillBtn);
		
		//-----> For info about -ThisBackground check class -ThisBackground-
		ThisBackground  thisBackground = new ThisBackground();
		thisBackground.setLocation(0, 0);
		thisBackground.setSize(400, 600);
		add(thisBackground);
	}
}