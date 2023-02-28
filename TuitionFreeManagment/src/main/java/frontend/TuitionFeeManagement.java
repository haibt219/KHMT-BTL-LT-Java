package frontend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TuitionFeeManagement extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private JLabel nameLabel;
	private JTextField nameTextField;
	private JButton submitButton;
	private JTable feeTable;
	private JButton btnLogout;

	public TuitionFeeManagement() {
		// Set up the main window
		setTitle("Tuition Fee Management System");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create the UI components
		mainPanel = new JPanel();
		nameLabel = new JLabel("Student ID:");
		nameTextField = new JTextField(20);
		submitButton = new JButton("Search");
		feeTable = new JTable(new Object[][] {},
				new Object[] { "Student ID", "Student Name", "Fee Amount", "Due Date" });
		JScrollPane scrollPane = new JScrollPane(feeTable);

		//
		btnLogout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnLogout.setText("Đăng xuất");
		btnLogout.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLogoutActionPerformed(evt);
			}
		});

		// Add the UI components to the panel
		mainPanel.add(nameLabel);
		mainPanel.add(nameTextField);
		mainPanel.add(submitButton);
		mainPanel.add(scrollPane);

		// Add the panel to the frame
		add(mainPanel);

		// Add action listener to the button
		submitButton.addActionListener(this);
	}

	private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLogoutActionPerformed
		new TuitionFeeManagement().setVisible(true);
		this.dispose();

	}// GEN-LAST:event_btnLogoutActionPerformed

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// Get the student's name from the text field
//		String name = nameTextField.getText();
//
//		// TODO: look up the tuition fee information from a database or file using the
//		// student's name
//
//		// TODO: update the JTable with the fee information
//	}

}
