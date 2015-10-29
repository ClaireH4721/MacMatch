package macMatch;

public class Member {
	
	//variables
	private String userID, title, fname, sname, email, password, DOB, gender;
	
	//constructor
	public Member(String userID, String title, String fname, String sname,
			String email, String password, String dOB, String gender) {
		this.userID = userID;
		this.title = title;
		this.fname = fname;
		this.sname = sname;
		this.email = email;
		this.password = password;
		DOB = dOB;
		this.gender = gender;
	}
	
	//getters
	public String getUserID() {
		return userID;
	}

	public String getTitle() {
		return title;
	}

	public String getFname() {
		return fname;
	}

	public String getSname() {
		return sname;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getDOB() {
		return DOB;
	}

	public String getGender() {
		return gender;
	}
	
	//setters
	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
