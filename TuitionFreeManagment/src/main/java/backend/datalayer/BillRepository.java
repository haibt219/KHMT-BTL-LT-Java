package backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entity.Bill;
import entity.Subject;
import entity.User;
import utils.JDBCUtils;

public class BillRepository implements IBillRepository {
	private JDBCUtils jdbcUtils;

	public BillRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
	}

	public List<Bill> getAllBIll() throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnect();

			List<Bill> listBills = new ArrayList<Bill>();

			Statement statement = connection.createStatement();
			String query = "SELECT * FROM bill";
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				int billId = resultSet.getInt("BillID");
				User user = new User();
				user = (User) resultSet.getObject("UserID");
				Subject subject = new Subject();
				subject = (Subject) resultSet.getObject("SubjectID");
				double totalMoney = resultSet.getDouble("TotalMoney");
				String note = resultSet.getString("Note");
				Date createDate = resultSet.getDate("CreateDate");

				Bill bill = new Bill(user, subject, totalMoney, note, createDate);
				bill.setBillId(billId);
				listBills.add(bill);
			}
			return listBills;
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcUtils.disConnect();
		}
		return null;
	}

	public Bill getBIllByUserId(int userId) throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnect();

			String query = "SELECT * FROM tuitionfeemanagement.bill WHERE UserID = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, userId);

			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				int billID = resultSet.getInt("BillID");
				User user = new User();
				user = (User) resultSet.getObject("UserID");
				Subject subject = new Subject();
				subject = (Subject) resultSet.getObject("SubjectID");
				double totalMoney = resultSet.getDouble("TotalMoney");
				String note = resultSet.getString("Note");
				Date createDate = resultSet.getDate("CreateDate");

				Bill bill = new Bill(user, subject, totalMoney, note, createDate);
				bill.setBillId(billID);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcUtils.disConnect();
		}

		return null;
	}

}
