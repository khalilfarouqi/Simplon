import java.sql.SQLException;

public interface CRUD {
	
	public void Create() throws SQLException;
	public void Read() throws SQLException;
	public void Update() throws SQLException;
	public void Delete() throws SQLException;
	
}
