package frontend;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import backend.presentationlayer.UserController;
import entity.Role;
import entity.User;

public class LoginForm extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserController userController;
	// initialize button, panel, label, and text field
	JButton b1;
	JPanel newPanel;
	JLabel userLabel, passLabel;
	final JTextField textField1, textField2;

	// calling constructor
	LoginForm() throws FileNotFoundException, IOException {

		userController = new UserController();

		// create label for username
		userLabel = new JLabel();
		userLabel.setText("Username"); // set label value for textField1

		// create text field to get username from the user
		textField1 = new JTextField(15); // set length of the text

		// create label for password
		passLabel = new JLabel();
		passLabel.setText("Password"); // set label value for textField2

		// create text field to get password from the user
		textField2 = new JPasswordField(15); // set length for the password

		// create submit button
		b1 = new JButton("LOGIN"); // set label to button

		// create panel to put form elements
		newPanel = new JPanel(new GridLayout(3, 1));
		newPanel.add(userLabel); // set username label to panel
		newPanel.add(textField1); // set text field to panel
		newPanel.add(passLabel); // set password label to panel
		newPanel.add(textField2); // set text field to panel
		newPanel.add(b1); // set button to panel

		// set border to panel
		add(newPanel, BorderLayout.CENTER);

		// perform action on button click
		b1.addActionListener(this); // add action listener to button
		setTitle("LOGIN FORM"); // set title to the login form
	}

	// define abstract method actionPerformed() which will be called on button click
	@Override
	public void actionPerformed(ActionEvent ae) // pass action listener as a parameter
	{

		try {
			String userValue = textField1.getText(); // get user entered username from the textField1
			String passValue = textField2.getText(); // get user entered pasword from the textField2
			User user = userController.login(userValue, passValue);

			// check whether the credentials are authentic or not
			if (user != null && user.getRole().equals(Role.ADMIN)) { // if authentic, navigate user to a new
				// page

				// create instance of the TuitionFeeManagement
				Admin_page admin_page = new Admin_page();

				// make page visible to the user
				admin_page.setVisible(true);

				// create a welcome label and set it to the new page
				JLabel wel_label = new JLabel("Welcome: " + userValue);
				admin_page.getContentPane().add(wel_label);
				dispose();
			} else if (user != null && user.getRole().equals(Role.STUDENT)) {
				// create instance of the TuitionFeeManagement
				NewPage page = new NewPage();

				// make page visible to the user
				page.setVisible(true);

				// create a welcome label and set it to the new page
				JLabel wel_label = new JLabel("Welcome: " + userValue);
				page.getContentPane().add(wel_label);
				dispose();
			} else {
				// show error message
				System.out.println("Please enter valid username and password");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
