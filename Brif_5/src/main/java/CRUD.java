import java.sql.SQLException;

public interface CRUD {
	
	public void Create(Candidat candid) throws SQLException;
	public void Read(Candidat candid) throws SQLException;
	public void Update() throws SQLException;
	public void Delete(Candidat candid) throws SQLException;
	
}
