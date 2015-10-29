package macMatch;

public class MedicalProf extends Member {
	
	//variables
	String role, specialist;
	
	//constructor
	public MedicalProf(String userID, String title, String fname, String sname,
			String email, String password, String dOB, String gender,
			String role, String specialist) {
		super(userID, title, fname, sname, email, password, dOB, gender);
		this.role = role;
		this.specialist = specialist;
	}
	
	//getters
	public String getRole() {
		return role;
	}

	public String getSpecialist() {
		return specialist;
	}
	
	//setters
	public void setRole(String role) {
		this.role = role;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

}
