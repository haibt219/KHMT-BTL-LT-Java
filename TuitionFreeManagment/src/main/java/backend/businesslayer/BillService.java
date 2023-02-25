package backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import backend.datalayer.BillRepository;
import backend.datalayer.IBillRepository;
import entity.Bill;

public class BillService implements IBillService {
	private IBillRepository repository;

	public BillService() throws FileNotFoundException, IOException {
		repository = new BillRepository();
	}

	public List<Bill> getAllBIll() throws ClassNotFoundException, SQLException {
		return repository.getAllBIll();
	}

	public Bill getBIllByUserId(int userId) throws ClassNotFoundException, SQLException {
		return repository.getBIllByUserId(userId);
	}

}
