package macMatch;

public class Patient extends Member{
	
	//variables
	String typeOfCancer, remission, stage, mainTreatment, sportInterest, movieInterest,
	musicInterest, otherInterest, twitter, fb;
	
	//constructor
	public Patient(String userID, String title, String fname, String sname,
			String email, String password, String dOB, String gender,
			String typeOfCancer, String remission, String stage,
			String mainTreatment, String sportInterest, String movieInterest,
			String musicInterest, String otherInterest, String twitter,
			String fb) {
		super(userID, title, fname, sname, email, password, dOB, gender);
		this.typeOfCancer = typeOfCancer;
		this.remission = remission;
		this.stage = stage;
		this.mainTreatment = mainTreatment;
		this.sportInterest = sportInterest;
		this.movieInterest = movieInterest;
		this.musicInterest = musicInterest;
		this.otherInterest = otherInterest;
		this.twitter = twitter;
		this.fb = fb;
	}
	
	//getters
	public String getTypeOfCancer() {
		return typeOfCancer;
	}

	public String getRemission() {
		return remission;
	}

	public String getStage() {
		return stage;
	}

	public String getMainTreatment() {
		return mainTreatment;
	}

	public String getSportInterest() {
		return sportInterest;
	}

	public String getMovieInterest() {
		return movieInterest;
	}

	public String getMusicInterest() {
		return musicInterest;
	}

	public String getOtherInterest() {
		return otherInterest;
	}

	public String getTwitter() {
		return twitter;
	}

	public String getFb() {
		return fb;
	}
	
	//setters
	public void setTypeOfCancer(String typeOfCancer) {
		this.typeOfCancer = typeOfCancer;
	}

	public void setRemission(String remission) {
		this.remission = remission;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public void setMainTreatment(String mainTreatment) {
		this.mainTreatment = mainTreatment;
	}

	public void setSportInterest(String sportInterest) {
		this.sportInterest = sportInterest;
	}

	public void setMovieInterest(String movieInterest) {
		this.movieInterest = movieInterest;
	}

	public void setMusicInterest(String musicInterest) {
		this.musicInterest = musicInterest;
	}

	public void setOtherInterest(String otherInterest) {
		this.otherInterest = otherInterest;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public void setFb(String fb) {
		this.fb = fb;
	}

}
