package backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import entity.Bill;

public interface IBillRepository {

	public List<Bill> getAllBIll() throws ClassNotFoundException, SQLException;

	public Bill getBIllByUserId(int userId) throws ClassNotFoundException, SQLException;
}
