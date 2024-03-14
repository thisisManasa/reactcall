package call.entities;

public class FormData {
	String Username;
	String email;
	String password;
	public FormData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FormData(String username, String email, String password) {
		super();
		Username = username;
		this.email = email;
		this.password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "FormData [Username=" + Username + ", email=" + email + ", password=" + password + "]";
	}
}
	