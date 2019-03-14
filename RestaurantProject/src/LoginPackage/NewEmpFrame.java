/*
 * New employee window
 * 
 * This window is made in WindowBuilder.
 * The window shows up when the user wants to sign up (in next versions, only 
 * administrator will be able to add new users).
 * 
 * The window contains -nameField- for adding the name of new employee,
 * -userName- for user name of employee and two fields passwords, 
 * one for entering password, and one for checking password.
 * 
 * Button -New employee- create new user, and button -back- returns 
 * user to log in page. 
 * 
 */

package LoginPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class NewEmpFrame extends JFrame {
	
	private JLabel copyRightLbl;				
	private JLabel firmLbl;						 
	private JPanel contentPane;
	private JLabel lblRestourandName;
	
	private JLabel nameLbl;
	private JLabel userNameLbl;
	private JLabel passwordLbl;
	private JLabel chPasswordLbl;
	
	private JTextField nameField;
	private JTextField userNameField;
	private JPasswordField passwordField;
	private JPasswordField chPasswordField;
	
	private JLabel lblBackground;
	private JButton newBtn;
	private JButton btnBeck;
	private LoginFrame loginFrame;

	public NewEmpFrame() {
		
		//-----setting basic parameters for window----- 
		
		setFont(new Font("Impact", Font.PLAIN, 12));
		setLocation(535, 165);
		setTitle("RESTOURANT NAME");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Irina Stojanovic"		//----->path for IconImage for app
				+ "\\eclipse-workspace1\\RestaurantProject\\src\\AppPackage\\Icon.png"));
		setSize(new Dimension(300, 400));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//-----CONSTRUCTORS FOR COMMPONENTS WITH BASIC INFORMATIONS LIKE BOUNDS, FONTS, CORLOR ETC-----
		
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(300, 500));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblRestourandName = new JLabel("NEW EMPLOYEE");
		lblRestourandName.setBounds(0, 28, 294, 27);
		lblRestourandName.setForeground(new Color(0, 255, 255));
		lblRestourandName.setHorizontalAlignment(SwingConstants.CENTER);
		lblRestourandName.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		
		contentPane.add(lblRestourandName);
		copyRightLbl = new JLabel("\u00A9 2018");
		copyRightLbl.setBounds(10, 346, 48, 14);
		copyRightLbl.setForeground(new Color(255, 255, 255));
		copyRightLbl.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		contentPane.add(copyRightLbl);
		
		firmLbl = new JLabel("Kakarot IT Corporation");
		firmLbl.setBounds(94, 346, 190, 14);
		firmLbl.setHorizontalAlignment(SwingConstants.TRAILING);
		firmLbl.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		firmLbl.setForeground(new Color(255, 255, 255));
		contentPane.add(firmLbl);
		
		nameLbl = new JLabel("Name");
		nameLbl.setForeground(Color.WHITE);
		nameLbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nameLbl.setBounds(25, 106, 96, 14);
		contentPane.add(nameLbl);
		
		userNameLbl = new JLabel("User name");
		userNameLbl.setForeground(Color.WHITE);
		userNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		userNameLbl.setBounds(25, 131, 96, 14);
		contentPane.add(userNameLbl);
		
		passwordLbl = new JLabel("password");
		passwordLbl.setForeground(Color.WHITE);
		passwordLbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwordLbl.setBounds(25, 156, 96, 14);
		contentPane.add(passwordLbl);
		
		chPasswordLbl = new JLabel("check password");
		chPasswordLbl.setForeground(Color.WHITE);
		chPasswordLbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chPasswordLbl.setBounds(25, 181, 96, 14);
		contentPane.add(chPasswordLbl);
		
		nameField = new JTextField();
		nameField.setBounds(141, 103, 120, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		userNameField = new JTextField();
		userNameField.setColumns(10);
		userNameField.setBounds(141, 129, 120, 20);
		contentPane.add(userNameField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(141, 154, 120, 20);
		contentPane.add(passwordField);
		
		chPasswordField = new JPasswordField();
		chPasswordField.setBounds(141, 179, 120, 20);
		contentPane.add(chPasswordField);
		
		newBtn = new JButton("New employee");
		newBtn.setBorderPainted(false);
		newBtn.setForeground(new Color(0, 0, 0));
		newBtn.setBackground(new Color(160, 255, 255));
		newBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		newBtn.setBounds(155, 238, 120, 23);
		contentPane.add(newBtn);
		
		btnBeck = new JButton("Back");
		btnBeck.setForeground(Color.BLACK);
		btnBeck.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBeck.setBorderPainted(false);
		btnBeck.setBackground(new Color(160, 255, 255));
		btnBeck.setBounds(20, 238, 120, 23);
		contentPane.add(btnBeck);
		
		
		//-----JLabel is used for setting up a background image-----
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 300, 400);
		lblBackground.setIcon(new ImageIcon("C:\\Users\\Irina Stojanovic\\"
				+ "eclipse-workspace1\\RestaurantProject\\src\\LoginPackage\\LogInBackground.jpeg"));
		contentPane.add(lblBackground);
		
		
		
		/*
		 * Action listener for button -new-
		 * 
		 * 	It takes user -name- and -password- only if -passwordField- and -chPasswordField- are equal
		 * 	If content of these two fields are not equal, then Error occur. When message dialog is closed, 
		 * 	both fields will be empty and ready for new input. 
		 * 	If the input is correct, -setUserName- method and -setPassword- method from class LoginFrame
		 * 	are called respectively.(Check comment for these methods for more info)
		 * 	If methods don't return ErrorException -loginFrame- is set to visible and this window is disposed.
		 */
		
		newBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(passwordField.getText().equals(chPasswordField.getText())) {
					try {
						loginFrame = new LoginFrame();
						
						loginFrame.setUserName(userNameField.getText());
						loginFrame.setPassword(passwordField.getText());
						
						loginFrame.setVisible(true);
						dispose();
						
					} catch (ErrorException ex) {
						JOptionPane.showMessageDialog(null, ex.OutMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "incorrect password check, try again");
					passwordField.setText("");
					chPasswordField.setText("");
				}
			}
		});
		
		
		
		/*
		 * Action listener for button -back-
		 * 
		 * 	When button is clicked this window will dispose and log in window will appear
		 */
		
		btnBeck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginFrame = new LoginFrame();
				loginFrame.setVisible(true);
				dispose();
			}
		});
	}
	
}
