/*
 * MainManuHeader panel consists from panel -LeftSide-, JLabel -nameLabel- in the middle
 * and panel -RightPanel-. RightPanel consists from one JLabel -userNameLbl- (Up) and
 * panel -LogPanel- (Down)
 */

package MainPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainMenuHeader extends JPanel	{
	private RightSide rightSide;
	private LeftSide leftSide;
	private JLabel nameLabel;
	
	public MainMenuHeader() {
		
		//----->setting basic parameters for -MainManuHeader- panel
		setBackground(new Color(0, 0, 0, 0));
		Font f = new Font("Symbol bold", Font.ITALIC,40);
		
		//---->constructing panels for MainManuHeader and setting parameters for them
		rightSide = new RightSide();
		leftSide = new LeftSide();
		nameLabel = new JLabel("RESTAURANT NAME");
		nameLabel.setFont(f);
		
		Dimension d = new Dimension(200	, 80);
		rightSide.setPreferredSize(d);
		d = new Dimension(200	, 60);
		leftSide.setPreferredSize(d);
		d = new Dimension(870	, 80);
		nameLabel.setPreferredSize(d);
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(leftSide);
		add(nameLabel);
		add(rightSide);
	}
}

class LeftSide extends JPanel {

	public LeftSide() {
		
		//----->setting basic parameters for -LeftSide- panel
		setBackground(new Color(0,0,0,0));
		setMaximumSize(new Dimension(200, 60));
		setLayout(null);
		
		JLabel TimeLabel = new JLabel("TIME");
		TimeLabel.setBounds(30, 5, 40, 25);
		
		JButton helpBtn = new JButton("?");
		helpBtn.setForeground(Color.BLACK);
		helpBtn.setFont(new Font("Tahoma bold", Font.BOLD, 10));
		helpBtn.setBounds(110, 5, 50, 25);
		
		JLabel DateLabel = new JLabel("DATE");
		DateLabel.setBounds(30, 35, 40, 25);
		
		JButton languageBtn = new JButton("En");
		languageBtn.setForeground(Color.BLACK);
		languageBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		languageBtn.setBounds(110, 35, 50, 25);
		
		
		add(TimeLabel);
		add(helpBtn);
		add(DateLabel);
		add(languageBtn);
		
		/*
		 * Action listener for -lenguageBtn- button
		 * 
		 * When button is clicked the text for button is changed.
		 * 
		 * In next versions this button will change whole application from English language version to
		 * Serbian language.
		 */
		languageBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(languageBtn.getText().equals("En")) 
				{
					languageBtn.setText("Srb");
				} else	{
					languageBtn.setText("En");
				}
			}
		});
	}
}

//-----> RightSide panel consists from one JLabel -userName- and one LogPanel-
class RightSide extends JPanel	{
	private JLabel userNameLbl;
	private LogPanel logPanel;
	
	RightSide() {
		
		//----->setting basic parameters for -RightSide- panel
		setBackground(new Color(0, 0, 0, 0));
		setLayout(new BorderLayout());
		
		//-----> setting parameters for -userNameLbl-, -userNameLbl- goes up in the -RightSide- panel
		userNameLbl = new JLabel("---user name---");
		userNameLbl.setFont(new Font("Dialog", Font.PLAIN,15));
		userNameLbl.setPreferredSize(new Dimension(150	, 50));
		userNameLbl.setBorder(BorderFactory.createTitledBorder("employee"));
		add(userNameLbl, BorderLayout.NORTH);
		
		logPanel = new LogPanel();
		add(logPanel, BorderLayout.SOUTH);
		
	}
}

class LogPanel extends JPanel {			//----->This panel goes down in the -RightSide- panel
	private JButton logBtn;
	
	public LogPanel(){
		
		//----->setting basic parameters for -LogPanel- panel
		setBackground(new Color(0, 0, 0, 0));
		setLayout(new BorderLayout());
		
		//----->setting basic parameters for -logBtn-, 
		//----->this button goes to lower right corner in -RightSide- Panel
		logBtn = new JButton("Log In");
		logBtn.setBackground(Color.WHITE);
		logBtn.setForeground(Color.BLACK);
		logBtn.setFont(new Font("Symbol bold", Font.BOLD,12));
		add(logBtn, BorderLayout.EAST);
	}
}
