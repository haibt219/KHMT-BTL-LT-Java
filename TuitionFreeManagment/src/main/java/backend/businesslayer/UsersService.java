package backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import backend.datalayer.IUsersRepository;
import backend.datalayer.UsersRepository;
import entity.User;

public class UsersService implements IUsersService {
	private IUsersRepository repository;

	public UsersService() throws FileNotFoundException, IOException {
		repository = new UsersRepository();
	}

	public List<User> getAllUser() throws ClassNotFoundException, SQLException {
		return repository.getAllUser();
	}

	public User getUserById(int id) throws ClassNotFoundException, SQLException {
		return repository.getUserById(id);
	}

	public int deleteStudentById(int id) throws ClassNotFoundException, SQLException {
		return repository.deleteStudentById(id);
	}

	public User login(String username, String password) throws ClassNotFoundException, SQLException {
		return repository.login(username, password);
	}

	public int createStudent(String fullname, String gender, Date birthday, String address, String numberPhone,
			String email, String username, String password, int faculty, Date createDate, double totalMoneyAvailable)
			throws ClassNotFoundException, SQLException {
		return repository.createStudent(fullname, gender, birthday, address, numberPhone, email, username, password,
				faculty, createDate, totalMoneyAvailable);
	}

	public boolean isUserExistsByUsername(String username) throws SQLException, ClassNotFoundException {
		return repository.isUserExistsByUsername(username);
	}

	public int changePasswordById(int id, String username, String password)
			throws ClassNotFoundException, SQLException {
		return repository.changePasswordById(id, username, password);
	}

}
