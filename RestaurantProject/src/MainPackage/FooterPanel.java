package MainPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class FooterPanel extends JPanel {
	private JLabel copyrightLbl;
	private JLabel firmNameLbl;
	
	public FooterPanel() {
		
		setBackground(new Color(0, 0, 0, 0));
		
		//-----setting basic parameters for -copyrightLbl- and -firmNameLbl- Label
		copyrightLbl = new JLabel("© 2018");
		firmNameLbl = new JLabel("Kakarot IT Corporation");
		copyrightLbl.setFont(new Font("Times New Roman", Font.PLAIN,13));
		firmNameLbl.setFont(new Font("Times New Roman", Font.PLAIN,13));
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0,40,10,0);

		gc.gridx = 3;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,10,40);
		
		add(copyrightLbl,gc);
		add(firmNameLbl, gc);
	}
}
