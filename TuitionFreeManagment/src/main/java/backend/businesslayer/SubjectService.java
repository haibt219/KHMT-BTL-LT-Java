package backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import backend.datalayer.ISubjectRepository;
import backend.datalayer.SubjectRepository;
import entity.Subject;

public class SubjectService implements ISubjectService {
	private ISubjectRepository repository;

	public SubjectService() throws FileNotFoundException, IOException {
		repository = new SubjectRepository();
	}

	public List<Subject> getAllSubject() throws ClassNotFoundException, SQLException {
		return repository.getAllSubject();
	}

	public Subject getSubjectBySubjectName(String subjectName) throws ClassNotFoundException, SQLException {
		return repository.getSubjectBySubjectName(subjectName);
	}

	public Subject getSubjectBySubjectId(int id) throws ClassNotFoundException, SQLException {
		return repository.getSubjectBySubjectId(id);
	}

	public int createSubject(String subjectName, int signalNumber, double amountOfMoney)
			throws ClassNotFoundException, SQLException {
		return repository.createSubject(subjectName, signalNumber, amountOfMoney);
	}

	public int deleteSubject(int id) throws ClassNotFoundException, SQLException {
		return repository.deleteSubject(id);
	}

	public int updateSubjectById(int id) throws ClassNotFoundException, SQLException {
		return repository.updateSubjectById(id);
	}

}
