/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class User_Xem_thanh_toan extends javax.swing.JFrame {

	/**
	 * Creates new form User_Xem_thanh_toan
	 */
	public User_Xem_thanh_toan() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		lbTensinhvien = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		lbMasv = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		lbKhoa = new javax.swing.JLabel();
		btnLeave = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		TableHocphan = new javax.swing.JTable();
		btnConfirm = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		lbTensinhvien1 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		lbTensinhvien2 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		lbTensinhvien3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel1.setText("Họ và tên :");

		lbTensinhvien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		lbTensinhvien.setText("User");

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel2.setText("Mã sinh viên :");

		lbMasv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		lbMasv.setText("123");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel3.setText("Khoa :");

		lbKhoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		lbKhoa.setText("KHMT");

		btnLeave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		btnLeave.setText("Quay lại");
		btnLeave.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLeaveActionPerformed(evt);
			}
		});

		TableHocphan.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null } },
				new String[] { "Tên học phần", "Mã học phần", "Số tín chỉ", "Thành tiền", "Trạng thái" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class,
					java.lang.Double.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false, false, false };

			@Override
			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		TableHocphan.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				TableHocphanMouseEntered(evt);
			}
		});
		jScrollPane1.setViewportView(TableHocphan);

		btnConfirm.setText("Xác nhận");
		btnConfirm.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnConfirmActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel4.setText("Số dư tài khoản :");

		lbTensinhvien1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		lbTensinhvien1.setText("1.000.000đ");

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel5.setText("Số tiền cần thanh toán :");

		lbTensinhvien2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		lbTensinhvien2.setText("1.000.000đ");

		jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel6.setText("Số tiền hệ thống sẽ trừ :");

		lbTensinhvien3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		lbTensinhvien3.setText("0đ");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(btnLeave))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(87, 87, 87).addComponent(
												jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(btnConfirm)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
														.createSequentialGroup()
														.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
																69, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(lbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE,
																79, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jLabel6).addGap(
																18, 18, 18)
														.addComponent(lbTensinhvien3,
																javax.swing.GroupLayout.PREFERRED_SIZE, 79,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup().addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																		layout.createSequentialGroup().addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				69,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGap(18, 18, 18)
																				.addComponent(lbTensinhvien,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						79,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		layout.createSequentialGroup().addComponent(
																				jLabel2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				77,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addComponent(
																						lbMasv,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						79,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
																.addGap(26, 26, 26)
																.addGroup(layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(layout.createSequentialGroup()
																				.addComponent(jLabel5)
																				.addGap(18, 18, 18)
																				.addComponent(
																						lbTensinhvien2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						79,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(layout.createSequentialGroup()
																				.addComponent(jLabel4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						92,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGap(18, 18, 18)
																				.addComponent(lbTensinhvien1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						79,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))))
								.addGap(0, 103, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(17, 17, 17).addComponent(btnLeave)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel4).addComponent(lbTensinhvien1))
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lbTensinhvien).addComponent(jLabel1)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel5).addComponent(lbTensinhvien2))
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel2).addComponent(lbMasv)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel6).addComponent(lbTensinhvien3))
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel3).addComponent(lbKhoa)))
						.addGap(18, 18, 18)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
						.addComponent(btnConfirm).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void TableHocphanMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TableHocphanMouseEntered
		// TODO add your handling code here:
	}// GEN-LAST:event_TableHocphanMouseEntered

	private void btnLeaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLeaveActionPerformed
		new User_Thanh_toan().setVisible(true);
		this.dispose();
	}// GEN-LAST:event_btnLeaveActionPerformed

	private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnConfirmActionPerformed
		int msg = JOptionPane.showConfirmDialog(null, "Xác nhận thanh toán?", "Thông báo", JOptionPane.YES_NO_OPTION);
		if (msg == JOptionPane.YES_OPTION) {
			this.dispose();
			JOptionPane.showMessageDialog(null, "Thanh toán thành công!");
		}
	}// GEN-LAST:event_btnConfirmActionPerformed

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
			java.util.logging.Logger.getLogger(User_Xem_thanh_toan.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(User_Xem_thanh_toan.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(User_Xem_thanh_toan.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(User_Xem_thanh_toan.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new User_Xem_thanh_toan().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTable TableHocphan;
	private javax.swing.JButton btnConfirm;
	private javax.swing.JButton btnLeave;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lbKhoa;
	private javax.swing.JLabel lbMasv;
	private javax.swing.JLabel lbTensinhvien;
	private javax.swing.JLabel lbTensinhvien1;
	private javax.swing.JLabel lbTensinhvien2;
	private javax.swing.JLabel lbTensinhvien3;
	// End of variables declaration//GEN-END:variables
}