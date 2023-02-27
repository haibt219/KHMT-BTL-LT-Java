package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import backend.presentationlayer.UserController;

public class Main {

	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		try {
			// create instance of the CreateLoginForm
			LoginForm form = new LoginForm();
			form.setSize(300, 100); // set size of the frame
			form.setVisible(true); // make form visible to the user
		} catch (Exception e) {
			// handle exception
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		UserController userController = new UserController();
		System.out.println(userController.getAllUser());
	}

}
