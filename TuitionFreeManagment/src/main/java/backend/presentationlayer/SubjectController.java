package backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.businesslayer.ISubjectService;
import backend.businesslayer.SubjectService;
import entity.Subject;

public class SubjectController {
	private ISubjectService service;

	public SubjectController() throws FileNotFoundException, IOException {
		service = new SubjectService();
	}

	public String[][] getAllSubject() throws ClassNotFoundException, SQLException {
		return service.getAllSubject();
	}

	public Subject getSubjectBySubjectName(String subjectName) throws ClassNotFoundException, SQLException {
		return service.getSubjectBySubjectName(subjectName);
	}

	public Subject getSubjectBySubjectId(int id) throws ClassNotFoundException, SQLException {
		return service.getSubjectBySubjectId(id);
	}

	public int createSubject(String subjectName, int signalNumber, double amountOfMoney)
			throws ClassNotFoundException, SQLException {
		return service.createSubject(subjectName, signalNumber, amountOfMoney);
	}

	public int deleteSubject(int id) throws ClassNotFoundException, SQLException {
		return service.deleteSubject(id);
	}

	public int updateSubjectById(int id, int signalNumber, double amountOfMoney)
			throws ClassNotFoundException, SQLException {
		return service.updateSubjectById(id, signalNumber, amountOfMoney);
	}
}
