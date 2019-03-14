//Main method is in this class

package AppPackage;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import LoginPackage.LoginFrame;

public class App {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
	}
}
