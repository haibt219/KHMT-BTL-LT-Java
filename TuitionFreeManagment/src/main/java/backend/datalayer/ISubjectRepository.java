package backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import entity.Subject;

public interface ISubjectRepository {
	public List<Subject> getAllSubject() throws ClassNotFoundException, SQLException;

	public Subject getSubjectBySubjectName(String subjectName) throws ClassNotFoundException, SQLException;

	public Subject getSubjectBySubjectId(int id) throws ClassNotFoundException, SQLException;

	public int createSubject(String subjectName, int signalNumber, double amountOfMoney)
			throws ClassNotFoundException, SQLException;

	public int deleteSubject(int id) throws ClassNotFoundException, SQLException;

	public int updateSubjectById(int id) throws ClassNotFoundException, SQLException;

}
