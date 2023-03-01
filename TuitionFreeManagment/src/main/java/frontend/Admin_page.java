/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import backend.presentationlayer.SubjectController;
import entity.Subject;

/**
 *
 * @author ADMIN
 */
public class Admin_page extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	// private static SubjectController subjectController;
	private static List<Subject> listSubjects = new ArrayList<Subject>();

	/**
	 * Creates new form Admin_page
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public Admin_page() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		initComponents();
		// subjectController = new SubjectController();

	}

	private static Object[][] getSubject()
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		SubjectController subjectController = new SubjectController();
		listSubjects = subjectController.getAllSubject();
		Object[][] data = null;
		for (Subject objects : listSubjects) {
			Object[][] a = { { objects.getSubjectName(), objects.getSubjectId(), objects.getSignalNumber(),
					objects.getAmountOfMoney() } };
			data = a;
		}
		return data;
	};

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		txtTenhp = new javax.swing.JTextField();
		txtMahp = new javax.swing.JTextField();
		txtSotc = new javax.swing.JTextField();
		btnAdd = new javax.swing.JButton();
		btnSua = new javax.swing.JButton();
		btnDel = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		btnLogout = new javax.swing.JButton();
		btnCongno = new javax.swing.JButton();
		btnTimkiem = new javax.swing.JButton();
		txtTimkiem = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 51, 51));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Quản lí học phí");

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel2.setText("Tên học phần");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel3.setText("Mã học phần");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel4.setText("Số tín chỉ");

		txtTenhp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		txtMahp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		txtSotc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		btnAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnAdd.setText("Thêm");
		btnAdd.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddActionPerformed(evt);
			}
		});

		btnSua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnSua.setText("Sửa");
		btnSua.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSuaActionPerformed(evt);
			}
		});

		btnDel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnDel.setText("Xóa");
		btnDel.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDelActionPerformed(evt);
			}
		});

//		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { getSubject() } },
//				new String[] { "Tên học phần", "Mã học phần", "Số tín chỉ", "Thành tiền" }) {
//			
//			
//
//			private static final long serialVersionUID = 1L;
//			Class[] types = new Class[] { java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class,
//					java.lang.Double.class };
//
//			@Override
//			public Class getColumnClass(int columnIndex) {
//				return types[columnIndex];
//			}
		// });
		String[][] data = { { "Kundan Kumar Jha", "4031", "CSE" }, { "Anand Jha", "6014", "IT" } };
		String[] columnNames = { "Name", "Roll Number", "Department" };
		// Initializing the JTable

//		jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnNames) {
//
//		});

		jTable1 = new javax.swing.JTable(data, columnNames);
		JFrame jFrame = new JFrame();
		jTable1.setBounds(30, 40, 200, 300);
		// adding it to JScrollPane
		JScrollPane sp = new JScrollPane(jTable1);
		jFrame.add(sp);
		// Frame Size
//		jFrame.setSize(500, 200);
//		jFrame.setLocationRelativeTo(null);
//		jFrame.setVisible(true);

		jTable1.setColumnSelectionAllowed(true);
		jScrollPane1.setViewportView(jTable1);
		jTable1.getColumnModel().getSelectionModel()
				.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//		if (jTable1.getColumnModel().getColumnCount() > 0) {
//			jTable1.getColumnModel().getColumn(0).setResizable(false);
//			jTable1.getColumnModel().getColumn(1).setResizable(false);
//			jTable1.getColumnModel().getColumn(2).setResizable(false);
//			jTable1.getColumnModel().getColumn(3).setResizable(false);
//		}

		btnLogout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnLogout.setText("Đăng xuất");
		btnLogout.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					btnLogoutActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		btnCongno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnCongno.setText("Theo dõi công nợ");
		btnCongno.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCongnoActionPerformed(evt);
			}
		});

		btnTimkiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnTimkiem.setText("Tìm kiếm theo mã học phần");
		btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnTimkiemActionPerformed(evt);
			}
		});

		txtTimkiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addGap(67, 67, 67).addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(btnLogout)
								.addContainerGap())
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane1)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												layout.createSequentialGroup()
														.addComponent(btnCongno, javax.swing.GroupLayout.PREFERRED_SIZE,
																152, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE,
																75, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE,
																75, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE,
																75, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE,
																81, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
																81, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(18, 18, 18)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(txtTenhp).addComponent(txtMahp)
																.addComponent(txtSotc,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 191,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36,
																Short.MAX_VALUE)
														.addComponent(txtTimkiem,
																javax.swing.GroupLayout.PREFERRED_SIZE, 176,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18).addComponent(btnTimkiem)))
								.addGap(66, 66, 66)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btnLogout)
						.addGap(10, 10, 10)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnCongno).addComponent(btnAdd).addComponent(btnDel).addComponent(btnSua))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(txtTenhp, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(txtMahp, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4)
								.addComponent(txtSotc, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTimkiem).addComponent(txtTimkiem,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException {// GEN-FIRST:event_btnLogoutActionPerformed
		new LoginForm().setVisible(true);
		this.dispose();

	}// GEN-LAST:event_btnLogoutActionPerformed

	private void btnCongnoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCongnoActionPerformed
		new Admin_Cong_No().setVisible(true);
		this.dispose();
	}// GEN-LAST:event_btnCongnoActionPerformed

	private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTimkiemActionPerformed

	}// GEN-LAST:event_btnTimkiemActionPerformed

	private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddActionPerformed
		new Admin_add().setVisible(true);
		this.dispose();
	}// GEN-LAST:event_btnAddActionPerformed

	private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSuaActionPerformed
		new Admin_Sua().setVisible(true);
		this.dispose();
	}// GEN-LAST:event_btnSuaActionPerformed

	private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDelActionPerformed
		int msg = JOptionPane.showConfirmDialog(null, "Xóa học phần?", "Thông báo", JOptionPane.YES_NO_OPTION);
		{
			if (msg == JOptionPane.YES_OPTION) {

			}
		}
	}// GEN-LAST:event_btnDelActionPerformed

//	private static Li

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Admin_page admin;
				try {
					admin = new Admin_page();
					admin.setVisible(true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnAdd;
	private javax.swing.JButton btnCongno;
	private javax.swing.JButton btnDel;
	private javax.swing.JButton btnLogout;
	private javax.swing.JButton btnSua;
	private javax.swing.JButton btnTimkiem;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField txtMahp;
	private javax.swing.JTextField txtSotc;
	private javax.swing.JTextField txtTenhp;
	private javax.swing.JTextField txtTimkiem;

	// End of variables declaration//GEN-END:variables
}
