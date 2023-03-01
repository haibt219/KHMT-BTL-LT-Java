package backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.datalayer.ISubjectRepository;
import backend.datalayer.SubjectRepository;
import entity.Subject;

public class SubjectService implements ISubjectService {
	private ISubjectRepository repository;

	public SubjectService() throws FileNotFoundException, IOException {
		repository = new SubjectRepository();
	}

	@Override
	public String[][] getAllSubject() throws ClassNotFoundException, SQLException {
		return repository.getAllSubject();
	}

	@Override
	public Subject getSubjectBySubjectName(String subjectName) throws ClassNotFoundException, SQLException {
		return repository.getSubjectBySubjectName(subjectName);
	}

	@Override
	public Subject getSubjectBySubjectId(int id) throws ClassNotFoundException, SQLException {
		return repository.getSubjectBySubjectId(id);
	}

	@Override
	public int createSubject(String subjectName, int signalNumber, double amountOfMoney)
			throws ClassNotFoundException, SQLException {
		return repository.createSubject(subjectName, signalNumber, amountOfMoney);
	}

	@Override
	public int deleteSubject(int id) throws ClassNotFoundException, SQLException {
		return repository.deleteSubject(id);
	}

	@Override
	public int updateSubjectById(int id, int signalNumber, double amountOfMoney)
			throws ClassNotFoundException, SQLException {
		return repository.updateSubjectById(id, signalNumber, amountOfMoney);
	}

}
