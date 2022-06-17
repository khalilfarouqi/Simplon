package Models;

public class Users {

	private int ID_User;
	private String First_Name;
	private String Last_Name;
	private String User_Name;
	private String User_PassWord;
	
	
	public int getID_User() {
		return ID_User;
	}
	public void setID_User(int iD_User) {
		ID_User = iD_User;
	}
	
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	
	public String getUser_PassWord() {
		return User_PassWord;
	}
	public void setUser_PassWord(String user_PassWord) {
		User_PassWord = user_PassWord;
	}
	
	
	public Users() {}
	public Users(int iD_User, String first_Name, String last_Name, String user_Name, String user_PassWord) {
		ID_User = iD_User;
		First_Name = first_Name;
		Last_Name = last_Name;
		User_Name = user_Name;
		User_PassWord = user_PassWord;
	}
	
	@Override
	public String toString() {
		return "Users [ID_User=" + ID_User + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name
				+ ", User_Name=" + User_Name + ", User_PassWord=" + User_PassWord + "]";
	}
	
}
