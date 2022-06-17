package Models;

import java.time.LocalDate;

public class Info {
	
	private int ID_task;
	private int ID_User;
	private LocalDate Date_Insert;
	
	
	public int getID_task() {
		return ID_task;
	}
	public void setID_task(int iD_task) {
		ID_task = iD_task;
	}
	
	public int getID_User() {
		return ID_User;
	}
	public void setID_User(int iD_User) {
		ID_User = iD_User;
	}
	
	public LocalDate getDate_Insert() {
		return Date_Insert;
	}
	public void setDate_Insert(LocalDate date_Insert) {
		Date_Insert = date_Insert;
	}
	
	
	public Info() {}
	public Info(int iD_task, int iD_User, LocalDate date_Insert) {
		ID_task = iD_task;
		ID_User = iD_User;
		Date_Insert = date_Insert;
	}
	
	
	@Override
	public String toString() {
		return "Info [ID_task=" + ID_task + ", ID_User=" + ID_User + ", Date_Insert=" + Date_Insert + "]";
	}
	
	

}
