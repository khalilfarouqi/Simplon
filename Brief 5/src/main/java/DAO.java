import java.sql.SQLException;

public interface DAO {
	
	public void Create(Candidat candid) throws SQLException;
	public void Read(Candidat candid) throws SQLException;
	public void Update(Candidat candid) throws SQLException;
	public void Delete(Candidat candid) throws SQLException;
	
}
