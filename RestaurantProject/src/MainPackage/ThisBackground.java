/*
 * This class is used to make the background for -CentralLeftPanel- and -CentralRightPanel- almost transparent 
 */

package MainPackage;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThisBackground extends JPanel{
	public ThisBackground() {
		
		//-----setting properties for new background-----
		JLabel labelBack = new JLabel("New label");		//-----> new label for the background
		labelBack.setBackground(new Color(0,0,0,0));
		labelBack.setIcon(new ImageIcon("C:\\Users\\Irina Stojanovic\\eclipse-workspace1\\"
				+ "RestourandProject\\src\\AppPackage\\white.jpeg"));
		
		labelBack.setPreferredSize(new Dimension(1300, 600));
		add(labelBack);
	}
	
	//-----method paint is used to set opacity of the label(background)-----
	public void paint(Graphics g) 
	{       
	    Graphics2D g2 = (Graphics2D) g.create();
	    g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) 0.2));
	    super.paint(g2);
	    g2.dispose();
	}
}