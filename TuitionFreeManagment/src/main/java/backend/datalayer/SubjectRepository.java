package backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Subject;
import utils.JDBCUtils;

public class SubjectRepository implements ISubjectRepository {
	private JDBCUtils jdbcUtils;

	public SubjectRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
	}

	public List<Subject> getAllSubject() throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnect();

			Statement statement = connection.createStatement();
			String query = "SELECT * FROM tuitionfeemanagement.subject";

			ResultSet resultSet = statement.executeQuery(query);

			List<Subject> listSubjects = new ArrayList<Subject>();

			while (resultSet.next()) {
				int id = resultSet.getInt("SubjectID");
				String subjectName = resultSet.getString("SubjectName");
				int signalNumber = resultSet.getInt("subjectName");
				double amountOfMoney = resultSet.getDouble("AmountOfMoney");

				Subject subject = new Subject(subjectName, signalNumber, amountOfMoney);
				subject.setSubjectId(id);
				listSubjects.add(subject);
			}
			return listSubjects;
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcUtils.disConnect();
		}
		return null;
	}

	public Subject getSubjectBySubjectName(String subjectName) throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnect();

			String query = "SELECT * FROM tuitionfeemanagement.subject WHERE SubjectName LIKE '%?%'";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, subjectName);

			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				int id = resultSet.getInt("SubjectID");
				String subjectName2 = resultSet.getString("SubjectName");
				int signalNumber = resultSet.getInt("subjectName");
				double amountOfMoney = resultSet.getDouble("AmountOfMoney");

				Subject subject = new Subject(subjectName2, signalNumber, amountOfMoney);
				subject.setSubjectId(id);
				return subject;
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

	public Subject getSubjectBySubjectId(int id) throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnect();

			String query = "SELECT * FROM tuitionfeemanagement.subject WHERE SubjectID = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);

			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				int id2 = resultSet.getInt("SubjectID");
				String subjectName = resultSet.getString("SubjectName");
				int signalNumber = resultSet.getInt("subjectName");
				double amountOfMoney = resultSet.getDouble("AmountOfMoney");

				Subject subject = new Subject(subjectName, signalNumber, amountOfMoney);
				subject.setSubjectId(id2);
				return subject;
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

	public int createSubject(String subjectName, int signalNumber, double amountOfMoney)
			throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnect();
			String query = "INSERT INTO subject (SubjectName,	SignalNumber,	amountOfMoney)"
					+ "VALUES					(?			,	?			,	?			 )";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, subjectName);
			statement.setInt(2, signalNumber);
			statement.setDouble(3, amountOfMoney);

			int count = statement.executeUpdate();
			return count;
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcUtils.disConnect();
		}
		return 0;
	}

	public int deleteSubject(int id) throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnect();

			String query = "DELETE FROM subject WHERE SubjectID = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);

			int count = statement.executeUpdate();
			return count;

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcUtils.disConnect();
		}
		return 0;
	}

	public int updateSubjectById(int id) throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnect();
			String query = "UPDATE `subject` SET SignalNumber = ?, SignalNumber = ? ";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			int count = statement.executeUpdate();
			return count;
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcUtils.disConnect();
		}
		return 0;
	}

}
