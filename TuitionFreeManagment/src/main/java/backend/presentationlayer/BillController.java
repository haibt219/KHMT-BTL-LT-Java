package backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import backend.businesslayer.BillService;
import backend.businesslayer.IBillService;
import entity.Bill;

public class BillController {
	private IBillService service;

	public BillController() throws FileNotFoundException, IOException {
		service = new BillService();
	}

	public List<Bill> getAllBIll() throws ClassNotFoundException, SQLException {
		return service.getAllBIll();
	}

	public Bill getBIllByUserId(int userId) throws ClassNotFoundException, SQLException {
		return service.getBIllByUserId(userId);
	}
}
