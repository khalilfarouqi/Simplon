package DAO_Pa;

import Classes.Candidat;

public interface DAO {
	
	public void Create(Candidat candid);
	public void Read(Candidat candid);
	public void Update(Candidat candid);
	public void Delete(Candidat candid);
	
}
