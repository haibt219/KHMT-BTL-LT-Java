package backend.businesslayer;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import entity.User;

public interface IUsersService {
	public List<User> getAllUser() throws ClassNotFoundException, SQLException;

	public User getUserById(int id) throws ClassNotFoundException, SQLException;

	public int deleteStudentById(int id) throws ClassNotFoundException, SQLException;

	public User login(String username, String password) throws ClassNotFoundException, SQLException;

	public int createStudent(String fullname, String gender, Date birthday, String address, String numberPhone,
			String email, String username, String password, int faculty, Date createDate, double totalMoneyAvailable)
			throws ClassNotFoundException, SQLException;

	public boolean isUserExistsByUsername(String username) throws SQLException, ClassNotFoundException;
}
