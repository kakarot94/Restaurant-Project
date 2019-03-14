/*
 * CentralPanel panel consists from panel -CentralLeftSide- and
 * and -CentralRightPanel- panel. 
 */

package MainPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class CentralPanel extends JPanel {
	
	private CentralLeftPanel leftPanel;
	private CentralRightPanel rightPanel;
	
	public CentralPanel() {
		
		//----->setting basic parameters for -MainManuHeader- panel
		setSize(1300,600);
		setBackground(new Color(0,0,0,0));
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		leftPanel = new CentralLeftPanel();
		leftPanel.setPreferredSize(new Dimension(900,600));
		leftPanel.setBounds(0, 0, 900, 600);
		
		rightPanel = new CentralRightPanel();
		rightPanel.setPreferredSize(new Dimension(400,600));
		rightPanel.setBounds(900, 0, 400, 600);
		
		add(leftPanel);
		add(rightPanel);
	}
}

