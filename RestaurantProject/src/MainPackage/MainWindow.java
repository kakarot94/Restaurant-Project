/*
 * This window is build without WindowBuilder.
 * 
 * 	Window is build with different pieces put together
 */

package MainPackage;

import java.awt.BorderLayout;
import java.awt.IllegalComponentStateException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindow extends JFrame{
	private FooterPanel footerPanel;
	private MainMenuHeader header;
	private CentralPanel centralPanel;		//----->This class contains -CentralLeftPanel- and -CentralRightPanel- 
	
	public MainWindow() {
		
		//-----setting basic parameters for window----- 
		setTitle("RESTOURANT NAME");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1370, 730);
		
		//-----setting window icon and background
		String icon = "C:\\Users\\Irina Stojanovic\\eclipse-workspace1\\RestaurantProject\\src\\AppPackage\\Icon.png";
		String backgroundImage = "C:\\Users\\Irina Stojanovic\\eclipse-workspace1\\RestaurantProject\\src\\AppPackage\\Beckground.jpeg";
		
		setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(icon));
		try {
			setContentPane(new JLabel(new ImageIcon(backgroundImage)));
		}
		catch (IllegalComponentStateException e) {
			System.out.println("Image doesn't exist");  // if image is not found error will occur
		}
		
		setLayout(new BorderLayout());
		
		footerPanel = new FooterPanel();
		add(footerPanel, BorderLayout.SOUTH);
		
		header = new MainMenuHeader();
		add(header, BorderLayout.NORTH);
		
		centralPanel = new CentralPanel();
		add(centralPanel, BorderLayout.CENTER);
		
	}
}

