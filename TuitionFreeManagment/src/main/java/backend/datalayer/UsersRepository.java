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

import entity.Admin;
import entity.Faculty;
import entity.Gender;
import entity.Role;
import entity.Student;
import entity.User;
import utils.JDBCUtils;

public class UsersRepository implements IUsersRepository {
	private JDBCUtils jdbcUtils;

	public UsersRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
	}

	@Override
	public List<User> getAllUser() throws ClassNotFoundException, SQLException {
		try {
			// Khởi tạo danh sách users
			List<User> listUser = new ArrayList<User>();

			// Khởi tạo connection kết nối với database
			Connection connection = jdbcUtils.getConnect();

			Statement statement = connection.createStatement();
			String query = "SELECT * FROM tuitionfeemanagement.users;";
			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				int id = resultSet.getInt("UserID");
				String fullname = resultSet.getString("Fullname");
				Gender gender = Gender.valueOf(resultSet.getString("Gender"));
				Date birthday = resultSet.getDate("Birthday");
				String address = resultSet.getString("Address");
				String numberPhone = resultSet.getString("NumberPhone");
				String email = resultSet.getString("Email");
				String username = resultSet.getString("Username");
				String password = resultSet.getString("Password");
				Role role = Role.valueOf(resultSet.getString("Role"));
//				Faculty faculty = new Faculty();
//				faculty = (Faculty) resultSet.getObject("FacultyID");
//				String faculty = resultSet.getString("FacultyID");

				Date createDate = resultSet.getDate("CreateDate");

				if (role.equals(Role.ADMIN)) {
					int yearOfExperience = resultSet.getInt("YearOfExperience");
					User admin = new Admin(fullname, gender, birthday, address, numberPhone, email, username, password,
							null, yearOfExperience);
					admin.setUserId(id);
					admin.setCreateDate(createDate);
					listUser.add(admin);
				} else {
					double totalMoneyAvailable = resultSet.getDouble("TotalMoneyAvailable");
					double totalDebt = resultSet.getDouble("TotalDebt");
					User student = new Student(fullname, gender, birthday, address, numberPhone, email, username,
							password, null, totalMoneyAvailable, totalDebt);
					student.setUserId(id);
					listUser.add(student);
				}

			}
			return listUser;
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcUtils.disConnect();
		}
		return null;
	}

	@Override
	public User getUserById(int id) throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnect();

			String query = "SELECT * FROM tuitionfeemanagement.users WHERE UserID = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);

			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				int id2 = resultSet.getInt("UserID");
				String fullname = resultSet.getString("Fullname");
				Gender gender = Gender.valueOf(resultSet.getString("Gender"));
				Date birthday = resultSet.getDate("Birthday");
				String address = resultSet.getString("Address");
				String numberPhone = resultSet.getString("NumberPhone");
				String email = resultSet.getString("Email");
				String username = resultSet.getString("Username");
				String password = resultSet.getString("Password");
				Role role = Role.valueOf(resultSet.getString("Role"));
				Faculty faculty = new Faculty();
				faculty = (Faculty) resultSet.getObject("FacultyID");
				Date createDate = resultSet.getDate("CreateDate");

				if (role.equals("ADMIN")) {
					int yearOfExperience = resultSet.getInt("YearOfExperience");
					User admin = new Admin(fullname, gender, birthday, address, numberPhone, email, username, password,
							faculty, yearOfExperience);
					admin.setUserId(id2);
					admin.setCreateDate(createDate);
					return admin;
				} else {
					double toDebt = resultSet.getDouble("TotalDebt");
					double totalMoneyAvailable = resultSet.getDouble("TotalMoneyAvailable");

					User student = new Student(fullname, gender, birthday, address, numberPhone, email, username,
							password, faculty, totalMoneyAvailable, toDebt);
					student.setUserId(id2);
					return student;
				}
			} else {
				return null;
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

	@Override
	public int deleteStudentById(int id) throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnect();

			String query = "DELETE FROM tuitionfeemanagement.users WHERE UserID = ? AND `Role` = 'STUDENT'";
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

	@Override
	public User login(String username, String password) throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnect();

			String query = "SELECT UserID, Fullname, Role FROM tuitionfeemanagement.users WHERE Username = ? AND Password = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, password);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				int id = resultSet.getInt("UserID");
				String fullname = resultSet.getString("Fullname");

				Role role = Role.valueOf(resultSet.getString("Role"));

				if (role.equals(Role.ADMIN)) {
					User admin = new Admin();
					admin.setUserId(id);
					admin.setFullname(fullname);
					admin.setRole(role);
					return admin;
				} else {
					User student = new Student();
					student.setUserId(id);
					student.setFullname(fullname);
					student.setRole(role);
					return student;
				}
			} else {
				return null;
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

	@Override
	public int createStudent(String fullname, String gender, Date birthday, String address, String numberPhone,
			String email, String username, String password, int faculty, Date createDate, double totalMoneyAvailable)
			throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnect();

			String query = "INSERT INTO users	(Fullname	, 	Gender	, 	Birthday	, 	Address	, 	NumberPhone	, 	Email 	, Username	, Password	, Role		, FacultyID	, TotalMoneyAvailable	, CreateDate) "
					+ "VALUES					(?			,	?		,	?			, 	?		,	?			,	?		, ?			, '123456'	, 'STUDENT'	, ?			, 0						, NOW());";

			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, fullname);
			statement.setString(2, gender);
			statement.setDate(3, (java.sql.Date) birthday);
			statement.setString(4, address);
			statement.setString(5, numberPhone);
			statement.setString(6, email);
			statement.setString(7, username);
			statement.setInt(8, faculty);

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

	@Override
	public boolean isUserExistsByUsername(String username) throws SQLException, ClassNotFoundException {
		try {
			Connection connection = jdbcUtils.getConnect();

			String query = "SELECT 1 FROM tuitionfeemanagement.users WHERE Username = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, username);

			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcUtils.disConnect();
		}
		return false;
	}

	@Override
	public int changePasswordById(int id, String username, String password)
			throws ClassNotFoundException, SQLException {
		try {
			Connection connection = jdbcUtils.getConnect();

			String query = "UPDATE user SET Username = ?, Password = ? WHERE UserID = ?;";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, password);
			statement.setInt(3, id);

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
