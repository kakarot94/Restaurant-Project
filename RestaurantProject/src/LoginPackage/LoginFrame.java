/*
 * Log in window 
 * 
 * When the application is started, this window will be first to show up.
 * Before the user continue to main window, he/she must first log in.
 * 		-At this moment first new employee must be created before trying to log in.-
 * 		-in the next version i will add administrator and work on input -
 * 		-new users(employees) in database-
 * Log in window contains user name field for entering user name, password field
 * for validation of the user and two button, one for signing in and one for
 * making new employee.
 * 
 */

package LoginPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

import MainPackage.MainWindow;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField userNameField;
	private JLabel userLbl;
	private JLabel passwordLbl;
	private JButton logINBtn;
	private JButton newEmployeeBtn;
	private JLabel copyRightLbl;
	private JLabel firmLbl;
	private JPasswordField passwordField;
	private MainWindow main;
	private ArrayList<String> password;
	private ArrayList<String> userName;
	private int i = 0;
	
	public LoginFrame() {
		
		//-----setting basic parameters for window----- 
		
		setFont(new Font("Impact", Font.PLAIN, 12));
		setLocation(535, 165);
		setTitle("RESTOURANT NAME");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Irina Stojanovic\\"
				+ "eclipse-workspace1\\RestaurantProject\\src\\AppPackage\\Icon.png"));
		setSize(new Dimension(300, 400));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//-----CONSTRUCTORS FOR COMMPONENTS WITH BASIC INFORMATIONS LIKE BOUNDS, FONTS, CORLOR ETC-----
		
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(300, 500));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRestourandName = new JLabel("RESTOURAND NAME");
		lblRestourandName.setForeground(new Color(0, 255, 255));
		lblRestourandName.setHorizontalAlignment(SwingConstants.CENTER);
		lblRestourandName.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		lblRestourandName.setBounds(0, 28, 294, 27);
		contentPane.add(lblRestourandName);
		
		userNameField = new JTextField();
		userNameField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		userNameField.setBounds(80, 90, 140, 25);
		contentPane.add(userNameField);
		userNameField.setColumns(1);
		
		userLbl = new JLabel("USER NAME");
		userLbl.setHorizontalAlignment(SwingConstants.CENTER);
		userLbl.setForeground(new Color(255, 255, 255));
		userLbl.setFont(new Font("Sitka Subheading", Font.ITALIC, 13));
		userLbl.setBounds(80, 120, 140, 15);
		contentPane.add(userLbl);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(80, 149, 140, 25);
		contentPane.add(passwordField);
		
		passwordLbl = new JLabel("PASSWORD");
		passwordLbl.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLbl.setForeground(Color.WHITE);
		passwordLbl.setFont(new Font("Sitka Subheading", Font.ITALIC, 13));
		passwordLbl.setBounds(80, 180, 140, 15);
		contentPane.add(passwordLbl);
		
		logINBtn = new JButton("LOG IN");
		logINBtn.setVerticalAlignment(SwingConstants.TOP);
		logINBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		logINBtn.setBorderPainted(false);
		logINBtn.setForeground(new Color(0, 0, 0));
		logINBtn.setBackground(new Color(160, 255, 255));
		logINBtn.setFont(new Font("Sitka Subheading", Font.ITALIC, 12));
		logINBtn.setBounds(110, 220, 80, 20);
		contentPane.add(logINBtn);
		
		newEmployeeBtn = new JButton("NEW");
		newEmployeeBtn.setVerticalAlignment(SwingConstants.TOP);
		newEmployeeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		newEmployeeBtn.setBorderPainted(false);
		newEmployeeBtn.setForeground(new Color(0, 0, 0));
		newEmployeeBtn.setBackground(new Color(160, 255, 255));
		newEmployeeBtn.setFont(new Font("Sitka Subheading", Font.ITALIC, 12));
		newEmployeeBtn.setBounds(110, 250, 80, 20);
		contentPane.add(newEmployeeBtn);
		
		copyRightLbl = new JLabel("\u00A9 2018");
		copyRightLbl.setForeground(new Color(255, 255, 255));
		copyRightLbl.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		copyRightLbl.setBounds(10, 346, 48, 14);
		contentPane.add(copyRightLbl);
		
		firmLbl = new JLabel("Kakarot IT Corporation");
		firmLbl.setHorizontalAlignment(SwingConstants.TRAILING);
		firmLbl.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		firmLbl.setForeground(new Color(255, 255, 255));
		firmLbl.setBounds(163, 346, 121, 14);
		contentPane.add(firmLbl);
		
		
		//-----JLabel is used for setting up a background image-----
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("C:\\Users\\Irina Stojanovic\\eclipse-workspace1\\RestaurantProject\\src\\LoginPackage\\LogInBackground.jpeg"));
		lblBackground.setBounds(0, 0, 300, 400);
		contentPane.add(lblBackground);
		
		password = new ArrayList<String>();		//-----> Array list for storing passwords
		userName = new ArrayList<String>();		//-----> Array list for storing user names
		
		/*
		 * Action listener for button -newEmployee-
		 * 
		 * when button is clicked this window will dispose and -New employee- window will appear
		 * message dialog pops up if something go wrong
		 */
		
		newEmployeeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					NewEmpFrame newEmpFrame = new NewEmpFrame();
					newEmpFrame.setVisible(true);
					dispose();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error");
				}
			}
		});
		
		/*
		 * Action listener for button -logIn-
		 * ----button uses method login----
		 * 
		 * when button is clicked :
		 * 		1. check if user name and password are entered. If not, message pops up to enter user name and password.
		 * 		2. check if one variable(user name or password) is entered, if not, message pops up to enter missing one.
		 * 		3. if user name and password are entered then methods -checkUserName- and -checkPassword- are called.
		 * 				(check method for info)
		 * 		4. if error occur in one of the methods then message dialog pops up with error info.
		 * 		5. if everything goes correctly then the -LoginFrame- is disposed and the -MainWindow- is created.  
		 * 
		 */
		
		logINBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				login();
			}
		});
	}
	
	
	private void login() {		//-----> check comment for ActionListener for -logInBtn- button for info about this method
		if(userNameField.getText().isBlank() && passwordField.getText().isBlank()) {
			JOptionPane.showMessageDialog(null, "Please enter user name and password.", "", JOptionPane.ERROR_MESSAGE);
		}else if(userNameField.getText().isBlank()) {
			JOptionPane.showMessageDialog(null, "Please enter user name.", "", JOptionPane.ERROR_MESSAGE);
		} else if(passwordField.getText().isBlank()) {
			JOptionPane.showMessageDialog(null, "Please enter password.", "", JOptionPane.ERROR_MESSAGE);
		} else {
			try {
				checkUserName(userNameField.getText());
				checkPassword(passwordField.getText().toString());
				dispose();
				main = new MainWindow();
				main.setVisible(true);
			} catch (ErrorException ex) {
				JOptionPane.showMessageDialog(null, ex.OutMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	/*
	 * Method -checkUserName-
	 * 
	 * 	When method is called, it is checked if there is such -userName- in the ArrayList -userName-.
	 * 	If not, error is thrown with message, and user name field and password field are set to empty.
	 * 	If there is such user name, then boolean variable is set to true, the loop will not be executed
	 * 	and ErrorException will not be thrown. Class variable i is set to number on witch user name is 
	 * 	located inside ArrayList. This variable is later used for checking password in -checkPassword- method.
	 */
	
	private void checkUserName(String userName) throws ErrorException {
		final String s = "User does not exist";
		boolean t = false;
		for (int i = 0; i < this.userName.size(); i++) {
		      if(this.userName.get(i).equals(userName)) {
		    	  t = true;
		    	  this.i = i;
		      } 
		}
		if (t == false) {
			this.userNameField.setText("");
			this.passwordField.setText("");
			throw new ErrorException(s);
		} 
	}
	
	/*
	 *Method -checkPassword-
	 *	
	 *	When method is called, it uses class variable -i- to search -password- in ArrayList password and
	 *	check it with provided password from user. If password is incorrect then ErrorException is thrown
	 *	with message. If password is correct nothing need to be done.
	 */
	
	private void checkPassword(String password) throws ErrorException{
		final String pass = "Wrong password";
		if(this.password.get(this.i).equals(password)) {
			//Password provided from user is correct and nothing need to be done.
		} else {
			throw new ErrorException(pass);
		}
	}
	
	/*
	 * Method -setUserName-
	 * 
	 * 	First it checks if ArrayList is empty, if true, puts user name in first(0) position and sets 
	 * 	variable i to 0. If false, search for first empty position in list, puts user name provided 
	 * 	by user in that empty spot and assigns a value of position of that empty stop to variable -i-.
	 * 	Variable -i- is later used for putting password at the same position in list password as user 
	 * 	name in list userName.
	 * 	If there is same userName in the list as the user name provided by user, then ErrorException
	 * 	occur.
	 */

	public void setUserName(String userName) throws ErrorException {
		if(this.userName.isEmpty()) {
			int i = 0;
			this.userName.add(i, userName);
			this.i = 0;
		} else {
			for (int b = 0; b < this.userName.size(); b++) {
				if(this.userName.get(b).isBlank()) {
					this.userName.add(b, userName);
					this.i = b;
				} else if(this.userName.get(b).equals(userName)){
					throw new ErrorException("User name alredy taken!");
				}
			}
		}
	}

	/*
	 * Method -setPassword-
	 * 	
	 * 	Variable -i- is used for putting password at the same position in list password as user 
	 * 	name in list userName.
	 */
	
	public void setPassword(String password) {
		this.password.add(this.i, password);
	}
	
}
