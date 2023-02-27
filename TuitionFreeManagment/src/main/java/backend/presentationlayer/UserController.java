package backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import backend.businesslayer.IUsersService;
import backend.businesslayer.UsersService;
import entity.User;

public class UserController {
	private IUsersService service;

	public UserController() throws FileNotFoundException, IOException {
		service = new UsersService();
	}

	public List<User> getAllUser() throws ClassNotFoundException, SQLException {
		return service.getAllUser();
	}

	public User getUserById(int id) throws ClassNotFoundException, SQLException {
		return service.getUserById(id);
	}

	public int deleteStudentById(int id) throws ClassNotFoundException, SQLException {
		return service.deleteStudentById(id);
	}

	public User login(String username, String password) throws ClassNotFoundException, SQLException {
		return service.login(username, password);
	}

	public int createStudent(String fullname, String gender, Date birthday, String address, String numberPhone,
			String email, String username, String password, int faculty, Date createDate, double totalMoneyAvailable)
			throws ClassNotFoundException, SQLException {
		return service.createStudent(fullname, gender, birthday, address, numberPhone, email, username, password,
				faculty, createDate, totalMoneyAvailable);
	}

	public boolean isUserExistsByUsername(String username) throws SQLException, ClassNotFoundException {
		return service.isUserExistsByUsername(username);
	}

	public int changePasswordById(int id, String username, String password)
			throws ClassNotFoundException, SQLException {
		return service.changePasswordById(id, username, password);
	}
}
