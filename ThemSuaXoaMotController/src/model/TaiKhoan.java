package model;

public class TaiKhoan {
	public String user;
	public String password;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public TaiKhoan(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	@Override
	public String toString() {
		return "TaiKhoan [user=" + user + ", password=" + password + "]";
	}
}
