package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import backend.presentationlayer.SubjectController;
import entity.Subject;

public class Main {

	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		try {
//			// create instance of the CreateLoginForm
//			LoginForm form = new LoginForm();
//			form.setSize(300, 100); // set size of the frame
//			form.setVisible(true); // make form visible to the user
//		} catch (Exception e) {
//			// handle exception
//			JOptionPane.showMessageDialog(null, e.getMessage());
//		}

		SubjectController controller = new SubjectController();
		List<Subject> list = new ArrayList<Subject>();
		list = controller.getAllSubject();
		for (Subject subject : list) {
			System.out.println(subject.getSubjectId());
		}

	}

}
